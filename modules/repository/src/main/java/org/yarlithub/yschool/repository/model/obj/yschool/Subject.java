package org.yarlithub.yschool.repository.model.obj.yschool;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;
import org.yarlithub.yschool.repository.model.obj.yschool.ClassroomSubject;
import org.yarlithub.yschool.repository.model.obj.yschool.iface.ISubject;


/** 
 * Object mapping for hibernate-handled table: subject.
 * @author autogenerated
 */

@Entity
@Table(name = "subject", schema = "yschool")
public class Subject implements Cloneable, Serializable, IPojoGenEntity, ISubject {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558977406L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private Set<ClassroomSubject> classroomSubjects = new HashSet<ClassroomSubject>();

	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private Boolean isOptional;
	/** Field mapping. */
	private Date modifiedTime;
	/** Field mapping. */
	private String name;
	/** Field mapping. */
	private String subjectCode;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public Subject() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public Subject(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param id Integer object;
	 * @param modifiedTime Date object;
	 * @param name String object;
	 */
	public Subject(Integer id, Date modifiedTime, String name) {

		this.id = id;
		this.modifiedTime = modifiedTime;
		this.name = name;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return Subject.class;
	}
 

    /**
     * Return the value associated with the column: classroomSubject.
	 * @return A Set&lt;ClassroomSubject&gt; object (this.classroomSubject)
	 */
 	@OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "subjectIdsubject"  )
 	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@Column( nullable = false  )
	public Set<ClassroomSubject> getClassroomSubjects() {
		return this.classroomSubjects;
		
	}
	
	/**
	 * Adds a bi-directional link of type ClassroomSubject to the classroomSubjects set.
	 * @param classroomSubject item to add
	 */
	public void addClassroomSubject(ClassroomSubject classroomSubject) {
		classroomSubject.setSubjectIdsubject(this);
		this.classroomSubjects.add(classroomSubject);
	}

  
    /**  
     * Set the value related to the column: classroomSubject.
	 * @param classroomSubject the classroomSubject value you wish to set
	 */
	public void setClassroomSubjects(final Set<ClassroomSubject> classroomSubject) {
		this.classroomSubjects = classroomSubject;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic( optional = false )
	@Column( name = "idsubject", nullable = false  )
	public Integer getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Integer id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0) &&
				(id != null) &&
				(this.hashCode != null) ) {
		SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}

    /**
     * Return the value associated with the column: isOptional.
	 * @return A Boolean object (this.isOptional)
	 */
	@Basic( optional = true )
	@Column( name = "is_optional"  )
	public Boolean isIsOptional() {
		return this.isOptional;
		
	}
	

  
    /**  
     * Set the value related to the column: isOptional.
	 * @param isOptional the isOptional value you wish to set
	 */
	public void setIsOptional(final Boolean isOptional) {
		this.isOptional = isOptional;
	}

    /**
     * Return the value associated with the column: modifiedTime.
	 * @return A Date object (this.modifiedTime)
	 */
	@Basic( optional = false )
	@Column( name = "modified_time", nullable = false  )
	public Date getModifiedTime() {
		return this.modifiedTime;
		
	}
	

  
    /**  
     * Set the value related to the column: modifiedTime.
	 * @param modifiedTime the modifiedTime value you wish to set
	 */
	public void setModifiedTime(final Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

    /**
     * Return the value associated with the column: name.
	 * @return A String object (this.name)
	 */
	@Basic( optional = false )
	@Column( nullable = false, length = 45  )
	public String getName() {
		return this.name;
		
	}
	

  
    /**  
     * Set the value related to the column: name.
	 * @param name the name value you wish to set
	 */
	public void setName(final String name) {
		this.name = name;
	}

    /**
     * Return the value associated with the column: subjectCode.
	 * @return A String object (this.subjectCode)
	 */
	@Basic( optional = true )
	@Column( name = "subject_code", length = 45  )
	public String getSubjectCode() {
		return this.subjectCode;
		
	}
	

  
    /**  
     * Set the value related to the column: subjectCode.
	 * @param subjectCode the subjectCode value you wish to set
	 */
	public void setSubjectCode(final String subjectCode) {
		this.subjectCode = subjectCode;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public Subject clone() throws CloneNotSupportedException {
		
        final Subject copy = (Subject)super.clone();

		if (this.getClassroomSubjects() != null) {
			copy.getClassroomSubjects().addAll(this.getClassroomSubjects());
		}
		copy.setId(this.getId());
		copy.setIsOptional(this.isIsOptional());
		copy.setModifiedTime(this.getModifiedTime());
		copy.setName(this.getName());
		copy.setSubjectCode(this.getSubjectCode());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("id: " + this.getId() + ", ");
		sb.append("isOptional: " + this.isIsOptional() + ", ");
		sb.append("modifiedTime: " + this.getModifiedTime() + ", ");
		sb.append("name: " + this.getName() + ", ");
		sb.append("subjectCode: " + this.getSubjectCode());
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final Subject that; 
		try {
			that = (Subject) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((isIsOptional() == null) && (that.isIsOptional() == null)) || (isIsOptional() != null && isIsOptional().equals(that.isIsOptional())));
		result = result && (((getModifiedTime() == null) && (that.getModifiedTime() == null)) || (getModifiedTime() != null && getModifiedTime().equals(that.getModifiedTime())));
		result = result && (((getName() == null) && (that.getName() == null)) || (getName() != null && getName().equals(that.getName())));
		result = result && (((getSubjectCode() == null) && (that.getSubjectCode() == null)) || (getSubjectCode() != null && getSubjectCode().equals(that.getSubjectCode())));
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if ( this.hashCode == null ) {
			synchronized ( this ) {
				if ( this.hashCode == null ) {
					Integer newHashCode = null;

					if ( getId() != null ) {
					newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0) {
							newHashCode = getId();
						} else {

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
	return this.hashCode;
	}
	

	
}
