package org.hibernate.liquibase.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

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
@Audited(withModifiedFlag = true)
public class Person {

    @Id
    private long id;

    @Column
    private String name;

    @Column
    private String surname;

    @OneToMany
    @JoinTable(name = "PROPERTY", joinColumns = @JoinColumn(name = "ID"))
    private List<Property> properties;

}
