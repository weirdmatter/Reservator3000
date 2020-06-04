package edu.pucrs.verval.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pucrs.verval.data.ResourceGen;
import edu.pucrs.verval.entities.Resource;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ResourceController {
	
	@GetMapping("/resources")
	public Iterable<Resource> findAllResources() {
		return ResourceGen.getInstance().getResources();
	}
	
	@GetMapping("/resources/{type_of}")
	public Iterable<Resource> findAllResourcesByType(@PathVariable("type_of") String type_of) {
		
		type_of = type_of.toLowerCase();
		
		List<Resource> resource_by_type = new ArrayList<>();
		for(Resource r : ResourceGen.getInstance().getResources()) {
			if(r.getType().toLowerCase().equals(type_of)) {
				resource_by_type.add(r);
			}
		}
		
		return resource_by_type;
	}

}
