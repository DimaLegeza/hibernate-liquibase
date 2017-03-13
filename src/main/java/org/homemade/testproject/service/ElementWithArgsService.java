package org.homemade.testproject.service;

import org.homemade.testproject.model.dto.Attr;
import org.homemade.testproject.model.entites.product.Element;
import org.homemade.testproject.model.entites.product.ElementVariable;
import org.homemade.testproject.repository.ElementRepository;
import org.homemade.testproject.repository.ElementVariableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.homemade.testproject.model.dto.ElementWithAttrs;

/**
 * @author Dmytro Legeza
 */
@Service
public class ElementWithArgsService {

	@Autowired
	private ElementRepository elementRepository;

	@Autowired
	private ElementVariableRepository elementVariableRepository;

	public Element persist(final ElementWithAttrs elementWithAttrs) {
		final Element elem = new Element(elementWithAttrs.getName(),
			elementWithAttrs.getDescription());
		elementRepository.save(elem);
		if (elementWithAttrs.getAttrs() != null) {
			for (final Attr attr : elementWithAttrs.getAttrs()) {
				final ElementVariable variable = new ElementVariable(attr.getName(),
					attr.getDefaultValue(),
					attr.getMutable(),
					elem);
				elementVariableRepository.save(variable);
				elem.getElementVariables().add(variable);
			}
		}
		return elem;
	}

	public ElementVariable persist(final Attr attr) {
		final ElementVariable variable = new ElementVariable(attr.getName(),
			attr.getDefaultValue(),
			attr.getMutable(),
			elementRepository.findOne(attr.getElementId()));
		elementVariableRepository.save(variable);
		return variable;
	}

}
