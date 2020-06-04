package edu.pucrs.verval.utils;

import java.util.Date;
import java.util.List;

import edu.pucrs.verval.data.CollaboratorGen;
import edu.pucrs.verval.data.ResourceGen;
import edu.pucrs.verval.entities.Collaborator;
import edu.pucrs.verval.entities.Resource;

public class Utilitaries {
	
	public static boolean collaboratorExists(Integer collaborator_id) {
		List<Collaborator> collab = CollaboratorGen.getInstance().getCollaborators();
		
		for(Collaborator b : collab) {
			if(b.getId().equals(collaborator_id)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean resourceExists(List<Resource> resource_id) {
		List<Resource> resource = ResourceGen.getInstance().getResources();
		
		for(Resource r : resource) {
			if(r.getId().equals(resource_id)) {
				return true;
			}
		}
		
		return false;
	}

	public static boolean reserveFurniture(Integer furniture_id, Date initial_date, Date end_date) {
		
		long diff = end_date.getTime() - initial_date.getTime();
		 
		int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
		System.out.println("difference between days: " + diffDays);
		
		return true;
	}
	
	
	
}
