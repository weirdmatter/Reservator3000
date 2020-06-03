package edu.pucrs.verval.DTO;

import java.sql.Date;

public class ResourcesDTO {
	
	private Integer resource_id;
	
	private Integer amount;
	
	private Double unity_price;
	
	private Date initial_date;
	
	private Date end_date;

	public Integer getResource_id() {
		return resource_id;
	}

	public void setResource_id(Integer resource_id) {
		this.resource_id = resource_id;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Double getUnity_price() {
		return unity_price;
	}

	public void setUnity_price(Double unity_price) {
		this.unity_price = unity_price;
	}

}
