package edu.pucrs.verval.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Resource {
	
	@Id 
	@GeneratedValue
	@Column(name = "resource_id")
	private Integer id;
	
	@Column(name = "name")
	private String  name;
	
	@Column(name = "code")
	private String  code;
	
	@Column(name = "available_amount")
	private Integer available_amount;
	
	@Column(name = "price") //nullable
	private Double  price;
	
	@Column(name = "type")
	private String  type;
	
	@Column(name = "room_size") //nullable
	private Double room_size;
	
	@Column(name = "seat_amount") //nullable
	private Integer seat_amount;
	
	@ManyToMany(mappedBy = "resources")
	private List<Collaborator> collaborators;
	
	@OneToMany(mappedBy = "resourceId")
	private List<Reservations> reservresour;
	
	public Resource(Integer id, String name, String code, Integer available_amount, Double price, String type,
			Double room_size, Integer seat_amount) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.available_amount = available_amount;
		this.price = price;
		this.type = type;
		this.room_size = room_size;
		this.seat_amount = seat_amount;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getAvailable_amount() {
		return available_amount;
	}

	public void setAvailable_amount(Integer available_amount) {
		this.available_amount = available_amount;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getRoom_size() {
		return room_size;
	}

	public void setRoom_size(Double room_size) {
		this.room_size = room_size;
	}

	public Integer getSeat_amount() {
		return seat_amount;
	}

	public void setSeat_amount(Integer seat_amount) {
		this.seat_amount = seat_amount;
	}

	public List<Collaborator> getCollaborators() {
		return collaborators;
	}

	public void setCollaborators(List<Collaborator> collaborators) {
		this.collaborators = collaborators;
	}

	public List<Reservations> getReservresour() {
		return reservresour;
	}

	public void setReservresour(List<Reservations> reservresour) {
		this.reservresour = reservresour;
	}

}
