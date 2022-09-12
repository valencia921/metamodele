/*
 * 
 */
package diagrama_concreta.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Diagrama_concretaParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser tcdClaseNombre_5003Parser;

	/**
	* @generated
	*/
	private IParser getTcdClaseNombre_5003Parser() {
		if (tcdClaseNombre_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTcdClase_Nombre() };
			diagrama_concreta.diagram.parsers.MessageFormatParser parser = new diagrama_concreta.diagram.parsers.MessageFormatParser(
					features);
			tcdClaseNombre_5003Parser = parser;
		}
		return tcdClaseNombre_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser tcdAtributoNombre_5001Parser;

	/**
	* @generated
	*/
	private IParser getTcdAtributoNombre_5001Parser() {
		if (tcdAtributoNombre_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTcdAtributo_Nombre() };
			diagrama_concreta.diagram.parsers.MessageFormatParser parser = new diagrama_concreta.diagram.parsers.MessageFormatParser(
					features);
			tcdAtributoNombre_5001Parser = parser;
		}
		return tcdAtributoNombre_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser tcdMetodoNombre_5002Parser;

	/**
	* @generated
	*/
	private IParser getTcdMetodoNombre_5002Parser() {
		if (tcdMetodoNombre_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTcdMetodo_Nombre() };
			diagrama_concreta.diagram.parsers.MessageFormatParser parser = new diagrama_concreta.diagram.parsers.MessageFormatParser(
					features);
			tcdMetodoNombre_5002Parser = parser;
		}
		return tcdMetodoNombre_5002Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case diagrama_concreta.diagram.edit.parts.TcdClaseNombreEditPart.VISUAL_ID:
			return getTcdClaseNombre_5003Parser();
		case diagrama_concreta.diagram.edit.parts.TcdAtributoNombreEditPart.VISUAL_ID:
			return getTcdAtributoNombre_5001Parser();
		case diagrama_concreta.diagram.edit.parts.TcdMetodoNombreEditPart.VISUAL_ID:
			return getTcdMetodoNombre_5002Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(diagrama_concreta.diagram.part.Diagrama_concretaVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
