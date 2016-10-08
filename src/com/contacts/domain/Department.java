package com.contacts.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Set cdus = new HashSet(0);

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** minimal constructor */
	public Department(String name) {
		this.name = name;
	}

	/** full constructor */
	public Department(String name, Set cdus) {
		this.name = name;
		this.cdus = cdus;
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

	public Set getCdus() {
		return this.cdus;
	}

	public void setCdus(Set cdus) {
		this.cdus = cdus;
	}

}