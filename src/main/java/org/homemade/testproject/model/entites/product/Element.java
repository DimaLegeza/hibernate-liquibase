package org.homemade.testproject.model.entites.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.envers.AuditMappedBy;
import org.hibernate.envers.Audited;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@Entity
@Audited
@Data
public class Element {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull(message = "nameCanNotBeEmpty")
	private String name;

	private String description;

	@AuditMappedBy(mappedBy = "element")
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "element")
	private Set<ElementVariable> elementVariables = new HashSet<>();

	public Element(String name, String description) {
		this.name = name;
		this.description = description;
	}
}
