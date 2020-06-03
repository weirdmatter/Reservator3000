package edu.pucrs.verval.repositories;

import edu.pucrs.verval.entities.Collaborator;
import org.springframework.data.repository.CrudRepository;

public interface CollaboratorRepository extends CrudRepository<Collaborator, Integer>{

	Iterable<Collaborator> findAllCollaboratorsByResources(Integer resource_id);
	
}
