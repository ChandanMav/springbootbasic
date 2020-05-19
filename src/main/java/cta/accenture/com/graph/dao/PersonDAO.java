package cta.accenture.com.graph.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cta.accenture.com.graph.model.Person;

@Repository
public interface PersonDAO extends CrudRepository<Person, Integer> {
	
	@Override
	List<Person> findAll();
	

}
