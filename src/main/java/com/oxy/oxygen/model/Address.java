package com.oxy.oxygen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "ADDRESS")
@XmlRootElement
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addressId;
	
	@NotNull
	private String city;

	@NotNull
	private String state;

	@NotNull
	private String country;

	@ManyToOne
	@JoinColumn
	private User user;

	public Long getAddressId() {
		return addressId;
	}

	public String getCity() {
		return city;
	}
	
	public String getCountry() {
		return country;
	}

	public String getState() {
		return state;
	}

	public User getUser() {
		return user;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
