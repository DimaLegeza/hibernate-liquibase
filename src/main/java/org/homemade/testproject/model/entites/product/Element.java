package org.homemade.testproject.model.entites.product;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OptimisticLock;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

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

	@OptimisticLock(excluded = true)
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "element")
	private Set<ElementVariable> elementVariables = new HashSet<>();

	@Version
	@NotAudited
	@Column(name = "lock_version", columnDefinition = "integer DEFAULT 0", nullable = false)
	private long version = 0;

	public Element(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public Element(long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
}
