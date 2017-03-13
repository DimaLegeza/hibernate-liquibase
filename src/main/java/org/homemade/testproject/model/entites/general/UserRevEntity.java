package org.homemade.testproject.model.entites.general;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.envers.DefaultTrackingModifiedEntitiesRevisionEntity;
import org.hibernate.envers.RevisionEntity;
import org.homemade.testproject.model.entites.general.listeners.UserRevisionListener;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Dmytro Legeza
 */
@Entity
@RevisionEntity(UserRevisionListener.class)
@AttributeOverrides({
	@AttributeOverride(name = "id", column = @Column(name = "rev")),
	@AttributeOverride(name = "timestamp", column = @Column(name = "revtstmp"))
})
@Table(name = "revinfo")
@Getter
@Setter
public final class UserRevEntity extends DefaultTrackingModifiedEntitiesRevisionEntity {

	private UserRevEntity() {}

	@Column
	private String userUUID;

}
