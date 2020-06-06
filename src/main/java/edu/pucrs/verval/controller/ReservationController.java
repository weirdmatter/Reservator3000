package edu.pucrs.verval.controller;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pucrs.verval.DTO.NewReservationDTO;
import edu.pucrs.verval.DTO.ResourcesDTO;
import edu.pucrs.verval.data.ReservationGen;
import edu.pucrs.verval.data.ReservationIdGen;
import edu.pucrs.verval.data.ResourceGen;
import edu.pucrs.verval.entities.DebugClass;
import edu.pucrs.verval.entities.Reservation;
import edu.pucrs.verval.entities.Resource;
import edu.pucrs.verval.utils.Utilitaries;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ReservationController {
	
	@PostMapping("/reservation/{resource_id}/collaborator/{collaborator_id}")
	public Boolean reserveResourceForCollaborator(@PathVariable("resource_id") Integer resource_id, @PathVariable("collaborator_id") Integer collaborator_id) {
		return true;
	}
	
	@PostMapping("/reservation")
	public Boolean reserveResourceForCollaborator(@RequestBody NewReservationDTO reservation) {
		
		Integer collaborator_id = reservation.getCollaborator_id();
		
		//List<Resource> wish_list = Utilitaries.convertResourcesDTOToResourceList(reservation.getResources());
		
		for(ResourcesDTO dto : reservation.getResources()) {
			
			Resource resource = ResourceGen.getInstance().getResources().get(dto.getResource_id());
			//Check most recent reservation with the chosen initial date.
			
			ArrayList<ArrayList<DebugClass>> all_items_reservations = ReservationGen.getInstance().getItem_date().get(resource.getId());
			
			if(all_items_reservations.size() == 0) {
				//Não há reservas para esse item.
				ArrayList<DebugClass> inner = new ArrayList<>();
				
				DebugClass info = new DebugClass(dto.getInitial_date(), dto.getEnd_date());
				Double total_cost = 0.0;
				
				total_cost = Utilitaries.calculateCostForReservation(resource, dto.getAmount(), dto.getInitial_date(), dto.getEnd_date());
				
				info.setCost(total_cost);
				resource.setAvailable_amount(resource.getAvailable_amount() - 1);
				
				inner.add(info);
				
				all_items_reservations.add(inner);
			} else {
				ArrayList<DebugClass> most_recent = all_items_reservations.get(all_items_reservations.size() - 1);
			}
			
			System.out.println(resource.toString());
			
			//if(Utilitaries.checkReservationDate(initial_date, end_date))
			
			
		}
		

	
		return true;
	}
	
	@GetMapping("/reservation/from/{initial_date}/to/{end_date}")
	public Boolean findAllReservationsBetweenDates(@PathVariable("initial_date") String initial_date, @PathVariable("end_date") String end_date) {
		//TODO - Check date
		
		return true;
	}


}
