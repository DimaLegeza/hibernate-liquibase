package org.homemade.testproject.entites.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
public class ElementVariable {

	@Id
	@GeneratedValue
	@ApiModelProperty(hidden = true)
	private Long id;

	/**
	 * name of the element
	 */
	private String name;

	/**
	 * default value of the element; if the user does not provide custom value, default value would be stored
	 */
	private BigDecimal defaultValue;

	/**
	 * mutable = true; means the value of the element is editable
	 * mutable = false; means the value of the element is NOT editable
	 */
	private Boolean mutable;
}
