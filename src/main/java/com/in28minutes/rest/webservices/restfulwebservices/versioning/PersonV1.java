package com.in28minutes.rest.webservices.restfulwebservices.versioning;

public class PersonV1 {
	
	private String Name;

	public PersonV1(String name) {
		super();
		Name = name;
	}
	
	public PersonV1() {
		super();
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
