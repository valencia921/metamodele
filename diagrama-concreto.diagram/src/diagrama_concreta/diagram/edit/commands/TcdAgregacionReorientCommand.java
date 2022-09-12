/*
 * 
 */
package diagrama_concreta.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class TcdAgregacionReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public TcdAgregacionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof diagrama_concreta.TcdAgregacion) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof diagrama_concreta.TcdClase && newEnd instanceof diagrama_concreta.TcdClase)) {
			return false;
		}
		diagrama_concreta.TcdClase target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof diagrama_concreta.TcdDiagramaClases)) {
			return false;
		}
		diagrama_concreta.TcdDiagramaClases container = (diagrama_concreta.TcdDiagramaClases) getLink().eContainer();
		return diagrama_concreta.diagram.edit.policies.Diagrama_concretaBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTcdAgregacion_4005(container, getLink(), getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof diagrama_concreta.TcdClase && newEnd instanceof diagrama_concreta.TcdClase)) {
			return false;
		}
		diagrama_concreta.TcdClase source = getLink().getSource();
		if (!(getLink().eContainer() instanceof diagrama_concreta.TcdDiagramaClases)) {
			return false;
		}
		diagrama_concreta.TcdDiagramaClases container = (diagrama_concreta.TcdDiagramaClases) getLink().eContainer();
		return diagrama_concreta.diagram.edit.policies.Diagrama_concretaBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTcdAgregacion_4005(container, getLink(), source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected diagrama_concreta.TcdAgregacion getLink() {
		return (diagrama_concreta.TcdAgregacion) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected diagrama_concreta.TcdClase getOldSource() {
		return (diagrama_concreta.TcdClase) oldEnd;
	}

	/**
	* @generated
	*/
	protected diagrama_concreta.TcdClase getNewSource() {
		return (diagrama_concreta.TcdClase) newEnd;
	}

	/**
	* @generated
	*/
	protected diagrama_concreta.TcdClase getOldTarget() {
		return (diagrama_concreta.TcdClase) oldEnd;
	}

	/**
	* @generated
	*/
	protected diagrama_concreta.TcdClase getNewTarget() {
		return (diagrama_concreta.TcdClase) newEnd;
	}
}
