package org.homemade.testproject.model.entites.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Audited
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = { "element" })
@EqualsAndHashCode(exclude = { "element" })
@JsonIgnoreProperties(ignoreUnknown = true, value = { "element" })
public class ElementVariable {

	@Id
	@GeneratedValue
	@ApiModelProperty(hidden = true)
	private Long id;

	private String name;

	private BigDecimal defaultValue;

	private Boolean mutable;

	@NotAudited
	@ManyToOne
	@JoinColumn(name = "element_id")
	private Element element;

	public ElementVariable(String name, BigDecimal defaultValue, Boolean mutable, Element element) {
		this.name = name;
		this.defaultValue = defaultValue;
		this.mutable = mutable;
		this.element = element;
	}

}
