package edu.pucrs.verval.entities;

public class Resource {
	
	private Integer id;
	
	private String  name;

	private String  code;

	private Integer available_amount;

	private Double  price;
	
	private String  type;

	private Double room_size;
	
	private Integer seat_amount;

	
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
		return this.id;
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
}
