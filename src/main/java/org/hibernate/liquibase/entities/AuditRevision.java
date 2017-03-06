package org.hibernate.liquibase.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.envers.DefaultTrackingModifiedEntitiesRevisionEntity;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;

@RevisionEntity
final class AuditRevision extends DefaultTrackingModifiedEntitiesRevisionEntity {

	private AuditRevision() {}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@RevisionNumber
	private int id;

	@Override
	public int getId() {
		return id;
	}
}