package com.contacts.domain;

/**
 * CduId entity. @author MyEclipse Persistence Tools
 */

public class CduId implements java.io.Serializable {

	// Fields

	private Company company;
	private Department department;
	private User user;

	// Constructors

	/** default constructor */
	public CduId() {
	}

	/** full constructor */
	public CduId(Company company, Department department, User user) {
		this.company = company;
		this.department = department;
		this.user = user;
	}

	// Property accessors

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CduId))
			return false;
		CduId castOther = (CduId) other;

		return ((this.getCompany() == castOther.getCompany()) || (this
				.getCompany() != null && castOther.getCompany() != null && this
				.getCompany().equals(castOther.getCompany())))
				&& ((this.getDepartment() == castOther.getDepartment()) || (this
						.getDepartment() != null
						&& castOther.getDepartment() != null && this
						.getDepartment().equals(castOther.getDepartment())))
				&& ((this.getUser() == castOther.getUser()) || (this.getUser() != null
						&& castOther.getUser() != null && this.getUser()
						.equals(castOther.getUser())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCompany() == null ? 0 : this.getCompany().hashCode());
		result = 37
				* result
				+ (getDepartment() == null ? 0 : this.getDepartment()
						.hashCode());
		result = 37 * result
				+ (getUser() == null ? 0 : this.getUser().hashCode());
		return result;
	}

}