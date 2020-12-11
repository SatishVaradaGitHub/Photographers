package com.usersbooking.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID", nullable = false)
	private Integer userId;
	@Column(name = "NAME", nullable = false, length = 50)
	private String name;
	@Column(name = "CONTACT_NO", nullable = false, length = 50)
	private Long contactNo;
	@Column(name = "ADDRESS", nullable = false, length = 50)
	private String address;

	public User() {

	}

	public User(Integer userId) {
		this.userId = userId;
	}

	public User(Integer userId, String name, Long contactNo, String address) {
		this.userId = userId;
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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
