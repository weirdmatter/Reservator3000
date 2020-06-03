package edu.pucrs.verval.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.data.annotation.CreatedDate;


@Table(uniqueConstraints = 
	@UniqueConstraint(columnNames= {"collaborator_id", "resource_id", "creation_date"}))
@Entity
public class Reservations {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "collaborator_id")
	private Collaborator collaboratorId;
	
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "resource_id")
	private Resource resourceId;
	
    @Column(name = "reservation_group_id")
    private Integer reservation_group_id;
	
	@CreatedDate
	@Column(name = "begin_date")
	private Date begin_date;
	
	@CreatedDate
	@Column(name = "end_date")
	private Date end_date;
	
	@CreatedDate
	@Column(name = "creation_date")
	private Date creation_date;
	
	
	
}
