package org.homemade.testproject.repository;

import org.homemade.testproject.model.entites.product.ElementVariable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementVariableRepository extends
	JpaRepository<ElementVariable, Long>, JpaSpecificationExecutor<ElementVariable> {
}
