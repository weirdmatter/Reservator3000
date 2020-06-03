package edu.pucrs.verval.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Collaborator {
	
	@Id 
	@GeneratedValue
	@Column(name = "collaborator_id")
	private Integer id;

	@Column(name = "registration")
	private String registration;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@ManyToMany(cascade = { 
	        CascadeType.PERSIST, 
	        CascadeType.MERGE
	    })
	    @JoinTable(name = "reservations",
	        joinColumns = @JoinColumn(name = "collaborator_id"),
	        inverseJoinColumns = @JoinColumn(name = "resource_id")
	    )
	private List<Resource> resources;
	
	@OneToMany(mappedBy = "collaboratorId")
	private List<Reservations> reservcollab;

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

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public List<Reservations> getReservcollab() {
		return reservcollab;
	}

	public void setReservcollab(List<Reservations> reservcollab) {
		this.reservcollab = reservcollab;
	}
	
}
