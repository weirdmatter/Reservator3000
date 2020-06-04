package edu.pucrs.verval.DTO;

import java.util.List;

import edu.pucrs.verval.entities.Resource;

public class NewReservationDTO {
	
	private Integer collaborator_id;
	
	private List<Resource> resources;

	public Integer getCollaborator_id() {
		return collaborator_id;
	}

	public void setCollaborator_id(Integer collaborator_id) {
		this.collaborator_id = collaborator_id;
	}

	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

}
