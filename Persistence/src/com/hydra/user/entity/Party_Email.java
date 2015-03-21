package com.hydra.user.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Party_Email database table.
 * 
 */
@Entity
@Table(name="Party_Email")
@NamedQuery(name="Party_Email.findAll", query="SELECT p FROM Party_Email p")
public class Party_Email implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="email_id", unique=true, nullable=false, length=100)
	private String emailId;

	@Column(name="email_type", length=20)
	private String emailType;

	@Column(name="party_id", nullable=false, length=20)
	private String partyId;

	public Party_Email() {
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getEmailType() {
		return this.emailType;
	}

	public void setEmailType(String emailType) {
		this.emailType = emailType;
	}

	public String getPartyId() {
		return this.partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

}