package org.homemade.testproject.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

/**
 * @author Dmytro Legeza
 */
@Service
public class UserIdGenerationService {

	public String getUUID() {
		return String.format("User: %s", UUID.randomUUID());
	}

}
