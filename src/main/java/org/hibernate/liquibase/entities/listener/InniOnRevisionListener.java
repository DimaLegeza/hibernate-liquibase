package org.hibernate.liquibase.entities.listener;

import org.hibernate.envers.RevisionListener;
import org.hibernate.liquibase.entities.AuditRevision;

/**
 * @author: Alex Bowkun
 * @since: 08/03/2017
 */
public class InniOnRevisionListener implements RevisionListener {
    @Override
    public void newRevision(Object revision) {
        AuditRevision revisionEntity = (AuditRevision) revision;
        revisionEntity.setObjectName("Bla, im here");
    }
}
