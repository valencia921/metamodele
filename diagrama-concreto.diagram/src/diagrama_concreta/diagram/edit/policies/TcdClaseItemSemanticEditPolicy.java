/*
* 
*/
package diagrama_concreta.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TcdClaseItemSemanticEditPolicy
		extends diagrama_concreta.diagram.edit.policies.Diagrama_concretaBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TcdClaseItemSemanticEditPolicy() {
		super(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdClase_2001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(
					incomingLink) == diagrama_concreta.diagram.edit.parts.TcdAsociacionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(
					incomingLink) == diagrama_concreta.diagram.edit.parts.TcdComposicionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(
					incomingLink) == diagrama_concreta.diagram.edit.parts.TcdDependenciaEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getVisualID(incomingLink) == diagrama_concreta.diagram.edit.parts.TcdHerenciaEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(
					incomingLink) == diagrama_concreta.diagram.edit.parts.TcdAgregacionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(
					outgoingLink) == diagrama_concreta.diagram.edit.parts.TcdAsociacionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(
					outgoingLink) == diagrama_concreta.diagram.edit.parts.TcdComposicionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(
					outgoingLink) == diagrama_concreta.diagram.edit.parts.TcdDependenciaEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry
					.getVisualID(outgoingLink) == diagrama_concreta.diagram.edit.parts.TcdHerenciaEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(
					outgoingLink) == diagrama_concreta.diagram.edit.parts.TcdAgregacionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	* @generated
	*/
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(node)) {
			case diagrama_concreta.diagram.edit.parts.TcdClaseTcdClaseListaAtributosCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(cnode)) {
					case diagrama_concreta.diagram.edit.parts.TcdAtributoEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case diagrama_concreta.diagram.edit.parts.TcdClaseTcdClaseListaMetodosCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(cnode)) {
					case diagrama_concreta.diagram.edit.parts.TcdMetodoEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAsociacion_4001 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TcdAsociacionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdComposicion_4002 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TcdComposicionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdDependencia_4003 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TcdDependenciaCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdHerencia_4004 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TcdHerenciaCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAgregacion_4005 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TcdAgregacionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAsociacion_4001 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TcdAsociacionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdComposicion_4002 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TcdComposicionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdDependencia_4003 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TcdDependenciaCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdHerencia_4004 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TcdHerenciaCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAgregacion_4005 == req
				.getElementType()) {
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TcdAgregacionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case diagrama_concreta.diagram.edit.parts.TcdAsociacionEditPart.VISUAL_ID:
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TcdAsociacionReorientCommand(req));
		case diagrama_concreta.diagram.edit.parts.TcdComposicionEditPart.VISUAL_ID:
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TcdComposicionReorientCommand(req));
		case diagrama_concreta.diagram.edit.parts.TcdDependenciaEditPart.VISUAL_ID:
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TcdDependenciaReorientCommand(req));
		case diagrama_concreta.diagram.edit.parts.TcdHerenciaEditPart.VISUAL_ID:
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TcdHerenciaReorientCommand(req));
		case diagrama_concreta.diagram.edit.parts.TcdAgregacionEditPart.VISUAL_ID:
			return getGEFWrapper(new diagrama_concreta.diagram.edit.commands.TcdAgregacionReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
