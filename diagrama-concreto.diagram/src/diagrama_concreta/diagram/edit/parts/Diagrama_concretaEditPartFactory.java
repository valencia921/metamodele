/*
 * 
 */
package diagrama_concreta.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class Diagrama_concretaEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(view)) {

			case diagrama_concreta.diagram.edit.parts.TcdDiagramaClasesEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TcdDiagramaClasesEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TcdClaseEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TcdClaseEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TcdClaseNombreEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TcdClaseNombreEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TcdAtributoEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TcdAtributoEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TcdAtributoNombreEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TcdAtributoNombreEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TcdMetodoEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TcdMetodoEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TcdMetodoNombreEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TcdMetodoNombreEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TcdClaseTcdClaseListaAtributosCompartmentEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TcdClaseTcdClaseListaAtributosCompartmentEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TcdClaseTcdClaseListaMetodosCompartmentEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TcdClaseTcdClaseListaMetodosCompartmentEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TcdAsociacionEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TcdAsociacionEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TcdComposicionEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TcdComposicionEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TcdDependenciaEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TcdDependenciaEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TcdHerenciaEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TcdHerenciaEditPart(view);

			case diagrama_concreta.diagram.edit.parts.TcdAgregacionEditPart.VISUAL_ID:
				return new diagrama_concreta.diagram.edit.parts.TcdAgregacionEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
