package com.example.GymMembership;

import javax.persistence.*;

@Entity
public class Member {
	private Long id;
	private String fname;
	private String lname;
	private String date;
	private String gender;
	private String phone;
	private String email;
	private String address;
	private String membership;
	private String password;
	
	protected Member() {
	}

	protected Member(Long id, String fname, String lname, String date , String gender, String phone, 
			String email, String address, String membership, String password) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.date = date;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.membership = membership;
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getMembership() {
		return membership;
	}
	
	public void setMembership(String membership) {
		this.membership = membership;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

}