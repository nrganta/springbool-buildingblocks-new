package com.stacksimply.restservices.Hello;

public class UserDetails {
	

	public String fristName;
	public String lastName;
	public String city;
	public UserDetails(String fristName, String lastName, String city) {		
		this.fristName = fristName;
		this.lastName = lastName;
		this.city = city;
	}
	
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
    
	//ToString
	@Override
	public String toString() {
		return "UserDetails [fristName=" + fristName + ", lastName=" + lastName + ", city=" + city + "]";
	}
	
	
	

}
