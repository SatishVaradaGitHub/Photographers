package com.photography.photographers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PHOTOGRAPHER")
public class Photographer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PHOTOGRAPHER_ID", nullable = false)
	private Integer id;
	@Column(name = "NAME", nullable = false, length = 50)
	private String name;
	@Column(name = "CONTACT_NO", nullable = false)
	private Long contactNo;
	@Column(name = "ADDRESS", nullable = false)
	private String address;

	public Photographer() {
	}

	public Photographer(Integer id) {
		this.id = id;
	}

	public Photographer(Integer id, String name, Long contactNo, String address) {
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
