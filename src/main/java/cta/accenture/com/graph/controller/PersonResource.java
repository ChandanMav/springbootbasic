package cta.accenture.com.graph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cta.accenture.com.graph.model.Person;
import cta.accenture.com.graph.service.PersonService;

@RestController
@RequestMapping(value = "/persons")
public class PersonResource {
	@Autowired
	private PersonService personService;

	@PostMapping
	public Person addPerson(@RequestBody Person person) {
		return personService.addPerson(person);
	}

	@GetMapping
	public List<Person> getPersons() {
		return personService.getPersons();
	}

	@GetMapping(value = "/{personId}")
	public Person getPerson(@PathVariable("personId") int id) {
		return personService.getPerson(id);
	}

	@PutMapping(value = "/{personId}")
	public Person updatePerson(@PathVariable("personId") int id, @RequestBody Person person) {
		return personService.updatePerson(id, person);
	}

	@DeleteMapping(value = "/{personId}")
	public void deletePerson(@PathVariable("personId") int id) {
		personService.deletePerson(id);
	}

	
}
