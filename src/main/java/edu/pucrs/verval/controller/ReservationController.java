package edu.pucrs.verval.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pucrs.verval.DTO.NewReservationDTO;
import edu.pucrs.verval.entities.Reservations;
import edu.pucrs.verval.repositories.ReservationsRepository;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ReservationController {
	
	@Autowired
	private ReservationsRepository reservationRepository;
	
	@GetMapping("/reservation")
	public Iterable<Reservations> findAllReservations(){
		return this.reservationRepository.findAll();
	}
	
	@GetMapping("/reservation/{resource_id}")
	public Iterable<Reservations> findAllReservationsByResourceId(@PathVariable("resource_id") Integer resource_id){
		return this.reservationRepository.findAllReservationsByResourceId(resource_id);
	}
	
	@PostMapping("/reservation/{resource_id}/collaborator/{collaborator_id}")
	public Boolean reserveResourceForCollaborator(@PathVariable("resource_id") Integer resource_id, @PathVariable("collaborator_id") Integer collaborator_id) {
		return true;
	}
	
	@PostMapping("/reservation")
	public Boolean reserveResourceForCollaborator(@RequestBody NewReservationDTO reservation) {
		return true;
	}
	
	@GetMapping("/reservation/from/{initial_date}/to/{end_date}")
	public Boolean findAllReservationsBetweenDates(@PathVariable("initial_date") String initial_date, @PathVariable("end_date") String end_date) {
		//TODO - Check date
		
		return true;
	}


}
