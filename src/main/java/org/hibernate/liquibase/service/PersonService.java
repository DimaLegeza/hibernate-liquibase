package org.hibernate.liquibase.service;

import org.hibernate.liquibase.entities.Person;
import org.hibernate.liquibase.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Dima on 05.03.17.
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public void savePerson(final Person person) {
        personRepository.save(person);
    }

    public Person find(Long id) {
        return personRepository.findOne(id);
    }
}
