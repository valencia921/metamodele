/*
 * 
 */
package diagrama_concreta.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class Diagrama_concretaElementTypes {

	/**
	* @generated
	*/
	private Diagrama_concretaElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			diagrama_concreta.diagram.part.Diagrama_concretaDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType TcdDiagramaClases_1000 = getElementType(
			"diagrama-concreto.diagram.TcdDiagramaClases_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TcdClase_2001 = getElementType("diagrama-concreto.diagram.TcdClase_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TcdAtributo_3001 = getElementType("diagrama-concreto.diagram.TcdAtributo_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TcdMetodo_3002 = getElementType("diagrama-concreto.diagram.TcdMetodo_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TcdAsociacion_4001 = getElementType(
			"diagrama-concreto.diagram.TcdAsociacion_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TcdComposicion_4002 = getElementType(
			"diagrama-concreto.diagram.TcdComposicion_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TcdDependencia_4003 = getElementType(
			"diagrama-concreto.diagram.TcdDependencia_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TcdHerencia_4004 = getElementType("diagrama-concreto.diagram.TcdHerencia_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TcdAgregacion_4005 = getElementType(
			"diagrama-concreto.diagram.TcdAgregacion_4005"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(TcdDiagramaClases_1000,
					diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTcdDiagramaClases());

			elements.put(TcdClase_2001, diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTcdClase());

			elements.put(TcdAtributo_3001, diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTcdAtributo());

			elements.put(TcdMetodo_3002, diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTcdMetodo());

			elements.put(TcdAsociacion_4001, diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTcdAsociacion());

			elements.put(TcdComposicion_4002, diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTcdComposicion());

			elements.put(TcdDependencia_4003, diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTcdDependencia());

			elements.put(TcdHerencia_4004, diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTcdHerencia());

			elements.put(TcdAgregacion_4005, diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTcdAgregacion());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(TcdDiagramaClases_1000);
			KNOWN_ELEMENT_TYPES.add(TcdClase_2001);
			KNOWN_ELEMENT_TYPES.add(TcdAtributo_3001);
			KNOWN_ELEMENT_TYPES.add(TcdMetodo_3002);
			KNOWN_ELEMENT_TYPES.add(TcdAsociacion_4001);
			KNOWN_ELEMENT_TYPES.add(TcdComposicion_4002);
			KNOWN_ELEMENT_TYPES.add(TcdDependencia_4003);
			KNOWN_ELEMENT_TYPES.add(TcdHerencia_4004);
			KNOWN_ELEMENT_TYPES.add(TcdAgregacion_4005);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case diagrama_concreta.diagram.edit.parts.TcdDiagramaClasesEditPart.VISUAL_ID:
			return TcdDiagramaClases_1000;
		case diagrama_concreta.diagram.edit.parts.TcdClaseEditPart.VISUAL_ID:
			return TcdClase_2001;
		case diagrama_concreta.diagram.edit.parts.TcdAtributoEditPart.VISUAL_ID:
			return TcdAtributo_3001;
		case diagrama_concreta.diagram.edit.parts.TcdMetodoEditPart.VISUAL_ID:
			return TcdMetodo_3002;
		case diagrama_concreta.diagram.edit.parts.TcdAsociacionEditPart.VISUAL_ID:
			return TcdAsociacion_4001;
		case diagrama_concreta.diagram.edit.parts.TcdComposicionEditPart.VISUAL_ID:
			return TcdComposicion_4002;
		case diagrama_concreta.diagram.edit.parts.TcdDependenciaEditPart.VISUAL_ID:
			return TcdDependencia_4003;
		case diagrama_concreta.diagram.edit.parts.TcdHerenciaEditPart.VISUAL_ID:
			return TcdHerencia_4004;
		case diagrama_concreta.diagram.edit.parts.TcdAgregacionEditPart.VISUAL_ID:
			return TcdAgregacion_4005;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.getElement(elementTypeAdapter);
		}
	};

}
