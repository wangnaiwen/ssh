package com.contacts.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Company entity. @author MyEclipse Persistence Tools
 */

public class Company implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private String name;
	private String updatetime;
	private Set cdus = new HashSet(0);

	// Constructors

	/** default constructor */
	public Company() {
	}

	/** minimal constructor */
	public Company(String name, String updatetime) {
		this.name = name;
		this.updatetime = updatetime;
	}

	/** full constructor */
	public Company(User user, String name, String updatetime, Set cdus) {
		this.user = user;
		this.name = name;
		this.updatetime = updatetime;
		this.cdus = cdus;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}

	public Set getCdus() {
		return this.cdus;
	}

	public void setCdus(Set cdus) {
		this.cdus = cdus;
	}

}