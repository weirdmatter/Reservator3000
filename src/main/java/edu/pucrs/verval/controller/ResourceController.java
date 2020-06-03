package edu.pucrs.verval.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pucrs.verval.repositories.ReservationsRepository;
import edu.pucrs.verval.repositories.ResourceRepository;
import edu.pucrs.verval.data.ResourceGen;
import edu.pucrs.verval.entities.Reservations;
import edu.pucrs.verval.entities.Resource;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ResourceController {
	
	@Autowired
	private ResourceRepository resourceRepository;
	
	@GetMapping("/resources/collaborator/{collaborator_id}")
	public Iterable<Resource> findAllResourceByCollaborators(@PathVariable("collaborator_id") Integer collaborator_id){
		return this.resourceRepository.findAllResourceByCollaborators(collaborator_id);
	}
	
	@GetMapping("/debug")
	public Iterable<Resource> findDebug() {
		return ResourceGen.getInstance().getResources();
	}

}
