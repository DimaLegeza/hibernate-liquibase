package org.hibernate.liquibase.repository;

import org.hibernate.liquibase.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Dima on 05.03.17.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
}
