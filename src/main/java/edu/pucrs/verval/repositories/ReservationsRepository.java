package edu.pucrs.verval.repositories;

import org.springframework.data.repository.CrudRepository;

import edu.pucrs.verval.entities.Reservations;

public interface ReservationsRepository extends CrudRepository<Reservations, Integer> {
	Iterable<Reservations> findAllReservationsByResourceId(Integer resource_id);
	Iterable<Reservations> findAllReservationsByCollaboratorId(Integer collaborator_id);
}
