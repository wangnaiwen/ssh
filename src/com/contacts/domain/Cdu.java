package com.contacts.domain;

/**
 * Cdu entity. @author MyEclipse Persistence Tools
 */

public class Cdu implements java.io.Serializable {

	// Fields

	private CduId id;
	private String position;

	// Constructors

	/** default constructor */
	public Cdu() {
	}

	/** minimal constructor */
	public Cdu(CduId id) {
		this.id = id;
	}

	/** full constructor */
	public Cdu(CduId id, String position) {
		this.id = id;
		this.position = position;
	}

	// Property accessors

	public CduId getId() {
		return this.id;
	}

	public void setId(CduId id) {
		this.id = id;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}