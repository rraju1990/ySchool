package org.yarlithub.yschool.model.obj.yschoolLite.iface;
import org.yarlithub.yschool.model.obj.yschoolLite.Classroom;
import org.yarlithub.yschool.model.obj.yschoolLite.Staff;
import org.yarlithub.yschool.model.obj.yschoolLite.Subject;


/** 
 * Object interface mapping for hibernate-handled table: Class_Staff.
 * @author autogenerated
 */

public interface IClassStaffPK {



    /**
     * Return the value associated with the column: classIdclass.
	 * @return A Classroom object (this.classIdclass)
	 */
	Classroom getClassIdclass();
	

  
    /**  
     * Set the value related to the column: classIdclass.
	 * @param classIdclass the classIdclass value you wish to set
	 */
	void setClassIdclass(final Classroom classIdclass);

    /**
     * Return the value associated with the column: staffIdstaff.
	 * @return A Staff object (this.staffIdstaff)
	 */
	Staff getStaffIdstaff();
	

  
    /**  
     * Set the value related to the column: staffIdstaff.
	 * @param staffIdstaff the staffIdstaff value you wish to set
	 */
	void setStaffIdstaff(final Staff staffIdstaff);

    /**
     * Return the value associated with the column: subjectIdsubject.
	 * @return A Subject object (this.subjectIdsubject)
	 */
	Subject getSubjectIdsubject();
	

  
    /**  
     * Set the value related to the column: subjectIdsubject.
	 * @param subjectIdsubject the subjectIdsubject value you wish to set
	 */
	void setSubjectIdsubject(final Subject subjectIdsubject);

	// end of interface
}