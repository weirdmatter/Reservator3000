package edu.pucrs.verval.entities;

public class Collaborator {
	
	private Integer id;

	private String registration;
	
	private String name;
	
	private String email;

	public Collaborator(Integer id, String registration, String name, String email) {
		super();
		this.id = id;
		this.registration = registration;
		this.name = name;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
