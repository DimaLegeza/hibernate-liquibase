package org.homemade.testproject.repository;

import org.homemade.testproject.entites.product.ElementVariable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ElementVariableRepository extends
	JpaRepository<ElementVariable, Long>, JpaSpecificationExecutor<ElementVariable> {
}
