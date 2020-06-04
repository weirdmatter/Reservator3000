package edu.pucrs.verval.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pucrs.verval.DTO.NewReservationDTO;
import edu.pucrs.verval.data.ReservationGen;
import edu.pucrs.verval.data.ReservationIdGen;
import edu.pucrs.verval.entities.Reservation;

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

		Reservation re = new Reservation(
				ReservationIdGen.getInstance().get(), 
				collaborator_id, 
				reservation.getResources());
		
		ReservationGen.getInstance().getReservations().add(re);
		
		// Utilitaries.reserveFurniture(1, reservation.getResources().get(1).getInitial_date(), reservation.getResources().get(1).getEnd_date());
		
		//Check if equipments exists
		
		//Check if equipment can be reserved
		
		return true;
	}
	
	@GetMapping("/reservation/from/{initial_date}/to/{end_date}")
	public Boolean findAllReservationsBetweenDates(@PathVariable("initial_date") String initial_date, @PathVariable("end_date") String end_date) {
		//TODO - Check date
		
		return true;
	}


}
