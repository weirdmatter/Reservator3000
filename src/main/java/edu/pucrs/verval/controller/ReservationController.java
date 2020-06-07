package edu.pucrs.verval.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.pucrs.verval.DTO.NewReservationDTO;
import edu.pucrs.verval.DTO.ResourcesDTO;
import edu.pucrs.verval.data.CollaboratorGen;
import edu.pucrs.verval.data.ReservationGen;
import edu.pucrs.verval.data.ResourceGen;
import edu.pucrs.verval.entities.Collaborator;
import edu.pucrs.verval.entities.DebugClass;
import edu.pucrs.verval.entities.Resource;
import edu.pucrs.verval.utils.Utilitaries;

@RestController
@CrossOrigin
@RequestMapping("/api")

public class ReservationController {
		
	@PostMapping("/reservation")
	@ResponseBody
	public ResponseEntity reserveResourceForCollaborator(@RequestBody NewReservationDTO reservation) {
		
		HashMap<String, ArrayList<Integer>> success_and_failure = new HashMap<>();
		ArrayList<Integer> success = new ArrayList<>();
		ArrayList<Integer> failure = new ArrayList<>();
		
		Collaborator collaborator = CollaboratorGen.getInstance().getCollaborators().get(reservation.getCollaborator_id());
		
		for(ResourcesDTO dto : reservation.getResources()) {
			
			Resource resource = ResourceGen.getInstance().getResources().get(dto.getResource_id());
			
			//Check most recent reservation with the chosen initial date.
			ArrayList<ArrayList<DebugClass>> all_items_reservations = ReservationGen.getInstance().getItem_date().get(resource.getId());
			
			if(all_items_reservations.size() == 0) {
				
				//There is no reservations for this item.
				ArrayList<DebugClass> inner = new ArrayList<>();
				
				DebugClass info = new DebugClass(collaborator, dto.getInitial_date(), dto.getEnd_date());
				Double total_cost = 0.0;
				
				total_cost = Utilitaries.calculateCostForReservation(resource, dto.getAmount(), dto.getInitial_date(), dto.getEnd_date());
				
				info.setCost(total_cost);
				resource.setAvailable_amount(resource.getAvailable_amount() - 1);
				
				inner.add(info);
				
				all_items_reservations.add(inner);
				
				success.add(dto.getResource_id());
				
			} else {
				
				//There already is reservations for this item.
				//Starting total amount and date validations.
				ArrayList<DebugClass> most_recent = all_items_reservations.get(all_items_reservations.size() - 1);
				
				//Check if there is no problem with the selected date.
				if(Utilitaries.checkReservationDate(most_recent.get(most_recent.size() - 1).getEnd(), dto.getInitial_date())) {
					
					//If don't check if has available resources.
					if(Utilitaries.hasAvailableResource(resource)) {
					ArrayList<DebugClass> inner = new ArrayList<>();
					
					DebugClass info = new DebugClass(collaborator, dto.getInitial_date(), dto.getEnd_date());
					Double total_cost = 0.0;
					
					total_cost = Utilitaries.calculateCostForReservation(resource, dto.getAmount(), dto.getInitial_date(), dto.getEnd_date());
					
					info.setCost(total_cost);
					resource.setAvailable_amount(resource.getAvailable_amount() - 1);
					
					inner.add(info);
					
					all_items_reservations.add(inner);
					} else {
						System.out.println("Nao pode reservar - nao ha quantidade suficiente");
						success_and_failure.put("failure", failure);
						success_and_failure.put("success", success);
					}
					
				}else {
					System.out.println("NAO PODE RESERVAR - o periodo escolhido nao esta disponivel");
				}	
				
				failure.add(dto.getResource_id());
			}	
		}
		
		success_and_failure.put("failure", failure);
		success_and_failure.put("success", success);
		
		
		return ResponseEntity.ok().body("Suco");
	}
	
	@GetMapping("/reservation/from/{initial_date}/to/{end_date}")
	public Boolean findAllReservationsBetweenDates(@PathVariable("initial_date") String initial_date, @PathVariable("end_date") String end_date) {
		//TODO - Check date
		
		return true;
	}


}
