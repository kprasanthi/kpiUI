package com.ded.myapp.bean;

public class LDAPBean {
	
	String mail;
	String id;
	String lastName;
	String firstName;
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return "LDAPBean [mail=" + mail + ", id=" + id + ", lastName="
				+ lastName + ", firstName=" + firstName + "]";
	}
	
	
	

}
