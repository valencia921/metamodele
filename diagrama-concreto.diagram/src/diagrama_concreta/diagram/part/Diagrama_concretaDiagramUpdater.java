/*
* 
*/
package diagrama_concreta.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class Diagrama_concretaDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor> getSemanticChildren(View view) {
		switch (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(view)) {
		case diagrama_concreta.diagram.edit.parts.TcdDiagramaClasesEditPart.VISUAL_ID:
			return getTcdDiagramaClases_1000SemanticChildren(view);
		case diagrama_concreta.diagram.edit.parts.TcdClaseTcdClaseListaAtributosCompartmentEditPart.VISUAL_ID:
			return getTcdClaseTcdClaseListaAtributosCompartment_7001SemanticChildren(view);
		case diagrama_concreta.diagram.edit.parts.TcdClaseTcdClaseListaMetodosCompartmentEditPart.VISUAL_ID:
			return getTcdClaseTcdClaseListaMetodosCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor> getTcdDiagramaClases_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		diagrama_concreta.TcdDiagramaClases modelElement = (diagrama_concreta.TcdDiagramaClases) view.getElement();
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListaClases().iterator(); it.hasNext();) {
			diagrama_concreta.TcdClase childElement = (diagrama_concreta.TcdClase) it.next();
			int visualID = diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == diagrama_concreta.diagram.edit.parts.TcdClaseEditPart.VISUAL_ID) {
				result.add(new diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor> getTcdClaseTcdClaseListaAtributosCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		diagrama_concreta.TcdClase modelElement = (diagrama_concreta.TcdClase) containerView.getElement();
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListaAtributos().iterator(); it.hasNext();) {
			diagrama_concreta.TcdAtributo childElement = (diagrama_concreta.TcdAtributo) it.next();
			int visualID = diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == diagrama_concreta.diagram.edit.parts.TcdAtributoEditPart.VISUAL_ID) {
				result.add(new diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor> getTcdClaseTcdClaseListaMetodosCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		diagrama_concreta.TcdClase modelElement = (diagrama_concreta.TcdClase) containerView.getElement();
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor>();
		for (Iterator<?> it = modelElement.getListaMetodos().iterator(); it.hasNext();) {
			diagrama_concreta.TcdMetodo childElement = (diagrama_concreta.TcdMetodo) it.next();
			int visualID = diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == diagrama_concreta.diagram.edit.parts.TcdMetodoEditPart.VISUAL_ID) {
				result.add(new diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getContainedLinks(View view) {
		switch (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(view)) {
		case diagrama_concreta.diagram.edit.parts.TcdDiagramaClasesEditPart.VISUAL_ID:
			return getTcdDiagramaClases_1000ContainedLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdClaseEditPart.VISUAL_ID:
			return getTcdClase_2001ContainedLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdAtributoEditPart.VISUAL_ID:
			return getTcdAtributo_3001ContainedLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdMetodoEditPart.VISUAL_ID:
			return getTcdMetodo_3002ContainedLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdAsociacionEditPart.VISUAL_ID:
			return getTcdAsociacion_4001ContainedLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdComposicionEditPart.VISUAL_ID:
			return getTcdComposicion_4002ContainedLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdDependenciaEditPart.VISUAL_ID:
			return getTcdDependencia_4003ContainedLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdHerenciaEditPart.VISUAL_ID:
			return getTcdHerencia_4004ContainedLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdAgregacionEditPart.VISUAL_ID:
			return getTcdAgregacion_4005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getIncomingLinks(View view) {
		switch (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(view)) {
		case diagrama_concreta.diagram.edit.parts.TcdClaseEditPart.VISUAL_ID:
			return getTcdClase_2001IncomingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdAtributoEditPart.VISUAL_ID:
			return getTcdAtributo_3001IncomingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdMetodoEditPart.VISUAL_ID:
			return getTcdMetodo_3002IncomingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdAsociacionEditPart.VISUAL_ID:
			return getTcdAsociacion_4001IncomingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdComposicionEditPart.VISUAL_ID:
			return getTcdComposicion_4002IncomingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdDependenciaEditPart.VISUAL_ID:
			return getTcdDependencia_4003IncomingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdHerenciaEditPart.VISUAL_ID:
			return getTcdHerencia_4004IncomingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdAgregacionEditPart.VISUAL_ID:
			return getTcdAgregacion_4005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getOutgoingLinks(View view) {
		switch (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(view)) {
		case diagrama_concreta.diagram.edit.parts.TcdClaseEditPart.VISUAL_ID:
			return getTcdClase_2001OutgoingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdAtributoEditPart.VISUAL_ID:
			return getTcdAtributo_3001OutgoingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdMetodoEditPart.VISUAL_ID:
			return getTcdMetodo_3002OutgoingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdAsociacionEditPart.VISUAL_ID:
			return getTcdAsociacion_4001OutgoingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdComposicionEditPart.VISUAL_ID:
			return getTcdComposicion_4002OutgoingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdDependenciaEditPart.VISUAL_ID:
			return getTcdDependencia_4003OutgoingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdHerenciaEditPart.VISUAL_ID:
			return getTcdHerencia_4004OutgoingLinks(view);
		case diagrama_concreta.diagram.edit.parts.TcdAgregacionEditPart.VISUAL_ID:
			return getTcdAgregacion_4005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdDiagramaClases_1000ContainedLinks(
			View view) {
		diagrama_concreta.TcdDiagramaClases modelElement = (diagrama_concreta.TcdDiagramaClases) view.getElement();
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_TcdAsociacion_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_TcdComposicion_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_TcdDependencia_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_TcdHerencia_4004(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_TcdAgregacion_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdClase_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdAtributo_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdMetodo_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdAsociacion_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdComposicion_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdDependencia_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdHerencia_4004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdAgregacion_4005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdClase_2001IncomingLinks(
			View view) {
		diagrama_concreta.TcdClase modelElement = (diagrama_concreta.TcdClase) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_TcdAsociacion_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_TcdComposicion_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_TcdDependencia_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_TcdHerencia_4004(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_TcdAgregacion_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdAtributo_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdMetodo_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdAsociacion_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdComposicion_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdDependencia_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdHerencia_4004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdAgregacion_4005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdClase_2001OutgoingLinks(
			View view) {
		diagrama_concreta.TcdClase modelElement = (diagrama_concreta.TcdClase) view.getElement();
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_TcdAsociacion_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_TcdComposicion_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_TcdDependencia_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_TcdHerencia_4004(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_TcdAgregacion_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdAtributo_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdMetodo_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdAsociacion_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdComposicion_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdDependencia_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdHerencia_4004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getTcdAgregacion_4005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getContainedTypeModelFacetLinks_TcdAsociacion_4001(
			diagrama_concreta.TcdDiagramaClases container) {
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagrama_concreta.TcdAsociacion) {
				continue;
			}
			diagrama_concreta.TcdAsociacion link = (diagrama_concreta.TcdAsociacion) linkObject;
			if (diagrama_concreta.diagram.edit.parts.TcdAsociacionEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TcdClase dst = link.getTarget();
			diagrama_concreta.TcdClase src = link.getSource();
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, dst, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAsociacion_4001,
					diagrama_concreta.diagram.edit.parts.TcdAsociacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getContainedTypeModelFacetLinks_TcdComposicion_4002(
			diagrama_concreta.TcdDiagramaClases container) {
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagrama_concreta.TcdComposicion) {
				continue;
			}
			diagrama_concreta.TcdComposicion link = (diagrama_concreta.TcdComposicion) linkObject;
			if (diagrama_concreta.diagram.edit.parts.TcdComposicionEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TcdClase dst = link.getTarget();
			diagrama_concreta.TcdClase src = link.getSource();
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, dst, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdComposicion_4002,
					diagrama_concreta.diagram.edit.parts.TcdComposicionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getContainedTypeModelFacetLinks_TcdDependencia_4003(
			diagrama_concreta.TcdDiagramaClases container) {
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagrama_concreta.TcdDependencia) {
				continue;
			}
			diagrama_concreta.TcdDependencia link = (diagrama_concreta.TcdDependencia) linkObject;
			if (diagrama_concreta.diagram.edit.parts.TcdDependenciaEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TcdClase dst = link.getTarget();
			diagrama_concreta.TcdClase src = link.getSource();
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, dst, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdDependencia_4003,
					diagrama_concreta.diagram.edit.parts.TcdDependenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getContainedTypeModelFacetLinks_TcdHerencia_4004(
			diagrama_concreta.TcdDiagramaClases container) {
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagrama_concreta.TcdHerencia) {
				continue;
			}
			diagrama_concreta.TcdHerencia link = (diagrama_concreta.TcdHerencia) linkObject;
			if (diagrama_concreta.diagram.edit.parts.TcdHerenciaEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TcdClase dst = link.getTarget();
			diagrama_concreta.TcdClase src = link.getSource();
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, dst, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdHerencia_4004,
					diagrama_concreta.diagram.edit.parts.TcdHerenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getContainedTypeModelFacetLinks_TcdAgregacion_4005(
			diagrama_concreta.TcdDiagramaClases container) {
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagrama_concreta.TcdAgregacion) {
				continue;
			}
			diagrama_concreta.TcdAgregacion link = (diagrama_concreta.TcdAgregacion) linkObject;
			if (diagrama_concreta.diagram.edit.parts.TcdAgregacionEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TcdClase dst = link.getTarget();
			diagrama_concreta.TcdClase src = link.getSource();
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, dst, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAgregacion_4005,
					diagrama_concreta.diagram.edit.parts.TcdAgregacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getIncomingTypeModelFacetLinks_TcdAsociacion_4001(
			diagrama_concreta.TcdClase target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != diagrama_concreta.Diagrama_concretaPackage.eINSTANCE
					.getTcdRelacion_Target()
					|| false == setting.getEObject() instanceof diagrama_concreta.TcdAsociacion) {
				continue;
			}
			diagrama_concreta.TcdAsociacion link = (diagrama_concreta.TcdAsociacion) setting.getEObject();
			if (diagrama_concreta.diagram.edit.parts.TcdAsociacionEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TcdClase src = link.getSource();
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, target, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAsociacion_4001,
					diagrama_concreta.diagram.edit.parts.TcdAsociacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getIncomingTypeModelFacetLinks_TcdComposicion_4002(
			diagrama_concreta.TcdClase target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != diagrama_concreta.Diagrama_concretaPackage.eINSTANCE
					.getTcdRelacion_Target()
					|| false == setting.getEObject() instanceof diagrama_concreta.TcdComposicion) {
				continue;
			}
			diagrama_concreta.TcdComposicion link = (diagrama_concreta.TcdComposicion) setting.getEObject();
			if (diagrama_concreta.diagram.edit.parts.TcdComposicionEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TcdClase src = link.getSource();
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, target, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdComposicion_4002,
					diagrama_concreta.diagram.edit.parts.TcdComposicionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getIncomingTypeModelFacetLinks_TcdDependencia_4003(
			diagrama_concreta.TcdClase target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != diagrama_concreta.Diagrama_concretaPackage.eINSTANCE
					.getTcdRelacion_Target()
					|| false == setting.getEObject() instanceof diagrama_concreta.TcdDependencia) {
				continue;
			}
			diagrama_concreta.TcdDependencia link = (diagrama_concreta.TcdDependencia) setting.getEObject();
			if (diagrama_concreta.diagram.edit.parts.TcdDependenciaEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TcdClase src = link.getSource();
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, target, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdDependencia_4003,
					diagrama_concreta.diagram.edit.parts.TcdDependenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getIncomingTypeModelFacetLinks_TcdHerencia_4004(
			diagrama_concreta.TcdClase target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != diagrama_concreta.Diagrama_concretaPackage.eINSTANCE
					.getTcdRelacion_Target()
					|| false == setting.getEObject() instanceof diagrama_concreta.TcdHerencia) {
				continue;
			}
			diagrama_concreta.TcdHerencia link = (diagrama_concreta.TcdHerencia) setting.getEObject();
			if (diagrama_concreta.diagram.edit.parts.TcdHerenciaEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TcdClase src = link.getSource();
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, target, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdHerencia_4004,
					diagrama_concreta.diagram.edit.parts.TcdHerenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getIncomingTypeModelFacetLinks_TcdAgregacion_4005(
			diagrama_concreta.TcdClase target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != diagrama_concreta.Diagrama_concretaPackage.eINSTANCE
					.getTcdRelacion_Target()
					|| false == setting.getEObject() instanceof diagrama_concreta.TcdAgregacion) {
				continue;
			}
			diagrama_concreta.TcdAgregacion link = (diagrama_concreta.TcdAgregacion) setting.getEObject();
			if (diagrama_concreta.diagram.edit.parts.TcdAgregacionEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TcdClase src = link.getSource();
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, target, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAgregacion_4005,
					diagrama_concreta.diagram.edit.parts.TcdAgregacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getOutgoingTypeModelFacetLinks_TcdAsociacion_4001(
			diagrama_concreta.TcdClase source) {
		diagrama_concreta.TcdDiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof diagrama_concreta.TcdDiagramaClases) {
				container = (diagrama_concreta.TcdDiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagrama_concreta.TcdAsociacion) {
				continue;
			}
			diagrama_concreta.TcdAsociacion link = (diagrama_concreta.TcdAsociacion) linkObject;
			if (diagrama_concreta.diagram.edit.parts.TcdAsociacionEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TcdClase dst = link.getTarget();
			diagrama_concreta.TcdClase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, dst, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAsociacion_4001,
					diagrama_concreta.diagram.edit.parts.TcdAsociacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getOutgoingTypeModelFacetLinks_TcdComposicion_4002(
			diagrama_concreta.TcdClase source) {
		diagrama_concreta.TcdDiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof diagrama_concreta.TcdDiagramaClases) {
				container = (diagrama_concreta.TcdDiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagrama_concreta.TcdComposicion) {
				continue;
			}
			diagrama_concreta.TcdComposicion link = (diagrama_concreta.TcdComposicion) linkObject;
			if (diagrama_concreta.diagram.edit.parts.TcdComposicionEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TcdClase dst = link.getTarget();
			diagrama_concreta.TcdClase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, dst, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdComposicion_4002,
					diagrama_concreta.diagram.edit.parts.TcdComposicionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getOutgoingTypeModelFacetLinks_TcdDependencia_4003(
			diagrama_concreta.TcdClase source) {
		diagrama_concreta.TcdDiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof diagrama_concreta.TcdDiagramaClases) {
				container = (diagrama_concreta.TcdDiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagrama_concreta.TcdDependencia) {
				continue;
			}
			diagrama_concreta.TcdDependencia link = (diagrama_concreta.TcdDependencia) linkObject;
			if (diagrama_concreta.diagram.edit.parts.TcdDependenciaEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TcdClase dst = link.getTarget();
			diagrama_concreta.TcdClase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, dst, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdDependencia_4003,
					diagrama_concreta.diagram.edit.parts.TcdDependenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getOutgoingTypeModelFacetLinks_TcdHerencia_4004(
			diagrama_concreta.TcdClase source) {
		diagrama_concreta.TcdDiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof diagrama_concreta.TcdDiagramaClases) {
				container = (diagrama_concreta.TcdDiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagrama_concreta.TcdHerencia) {
				continue;
			}
			diagrama_concreta.TcdHerencia link = (diagrama_concreta.TcdHerencia) linkObject;
			if (diagrama_concreta.diagram.edit.parts.TcdHerenciaEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TcdClase dst = link.getTarget();
			diagrama_concreta.TcdClase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, dst, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdHerencia_4004,
					diagrama_concreta.diagram.edit.parts.TcdHerenciaEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getOutgoingTypeModelFacetLinks_TcdAgregacion_4005(
			diagrama_concreta.TcdClase source) {
		diagrama_concreta.TcdDiagramaClases container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof diagrama_concreta.TcdDiagramaClases) {
				container = (diagrama_concreta.TcdDiagramaClases) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> result = new LinkedList<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor>();
		for (Iterator<?> links = container.getListaRelaciones().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof diagrama_concreta.TcdAgregacion) {
				continue;
			}
			diagrama_concreta.TcdAgregacion link = (diagrama_concreta.TcdAgregacion) linkObject;
			if (diagrama_concreta.diagram.edit.parts.TcdAgregacionEditPart.VISUAL_ID != diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			diagrama_concreta.TcdClase dst = link.getTarget();
			diagrama_concreta.TcdClase src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor(src, dst, link,
					diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAgregacion_4005,
					diagrama_concreta.diagram.edit.parts.TcdAgregacionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<diagrama_concreta.diagram.part.Diagrama_concretaNodeDescriptor> getSemanticChildren(View view) {
			return Diagrama_concretaDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getContainedLinks(View view) {
			return Diagrama_concretaDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getIncomingLinks(View view) {
			return Diagrama_concretaDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<diagrama_concreta.diagram.part.Diagrama_concretaLinkDescriptor> getOutgoingLinks(View view) {
			return Diagrama_concretaDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
