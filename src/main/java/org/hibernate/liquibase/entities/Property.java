package org.hibernate.liquibase.entities;

import lombok.Getter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

/**
 * Created by Dima on 05.03.17.
 */
@Entity
@Table(name = "PROPERTY")
@Getter
@Audited(withModifiedFlag = true)
public class Property {

    @Id
    private long id;

    @Column
    private String address;

    @Column
    private String propertyType;

}
