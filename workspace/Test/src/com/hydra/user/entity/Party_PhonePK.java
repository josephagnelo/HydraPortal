package com.hydra.user.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Party_Phone database table.
 * 
 */
@Embeddable
public class Party_PhonePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="party_id", unique=true, nullable=false, length=20)
	private String partyId;

	@Column(name="phone_no", unique=true, nullable=false, length=20)
	private String phoneNo;

	public Party_PhonePK() {
	}
	public String getPartyId() {
		return this.partyId;
	}
	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}
	public String getPhoneNo() {
		return this.phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Party_PhonePK)) {
			return false;
		}
		Party_PhonePK castOther = (Party_PhonePK)other;
		return 
			this.partyId.equals(castOther.partyId)
			&& this.phoneNo.equals(castOther.phoneNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.partyId.hashCode();
		hash = hash * prime + this.phoneNo.hashCode();
		
		return hash;
	}
}