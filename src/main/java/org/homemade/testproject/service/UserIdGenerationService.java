package org.homemade.testproject.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

/**
 * @author Dmytro Legeza
 */
@Service
public class UserIdGenerationService {

	public UUID getUUID() {
		return UUID.randomUUID();
	}

}
