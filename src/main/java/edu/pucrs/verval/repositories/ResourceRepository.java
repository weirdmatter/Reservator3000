package edu.pucrs.verval.repositories;

import edu.pucrs.verval.entities.Resource;
import org.springframework.data.repository.CrudRepository;

public interface ResourceRepository extends CrudRepository<Resource, Integer> {

	Iterable<Resource> findAllResourceByCollaborators(Integer collaborator_id);
	
}
