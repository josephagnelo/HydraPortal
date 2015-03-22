package com.hydra.user.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Party_Phone database table.
 * 
 */
@Entity
@Table(name="Party_Phone")
@NamedQuery(name="Party_Phone.findAll", query="SELECT p FROM Party_Phone p")
public class Party_Phone implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Party_PhonePK id;

	@Column(name="hrs_begin")
	private int hrsBegin;

	@Column(name="hrs_end")
	private int hrsEnd;

	@Column(name="phone_type", length=20)
	private String phoneType;

	public Party_Phone() {
	}

	public Party_PhonePK getId() {
		return this.id;
	}

	public void setId(Party_PhonePK id) {
		this.id = id;
	}

	public int getHrsBegin() {
		return this.hrsBegin;
	}

	public void setHrsBegin(int hrsBegin) {
		this.hrsBegin = hrsBegin;
	}

	public int getHrsEnd() {
		return this.hrsEnd;
	}

	public void setHrsEnd(int hrsEnd) {
		this.hrsEnd = hrsEnd;
	}

	public String getPhoneType() {
		return this.phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

}