package org.homemade.testproject.repository;

import org.homemade.testproject.model.entites.product.Element;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ElementRepository extends
	JpaRepository<Element, Long>, JpaSpecificationExecutor<Element> {
}
