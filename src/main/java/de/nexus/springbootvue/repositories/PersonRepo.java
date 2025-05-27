package de.nexus.springbootvue.repositories;

import de.nexus.springbootvue.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepo extends CrudRepository<Person, Long> {

    @Override
    List<Person> findAll();
}

