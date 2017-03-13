package org.homemade.testproject.model.entites.general.listeners;

import org.hibernate.envers.RevisionListener;
import org.homemade.testproject.model.entites.general.UserRevEntity;
import org.homemade.testproject.service.UserIdGenerationService;
import org.homemade.testproject.spring.ContextLookup;

/**
 * @author Dmytro Legeza
 */
public class UserRevisionListener implements RevisionListener {

	@Override
	public void newRevision(Object revisionEntity) {
		final UserIdGenerationService service = ContextLookup.getBean(UserIdGenerationService.class);
		final UserRevEntity exampleRevEntity = (UserRevEntity) revisionEntity;
		exampleRevEntity.setUserUUID(service.getUUID());
	}

}
