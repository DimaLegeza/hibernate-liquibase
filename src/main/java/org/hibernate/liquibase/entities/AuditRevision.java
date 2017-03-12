package org.hibernate.liquibase.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.liquibase.entities.listener.InniOnRevisionListener;

import javax.persistence.Entity;

/**
 * @author: Alex Bowkun
 * @since: 08/03/2017
 */
@Entity
@Getter
@Setter
@org.hibernate.envers.RevisionEntity(InniOnRevisionListener.class)
public class AuditRevision extends DefaultRevisionEntity {

    private String objectName;

}
