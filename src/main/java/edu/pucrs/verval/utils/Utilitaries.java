package edu.pucrs.verval.utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;

import edu.pucrs.verval.DTO.ResourcesDTO;
import edu.pucrs.verval.data.CollaboratorGen;
import edu.pucrs.verval.data.ReservationGen;
import edu.pucrs.verval.data.ResourceGen;
import edu.pucrs.verval.entities.Collaborator;
import edu.pucrs.verval.entities.Reservation;
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
	
	public static boolean checkReservationDate(LocalDate initial_date, LocalDate end_date) {
		Days diff = Days.daysBetween(initial_date, end_date);

		//end = new DateTime("2020-05-10"), new DateTime("2020-05-09"));
		
		// end = 09/05/2020
		// initial = 10/05/2020
		
		// i want for day 04/05/2020
		// product is reserved till 07/05/2020
		
		// Return a difference bigger than 0, so the date is posterior to the most recent reservation
		
		return diff.getDays() > 0;
	}
	

	public static boolean reserveFurnitureDateCheck(Date initial_date, Date end_date) {
		
		long diff = end_date.getTime() - initial_date.getTime();
		int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
		return diffDays >= 4;
	}
	
	public static ArrayList<Resource> convertResourcesDTOToResourceList(List<ResourcesDTO> wish_list) {
		
		ArrayList<Resource> resources_wish_list = new ArrayList<>();
		
		for(ResourcesDTO r : wish_list) {
			resources_wish_list.add(ResourceGen.getInstance().getResources().get(r.getResource_id()));
		}
		
		return resources_wish_list;
	}
	
	public static Double calculateCostForReservation(Resource res, Integer quantity, LocalDate initialDate, LocalDate endDate) {
		Days diff = Days.daysBetween(initialDate, endDate);
		
		Double total = 0.0;
		
		switch(res.getType()) {
		case "ROOM":
			total = (((res.getPrice() * res.getRoom_size()) + (res.getPrice_per_seat() * res.getSeat_amount())) * quantity) * diff.getDays();  
			break;
		case "MOBILE_EQUIPMENT":
			total = (res.getPrice() * quantity) * (diff.getDays());
			break;
		case "FURNITURE":
			total = (res.getPrice() * quantity) * (diff.getDays());
			break;
		}
		
		return total;
	}
	
	
	
}
