package org.homemade.testproject.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Dmytro Legeza
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PureElement {

	private Long id;

	private String name;

	private String description;

}
