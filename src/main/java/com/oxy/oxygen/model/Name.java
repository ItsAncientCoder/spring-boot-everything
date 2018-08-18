package com.oxy.oxygen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "NAME")
public class Name {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;

	@NotNull
	private String name;

	public long getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public void setId(long id) {
		Id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
