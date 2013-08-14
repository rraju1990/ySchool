package org.yarlithub.yschool.model.dao.yschoolLite.impl;

import com.felees.hbnpojogen.persistence.impl.GenericHibernateDaoImpl;
import org.yarlithub.yschool.model.obj.yschoolLite.Exam;
import org.springframework.stereotype.Repository;
import org.yarlithub.yschool.model.dao.yschoolLite.ExamDao;
 
 
/**
 * DAO for table: Exam.
 * @author autogenerated
 */
@Repository
public class ExamDaoImpl extends GenericHibernateDaoImpl<Exam, Integer> implements ExamDao {
	
	/** Constructor method. */
		public ExamDaoImpl() {
			super(Exam.class);
		}
	}
