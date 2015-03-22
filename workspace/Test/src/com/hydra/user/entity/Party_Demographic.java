package com.hydra.user.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Party_Demographics database table.
 * 
 */
@Entity
@Table(name="Party_Demographics")
@NamedQuery(name="Party_Demographic.findAll", query="SELECT p FROM Party_Demographic p")
public class Party_Demographic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="party_id", unique=true, nullable=false, length=20)
	private String partyId;

	@Column(nullable=false)
	private int active;

	@Column(name="address_line_1", length=200)
	private String addressLine1;

	@Column(name="address_line_2", length=200)
	private String addressLine2;

	@Column(name="address_line_3", length=200)
	private String addressLine3;

	@Column(name="address_type", length=50)
	private String addressType;

	@Column(nullable=false, length=45)
	private String city;

	@Column(nullable=false, length=45)
	private String country;

	@Column(name="geo_loc", length=45)
	private String geoLoc;

	@Column(nullable=false, length=45)
	private String state;

	@Column(length=20)
	private String zipcode;

	public Party_Demographic() {
	}

	public String getPartyId() {
		return this.partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public int getActive() {
		return this.active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return this.addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGeoLoc() {
		return this.geoLoc;
	}

	public void setGeoLoc(String geoLoc) {
		this.geoLoc = geoLoc;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}