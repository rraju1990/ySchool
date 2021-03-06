package org.yarlithub.yschool.web.analytics;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.yarlithub.yschool.repository.model.obj.yschool.Student;

import javax.faces.bean.ManagedBean;
import java.io.Serializable;


/**
 * $LastChangedDate$
 * $LastChangedBy$
 * $LastChangedRevision$
 */

@ManagedBean
@Scope(value = "session")
@Controller
public class AnalyticsController implements Serializable {

    private Student student;
    private String stream;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCurrentStudent(Student student) {
        this.student = student;

    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public void setCurrentStream(String stream) {
        this.stream = stream;


    }
}
