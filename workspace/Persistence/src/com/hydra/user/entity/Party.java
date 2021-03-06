package com.hydra.user.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Party database table.
 * 
 */
@Entity
@Table(name="Party")
@NamedQuery(name="Party.findAll", query="SELECT p FROM Party p")
public class Party implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="party_id", unique=true, nullable=false, length=20)
	private String partyId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_mod_time", nullable=false)
	private Date lastModTime;

	@Column(name="party_dba_name", length=80)
	private String partyDbaName;

	@Column(name="party_first_name", length=40)
	private String partyFirstName;

	@Column(name="party_last_name", length=40)
	private String partyLastName;

	@Column(name="party_legal_name", length=80)
	private String partyLegalName;

	//bi-directional many-to-one association to PartyType
	@ManyToOne
	@JoinColumn(name="party_type_code", nullable=false)
	private PartyType partyType;

	public Party() {
	}

	public String getPartyId() {
		return this.partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public Date getLastModTime() {
		return this.lastModTime;
	}

	public void setLastModTime(Date lastModTime) {
		this.lastModTime = lastModTime;
	}

	public String getPartyDbaName() {
		return this.partyDbaName;
	}

	public void setPartyDbaName(String partyDbaName) {
		this.partyDbaName = partyDbaName;
	}

	public String getPartyFirstName() {
		return this.partyFirstName;
	}

	public void setPartyFirstName(String partyFirstName) {
		this.partyFirstName = partyFirstName;
	}

	public String getPartyLastName() {
		return this.partyLastName;
	}

	public void setPartyLastName(String partyLastName) {
		this.partyLastName = partyLastName;
	}

	public String getPartyLegalName() {
		return this.partyLegalName;
	}

	public void setPartyLegalName(String partyLegalName) {
		this.partyLegalName = partyLegalName;
	}

	public PartyType getPartyType() {
		return this.partyType;
	}

	public void setPartyType(PartyType partyType) {
		this.partyType = partyType;
	}

}