/*
* 
*/
package diagrama_concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TcdClaseTcdClaseListaAtributosCompartmentItemSemanticEditPolicy
		extends diagrama_concreta.diagram.edit.policies.Diagrama_concretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TcdClaseTcdClaseListaAtributosCompartmentItemSemanticEditPolicy() {
		super(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdClase_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAtributo_3001 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TcdAtributoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
