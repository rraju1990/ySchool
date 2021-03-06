package org.yarlithub.yschool.analytics.core;

//import com.arima.engine.*;

import com.arima.classanalyzer.analyzer.ProfileMatcher;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.yarlithub.yschool.repository.model.obj.yschool.ClassroomSubject;
import org.yarlithub.yschool.repository.model.obj.yschool.Student;
import org.yarlithub.yschool.repository.services.data.DataLayerYschool;
import org.yarlithub.yschool.repository.services.data.DataLayerYschoolImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Jay Krish
 * Date: 9/22/13
 * Time: 9:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class YAnalyzer {

    DataLayerYschool dataLayerYschool = DataLayerYschoolImpl.getInstance();

//    public List getOLSubjects(Student student){
//        DataLayerYschool dataLayerYschool = DataLayerYschoolImpl.getInstance();
//        Criteria c1=dataLayerYschool.createCriteria(ClassroomStudent.class).createCriteria("");
//        c1.add(Restrictions.eq("studentIdstudent",student));
//        List<ClassroomStudent> classroomStudents = c1.list();
//
//        Iterator<ClassroomStudent> classroomStudentIterator =classroomStudents.iterator();
//        while(classroomStudentIterator.hasNext()){
//            Hibernate.initialize(classroomStudentIterator.next().getStudentClassroomSubjects());
//            Hibernate.initialize((classroomStudentIterator.next().getClassroomIdclass()));
//                 }
    //  List<Classroom> lt= st.createAlias("classroom_student","clsu").createAlias("student","st").add(Restrictions.eq("st.idstudent","1")).list();
//          return null;
//
//    }

    public static void main(String[] args) {
        List<String> subjects = new ArrayList<String>();
        List<Integer> marks = new ArrayList<Integer>();
        ArrayList<Integer> addmissionNoList = new ArrayList<Integer>();

        subjects.add("SAIVISM");
        subjects.add("MATHEMATICS");
        subjects.add("SCIENCE AND TECHNOLOGY");
        subjects.add("TAMIL LANGUAGE");
        subjects.add("ENGLISH LANGUAGE");
        subjects.add("HISTORY");
       /* subjects.add("INFORMATION AND COMMUNICATION TECHNOLOGY");
        subjects.add("BUSSINESS AND ACCOUNTING");*/




        marks.add(50);
        marks.add(50);
        marks.add(50);
        marks.add(50);
        marks.add(50);
        marks.add(50);
        /*marks.add(50);
        marks.add(50);*/



        try {
            addmissionNoList = (ArrayList<Integer>) ProfileMatcher.getNearestLocalProfiles(11086, 11, 3, subjects, marks);
            System.out.println(addmissionNoList);

            Iterator<Integer> adminNoIterator = addmissionNoList.iterator();
            while (adminNoIterator.hasNext()) {

                int admissionNumber = adminNoIterator.next();


                System.out.println(admissionNumber);


            }


        } catch (Exception e) {


        }

    }

    public List<ClassroomSubject> getOLSubjects(Student student) {

        Criteria classroomSubjectCR = dataLayerYschool.createCriteria(ClassroomSubject.class);
        //student_classroom_subject data is not ready yet
        //classroomSubjectCR.createAlias("studentClassroomSubjects", "stclsu").createAlias("stclsu.classroomStudentIdclassroomStudent", "clst").add(Restrictions.eq("clst.studentIdstudent", student));
        //so using this as temporary ,but this may violate optional subject...
        classroomSubjectCR.createAlias("classroomIdclass", "cl").createAlias("cl.classroomStudents", "clst").add(Restrictions.eq("clst.studentIdstudent", student));

        classroomSubjectCR.add(Restrictions.eq("cl.grade", 10));
        List<ClassroomSubject> lt = classroomSubjectCR.list();

        return lt;
    }

    public List<Integer> getNeighbours() {

        List<String> subjects = new ArrayList<String>();
        List<Integer> marks = new ArrayList<Integer>();
        List<Integer> addmissionNoList = new ArrayList<Integer>();

        subjects.add("SAIVISM");
        subjects.add("MATHEMATICS");
        subjects.add("SCIENCE AND TECHNOLOGY");
        subjects.add("TAMIL LANGUAGE");
        subjects.add("ENGLISH LANGUAGE");
        subjects.add("HISTORY");
        /*subjects.add("INFORMATION AND COMMUNICATION TECHNOLOGY");
        subjects.add("BUSSINESS AND ACCOUNTING");*/


        marks.add(90);
        marks.add(90);
        marks.add(90);
        marks.add(90);
        marks.add(90);
        marks.add(90);
       /* marks.add(90);
        marks.add(90);*/


        try {
            addmissionNoList = ProfileMatcher.getNearestLocalProfiles(11086, 11, 3, subjects, marks);
            return addmissionNoList;

        } catch (Exception e) {
            return null;

        }

    }
}
