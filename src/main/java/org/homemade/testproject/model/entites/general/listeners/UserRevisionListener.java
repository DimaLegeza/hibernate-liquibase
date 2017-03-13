package org.homemade.testproject.model.entites.general.listeners;

import java.util.UUID;

import org.hibernate.envers.RevisionListener;
import org.homemade.testproject.model.entites.general.UserRevEntity;
import org.homemade.testproject.service.UserIdGenerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Dmytro Legeza
 */
@Component
public class UserRevisionListener implements RevisionListener {

	@Autowired
	private UserIdGenerationService service;

	@Override
	public void newRevision(Object revisionEntity) {
		UserRevEntity exampleRevEntity = (UserRevEntity) revisionEntity;
		exampleRevEntity.setUserUUID(UUID.randomUUID().toString());
	}
}
