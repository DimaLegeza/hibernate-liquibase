package org.hibernate.liquibase.rest;

import org.hibernate.liquibase.entities.Person;
import org.hibernate.liquibase.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Dima on 05.03.17.
 */
@Controller("/person")
public class PersonController {
    @Autowired
    private PersonService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Person getPerson(@RequestParam Long id) {
        return service.find(id);
    }

    @PostMapping
    @ResponseBody
    public String save(final Person person) {
        service.savePerson(person);
        return "saved";
    }
}
