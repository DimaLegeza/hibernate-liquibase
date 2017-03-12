package org.homemade.testproject.entites.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.validation.constraints.NotNull;

import org.hibernate.envers.Audited;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Audited
@Data
public class Element  {

	@Id
	@GeneratedValue
	private Long id;

	/**
	 * name of the element
	 */
	@NotNull(message = "nameCanNotBeEmpty")
	private String name;

	/**
	 * description of the element
	 */
	private String description;

	@OneToMany
	@JoinColumn(name = "element_variable_id", referencedColumnName = "id", table = "element_variable")
	@OrderBy(value = "sort_order")
	@NotNull(message = "elementCanNotBeEmpty")
	@ApiModelProperty(hidden = true)
	private Set<ElementVariable> elementVariables = new HashSet<>();
}
