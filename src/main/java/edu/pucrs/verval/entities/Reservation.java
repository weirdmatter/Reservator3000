package edu.pucrs.verval.entities;

import java.util.Date;
import java.util.List;

public class Reservation {

	private Integer id;
	
	private Integer collaboratorId;
	
	private List<Resource> resources;
	
	public Reservation(Integer id, Integer collaboratorId, List<Resource> resources) {
		super();
		this.id = id;
		this.collaboratorId = collaboratorId;
		this.resources = resources;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCollaboratorId() {
		return collaboratorId;
	}

	public void setCollaboratorId(Integer collaboratorId) {
		this.collaboratorId = collaboratorId;
	}
	
	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}
}
