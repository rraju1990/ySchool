package org.yarlithub.yschool.repository.model.obj.yschool;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import org.yarlithub.yschool.repository.model.obj.yschool.iface.ISectionHasStaffHasRolePK;


/** 
 * Object mapping for hibernate-handled table: section_has_staff_has_role.
 * @author autogenerated
 */

@Embeddable
public class SectionHasStaffHasRolePK implements Cloneable, Serializable,  ISectionHasStaffHasRolePK {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558977415L;

	

	/** Field mapping. */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "section_idsection", nullable = false , insertable = false, updatable = false )
	private Section sectionIdsection;

	/** Field mapping. */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "staff_has_role_idstaff_has_role", nullable = false , insertable = false, updatable = false )
	private StaffHasRole staffHasRoleIdstaffHasRole;

 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return SectionHasStaffHasRolePK.class;
	}
 

    /**
     * Return the value associated with the column: sectionIdsection.
	 * @return A Section object (this.sectionIdsection)
	 */
	public Section getSectionIdsection() {
		return this.sectionIdsection;
		
	}
	

  
    /**  
     * Set the value related to the column: sectionIdsection.
	 * @param sectionIdsection the sectionIdsection value you wish to set
	 */
	public void setSectionIdsection(final Section sectionIdsection) {
		this.sectionIdsection = sectionIdsection;
	}

    /**
     * Return the value associated with the column: staffHasRoleIdstaffHasRole.
	 * @return A StaffHasRole object (this.staffHasRoleIdstaffHasRole)
	 */
	public StaffHasRole getStaffHasRoleIdstaffHasRole() {
		return this.staffHasRoleIdstaffHasRole;
		
	}
	

  
    /**  
     * Set the value related to the column: staffHasRoleIdstaffHasRole.
	 * @param staffHasRoleIdstaffHasRole the staffHasRoleIdstaffHasRole value you wish to set
	 */
	public void setStaffHasRoleIdstaffHasRole(final StaffHasRole staffHasRoleIdstaffHasRole) {
		this.staffHasRoleIdstaffHasRole = staffHasRoleIdstaffHasRole;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public SectionHasStaffHasRolePK clone() throws CloneNotSupportedException {
		
        final SectionHasStaffHasRolePK copy = (SectionHasStaffHasRolePK)super.clone();

		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
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

		if (aThat == null)  {
			 return false;
		}
		
		final SectionHasStaffHasRolePK that; 
		try {
			that = (SectionHasStaffHasRolePK) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((getSectionIdsection() == null) && (that.getSectionIdsection() == null)) || (getSectionIdsection() != null && getSectionIdsection().getId().equals(that.getSectionIdsection().getId())));	
		result = result && (((getStaffHasRoleIdstaffHasRole() == null) && (that.getStaffHasRoleIdstaffHasRole() == null)) || (getStaffHasRoleIdstaffHasRole() != null && getStaffHasRoleIdstaffHasRole().getId().equals(that.getStaffHasRoleIdstaffHasRole().getId())));	
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
	int hash = 0;
		hash = hash + getSectionIdsection().hashCode();
		hash = hash + getStaffHasRoleIdstaffHasRole().hashCode();
	return hash;
	}
	

	
}
