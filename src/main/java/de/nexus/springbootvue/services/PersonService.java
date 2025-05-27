package de.nexus.springbootvue.services;

import de.nexus.springbootvue.entities.Person;
import de.nexus.springbootvue.repositories.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepo personRepo;

    @Autowired
    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public void savePerson(Person person) {
        personRepo.save(person);
    }

    public Person getPersonById(Long id) {
        return personRepo.findById(id).orElse(null);
    }

    public List<Person> getAllPersons() {
        return personRepo.findAll();
    }

    public void deletePerson(Long id) {
        personRepo.deleteById(id);
    }
}
