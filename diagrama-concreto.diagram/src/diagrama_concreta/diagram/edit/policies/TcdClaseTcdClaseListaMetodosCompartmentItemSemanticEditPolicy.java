/*
* 
*/
package diagrama_concreta.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TcdClaseTcdClaseListaMetodosCompartmentItemSemanticEditPolicy
		extends diagrama_concreta.diagram.edit.policies.Diagrama_concretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TcdClaseTcdClaseListaMetodosCompartmentItemSemanticEditPolicy() {
		super(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdClase_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdMetodo_3002 == req.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TcdMetodoCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
