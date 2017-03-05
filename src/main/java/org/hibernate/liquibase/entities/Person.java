package org.hibernate.liquibase.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Dima on 05.03.17.
 */
@Entity
@Table(name = "PERSON")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Person {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @Column
    private String surname;

    @OneToMany()
    private List<Property> properties;

}
