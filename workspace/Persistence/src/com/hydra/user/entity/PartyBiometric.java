package com.hydra.user.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Party_Biometric database table.
 * 
 */
@Entity
@Table(name="Party_Biometric")
@NamedQuery(name="PartyBiometric.findAll", query="SELECT p FROM PartyBiometric p")
public class PartyBiometric implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="party_id")
	private String partyId;

	@Column(name="biometric_data")
	private String biometricData;

	@Column(name="biometric_type")
	private String biometricType;

	public PartyBiometric() {
	}

	public String getPartyId() {
		return this.partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getBiometricData() {
		return this.biometricData;
	}

	public void setBiometricData(String biometricData) {
		this.biometricData = biometricData;
	}

	public String getBiometricType() {
		return this.biometricType;
	}

	public void setBiometricType(String biometricType) {
		this.biometricType = biometricType;
	}

}