/*
 * 
 */
package diagrama_concreta.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class Diagrama_concretaModelingAssistantProviderOfTcdClaseEditPart
		extends diagrama_concreta.diagram.providers.Diagrama_concretaModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((diagrama_concreta.diagram.edit.parts.TcdClaseEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(diagrama_concreta.diagram.edit.parts.TcdClaseEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAsociacion_4001);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdComposicion_4002);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdDependencia_4003);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdHerencia_4004);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAgregacion_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((diagrama_concreta.diagram.edit.parts.TcdClaseEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			diagrama_concreta.diagram.edit.parts.TcdClaseEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof diagrama_concreta.diagram.edit.parts.TcdClaseEditPart) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAsociacion_4001);
		}
		if (targetEditPart instanceof diagrama_concreta.diagram.edit.parts.TcdClaseEditPart) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdComposicion_4002);
		}
		if (targetEditPart instanceof diagrama_concreta.diagram.edit.parts.TcdClaseEditPart) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdDependencia_4003);
		}
		if (targetEditPart instanceof diagrama_concreta.diagram.edit.parts.TcdClaseEditPart) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdHerencia_4004);
		}
		if (targetEditPart instanceof diagrama_concreta.diagram.edit.parts.TcdClaseEditPart) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAgregacion_4005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((diagrama_concreta.diagram.edit.parts.TcdClaseEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(diagrama_concreta.diagram.edit.parts.TcdClaseEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAsociacion_4001) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdClase_2001);
		} else if (relationshipType == diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdComposicion_4002) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdClase_2001);
		} else if (relationshipType == diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdDependencia_4003) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdClase_2001);
		} else if (relationshipType == diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdHerencia_4004) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdClase_2001);
		} else if (relationshipType == diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAgregacion_4005) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdClase_2001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((diagrama_concreta.diagram.edit.parts.TcdClaseEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(diagrama_concreta.diagram.edit.parts.TcdClaseEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAsociacion_4001);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdComposicion_4002);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdDependencia_4003);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdHerencia_4004);
		types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAgregacion_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((diagrama_concreta.diagram.edit.parts.TcdClaseEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(diagrama_concreta.diagram.edit.parts.TcdClaseEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAsociacion_4001) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdClase_2001);
		} else if (relationshipType == diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdComposicion_4002) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdClase_2001);
		} else if (relationshipType == diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdDependencia_4003) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdClase_2001);
		} else if (relationshipType == diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdHerencia_4004) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdClase_2001);
		} else if (relationshipType == diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAgregacion_4005) {
			types.add(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdClase_2001);
		}
		return types;
	}

}
