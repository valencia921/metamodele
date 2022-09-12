/*
* 
*/
package diagrama_concreta.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class Diagrama_concretaNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem && !isOwnView(
				((diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorGroup) {
			diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorGroup group = (diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorGroup) element;
			return diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem) {
			diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem navigatorItem = (diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(view)) {
		case diagrama_concreta.diagram.edit.parts.TcdDiagramaClasesEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?diagrama_concreta?TcdDiagramaClases", //$NON-NLS-1$
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdDiagramaClases_1000);
		case diagrama_concreta.diagram.edit.parts.TcdClaseEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?diagrama_concreta?TcdClase", //$NON-NLS-1$
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdClase_2001);
		case diagrama_concreta.diagram.edit.parts.TcdAtributoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?diagrama_concreta?TcdAtributo", //$NON-NLS-1$
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAtributo_3001);
		case diagrama_concreta.diagram.edit.parts.TcdMetodoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?diagrama_concreta?TcdMetodo", //$NON-NLS-1$
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdMetodo_3002);
		case diagrama_concreta.diagram.edit.parts.TcdAsociacionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?diagrama_concreta?TcdAsociacion", //$NON-NLS-1$
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAsociacion_4001);
		case diagrama_concreta.diagram.edit.parts.TcdComposicionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?diagrama_concreta?TcdComposicion", //$NON-NLS-1$
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdComposicion_4002);
		case diagrama_concreta.diagram.edit.parts.TcdDependenciaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?diagrama_concreta?TcdDependencia", //$NON-NLS-1$
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdDependencia_4003);
		case diagrama_concreta.diagram.edit.parts.TcdHerenciaEditPart.VISUAL_ID:
			return getImage("Navigator?Link?diagrama_concreta?TcdHerencia", //$NON-NLS-1$
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdHerencia_4004);
		case diagrama_concreta.diagram.edit.parts.TcdAgregacionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?diagrama_concreta?TcdAgregacion", //$NON-NLS-1$
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAgregacion_4005);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.isKnownElementType(elementType)) {
			image = diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorGroup) {
			diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorGroup group = (diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem) {
			diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem navigatorItem = (diagrama_concreta.diagram.navigator.Diagrama_concretaNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(view)) {
		case diagrama_concreta.diagram.edit.parts.TcdDiagramaClasesEditPart.VISUAL_ID:
			return getTcdDiagramaClases_1000Text(view);
		case diagrama_concreta.diagram.edit.parts.TcdClaseEditPart.VISUAL_ID:
			return getTcdClase_2001Text(view);
		case diagrama_concreta.diagram.edit.parts.TcdAtributoEditPart.VISUAL_ID:
			return getTcdAtributo_3001Text(view);
		case diagrama_concreta.diagram.edit.parts.TcdMetodoEditPart.VISUAL_ID:
			return getTcdMetodo_3002Text(view);
		case diagrama_concreta.diagram.edit.parts.TcdAsociacionEditPart.VISUAL_ID:
			return getTcdAsociacion_4001Text(view);
		case diagrama_concreta.diagram.edit.parts.TcdComposicionEditPart.VISUAL_ID:
			return getTcdComposicion_4002Text(view);
		case diagrama_concreta.diagram.edit.parts.TcdDependenciaEditPart.VISUAL_ID:
			return getTcdDependencia_4003Text(view);
		case diagrama_concreta.diagram.edit.parts.TcdHerenciaEditPart.VISUAL_ID:
			return getTcdHerencia_4004Text(view);
		case diagrama_concreta.diagram.edit.parts.TcdAgregacionEditPart.VISUAL_ID:
			return getTcdAgregacion_4005Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getTcdDiagramaClases_1000Text(View view) {
		diagrama_concreta.TcdDiagramaClases domainModelElement = (diagrama_concreta.TcdDiagramaClases) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNombre();
		} else {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTcdClase_2001Text(View view) {
		IParser parser = diagrama_concreta.diagram.providers.Diagrama_concretaParserProvider.getParser(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdClase_2001,
				view.getElement() != null ? view.getElement() : view,
				diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
						.getType(diagrama_concreta.diagram.edit.parts.TcdClaseNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTcdAtributo_3001Text(View view) {
		IParser parser = diagrama_concreta.diagram.providers.Diagrama_concretaParserProvider.getParser(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAtributo_3001,
				view.getElement() != null ? view.getElement() : view,
				diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
						.getType(diagrama_concreta.diagram.edit.parts.TcdAtributoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTcdMetodo_3002Text(View view) {
		IParser parser = diagrama_concreta.diagram.providers.Diagrama_concretaParserProvider.getParser(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdMetodo_3002,
				view.getElement() != null ? view.getElement() : view,
				diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
						.getType(diagrama_concreta.diagram.edit.parts.TcdMetodoNombreEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTcdAsociacion_4001Text(View view) {
		diagrama_concreta.TcdAsociacion domainModelElement = (diagrama_concreta.TcdAsociacion) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNavegavilidad();
		} else {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTcdComposicion_4002Text(View view) {
		diagrama_concreta.TcdComposicion domainModelElement = (diagrama_concreta.TcdComposicion) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNavegavilidad();
		} else {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTcdDependencia_4003Text(View view) {
		diagrama_concreta.TcdDependencia domainModelElement = (diagrama_concreta.TcdDependencia) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNavegavilidad();
		} else {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTcdHerencia_4004Text(View view) {
		diagrama_concreta.TcdHerencia domainModelElement = (diagrama_concreta.TcdHerencia) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNavegavilidad();
		} else {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTcdAgregacion_4005Text(View view) {
		diagrama_concreta.TcdAgregacion domainModelElement = (diagrama_concreta.TcdAgregacion) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getNavegavilidad();
		} else {
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return diagrama_concreta.diagram.edit.parts.TcdDiagramaClasesEditPart.MODEL_ID
				.equals(diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getModelID(view));
	}

}
