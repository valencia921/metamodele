/*
 * 
 */
package diagrama_concreta.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TcdDependenciaEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4003;

	/**
	* @generated
	*/
	public TcdDependenciaEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new diagrama_concreta.diagram.edit.policies.TcdDependenciaItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new TcdDependenciaFigure();
	}

	/**
	* @generated
	*/
	public TcdDependenciaFigure getPrimaryShape() {
		return (TcdDependenciaFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class TcdDependenciaFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public TcdDependenciaFigure() {
			this.setLineWidth(2);

		}

	}

}
