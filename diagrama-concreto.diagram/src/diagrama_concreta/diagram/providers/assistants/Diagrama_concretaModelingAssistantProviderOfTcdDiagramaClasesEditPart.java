/*
 * 
 */
package diagrama_concreta.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Diagrama_concretaModelingAssistantProviderOfTcdDiagramaClasesEditPart
		extends diagrama_concreta.diagram.providers.Diagrama_concretaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdClase_2001);
		return types;
	}

}
