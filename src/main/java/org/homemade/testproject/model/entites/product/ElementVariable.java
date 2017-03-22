package org.homemade.testproject.model.entites.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Audited
@AllArgsConstructor
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

	@ManyToOne
	@JoinColumn(name = "element_id")
	private Element element;

	@Version
	@NotAudited
	@Column(name = "lock_version", columnDefinition = "integer DEFAULT 0", nullable = false)
	private long version = 0;

	public ElementVariable(String name, BigDecimal defaultValue, Boolean mutable, Element element) {
		this.name = name;
		this.defaultValue = defaultValue;
		this.mutable = mutable;
		this.element = element;
	}

	public ElementVariable(long id, String name, BigDecimal defaultValue, Boolean mutable, Element element) {
		this.id = id;
		this.name = name;
		this.defaultValue = defaultValue;
		this.mutable = mutable;
		this.element = element;
	}

}
