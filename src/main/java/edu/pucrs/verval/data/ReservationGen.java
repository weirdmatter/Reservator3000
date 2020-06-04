package edu.pucrs.verval.data;

import java.util.ArrayList;
import java.util.List;

import edu.pucrs.verval.entities.Reservation;

public class ReservationGen {

	private List<Reservation> reservations;
	
	private static ReservationGen instance = new ReservationGen();
	
	public ReservationGen() {
		this.reservations = new ArrayList<>();
	}
	
	public static ReservationGen getInstance() {
		return instance;
	}
	
	public List<Reservation> getReservations() {
		return this.reservations;
	}
	
}
