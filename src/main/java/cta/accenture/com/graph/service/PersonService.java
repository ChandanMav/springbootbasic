package cta.accenture.com.graph.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cta.accenture.com.graph.dao.PersonDAO;
import cta.accenture.com.graph.exception.PersonNotFoundException;
import cta.accenture.com.graph.model.Person;
import lombok.NonNull;

@Service
public class PersonService {

	@Autowired
	private PersonDAO personDAO;

	/*
	 * private List<Person> personList = new CopyOnWriteArrayList<>(); private int
	 * id = 1;
	 */

	public Person addPerson(@NonNull Person person) {
		/*
		 * person.setId(id); personList.add(person); this.id++;
		 */
		return personDAO.save(person);
		// return person;
	}

	public List<Person> getPersons() {

		return personDAO.findAll();

		// return personList;
	}

	public Person getPerson(int id) {

		Optional<Person> optionalPerson = personDAO.findById(id);

		if (!optionalPerson.isPresent()) {
			throw new PersonNotFoundException("Customer Record is not avialable");
		}

		return optionalPerson.get();
		// return this.personList.stream().filter(p -> p.getId() ==
		// id).findFirst().get();
	}

	public Person updatePerson(int id, @NonNull Person person) {
		/*
		 * this.personList.stream().forEach(p -> { if (p.getId() == id) {
		 * p.setName(person.getName()); p.setAge(person.getAge()); } });
		 * 
		 * return this.getPerson(id);
		 */
		// Here passing id along with object means update method will call
		person.setId(id);
		return personDAO.save(person);
	}

	public void deletePerson(int id) {
		/*
		 * this.personList.stream().forEach(p -> { if (p.getId() == id) {
		 * personList.remove(p); } });
		 */

		personDAO.deleteById(id);

	}

}
