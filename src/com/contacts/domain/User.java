package com.contacts.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String phone;
	private String phone2;
	private String email;
	private String password;
	private Set cdus = new HashSet(0);
	private Set companies = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String name, String phone, String password) {
		this.name = name;
		this.phone = phone;
		this.password = password;
	}

	/** full constructor */
	public User(String name, String phone, String phone2, String email,
			String password, Set cdus, Set companies) {
		this.name = name;
		this.phone = phone;
		this.phone2 = phone2;
		this.email = email;
		this.password = password;
		this.cdus = cdus;
		this.companies = companies;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone2() {
		return this.phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set getCdus() {
		return this.cdus;
	}

	public void setCdus(Set cdus) {
		this.cdus = cdus;
	}

	public Set getCompanies() {
		return this.companies;
	}

	public void setCompanies(Set companies) {
		this.companies = companies;
	}

}