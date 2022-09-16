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
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;

/**
 * @generated
 */
public class Diagrama_concretaParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser tCDClaseNombre_5003Parser;

	/**
	* @generated
	*/
	private IParser getTCDClaseNombre_5003Parser() {
		if (tCDClaseNombre_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTCDClase_Nombre() };
			diagrama_concreta.diagram.parsers.MessageFormatParser parser = new diagrama_concreta.diagram.parsers.MessageFormatParser(
					features);
			tCDClaseNombre_5003Parser = parser;
		}
		return tCDClaseNombre_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser tCDPaqueteNombre_5004Parser;

	/**
	* @generated
	*/
	private IParser getTCDPaqueteNombre_5004Parser() {
		if (tCDPaqueteNombre_5004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTCDPaquete_Nombre() };
			diagrama_concreta.diagram.parsers.MessageFormatParser parser = new diagrama_concreta.diagram.parsers.MessageFormatParser(
					features);
			tCDPaqueteNombre_5004Parser = parser;
		}
		return tCDPaqueteNombre_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser tCDAtributoNombreTipoDato_5001Parser;

	/**
	* @generated
	*/
	private IParser getTCDAtributoNombreTipoDato_5001Parser() {
		if (tCDAtributoNombreTipoDato_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTCDAtributo_Nombre(),
					diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTCDAtributo_TipoDato() };
			diagrama_concreta.diagram.parsers.MessageFormatParser parser = new diagrama_concreta.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			tCDAtributoNombreTipoDato_5001Parser = parser;
		}
		return tCDAtributoNombreTipoDato_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser tCDMetodoNombreTipoRetorno_5002Parser;

	/**
	* @generated
	*/
	private IParser getTCDMetodoNombreTipoRetorno_5002Parser() {
		if (tCDMetodoNombreTipoRetorno_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTCDMetodo_Nombre(),
					diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTCDMetodo_TipoRetorno() };
			diagrama_concreta.diagram.parsers.MessageFormatParser parser = new diagrama_concreta.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditorPattern("{0}: {1}"); //$NON-NLS-1$
			parser.setEditPattern("{0}: {1}"); //$NON-NLS-1$
			tCDMetodoNombreTipoRetorno_5002Parser = parser;
		}
		return tCDMetodoNombreTipoRetorno_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser tCDAgregacionNombreOrigen_6001Parser;

	/**
	* @generated
	*/
	private IParser getTCDAgregacionNombreOrigen_6001Parser() {
		if (tCDAgregacionNombreOrigen_6001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTCDAgregacion_NombreOrigen() };
			diagrama_concreta.diagram.parsers.MessageFormatParser parser = new diagrama_concreta.diagram.parsers.MessageFormatParser(
					features);
			tCDAgregacionNombreOrigen_6001Parser = parser;
		}
		return tCDAgregacionNombreOrigen_6001Parser;
	}

	/**
	* @generated
	*/
	private IParser tCDAsociacionNombreOrigen_6002Parser;

	/**
	* @generated
	*/
	private IParser getTCDAsociacionNombreOrigen_6002Parser() {
		if (tCDAsociacionNombreOrigen_6002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTCDAsociacion_NombreOrigen() };
			diagrama_concreta.diagram.parsers.MessageFormatParser parser = new diagrama_concreta.diagram.parsers.MessageFormatParser(
					features);
			tCDAsociacionNombreOrigen_6002Parser = parser;
		}
		return tCDAsociacionNombreOrigen_6002Parser;
	}

	/**
	* @generated
	*/
	private IParser tCDComposicionNombreOrigen_6003Parser;

	/**
	* @generated
	*/
	private IParser getTCDComposicionNombreOrigen_6003Parser() {
		if (tCDComposicionNombreOrigen_6003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTCDComposicion_NombreOrigen() };
			diagrama_concreta.diagram.parsers.MessageFormatParser parser = new diagrama_concreta.diagram.parsers.MessageFormatParser(
					features);
			tCDComposicionNombreOrigen_6003Parser = parser;
		}
		return tCDComposicionNombreOrigen_6003Parser;
	}

	/**
	* @generated
	*/
	private IParser tCDDependenciaNombreOrigen_6004Parser;

	/**
	* @generated
	*/
	private IParser getTCDDependenciaNombreOrigen_6004Parser() {
		if (tCDDependenciaNombreOrigen_6004Parser == null) {
			EAttribute[] features = new EAttribute[] {
					diagrama_concreta.Diagrama_concretaPackage.eINSTANCE.getTCDDependencia_NombreOrigen() };
			diagrama_concreta.diagram.parsers.MessageFormatParser parser = new diagrama_concreta.diagram.parsers.MessageFormatParser(
					features);
			tCDDependenciaNombreOrigen_6004Parser = parser;
		}
		return tCDDependenciaNombreOrigen_6004Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case diagrama_concreta.diagram.edit.parts.TCDClaseNombreEditPart.VISUAL_ID:
			return getTCDClaseNombre_5003Parser();
		case diagrama_concreta.diagram.edit.parts.TCDPaqueteNombreEditPart.VISUAL_ID:
			return getTCDPaqueteNombre_5004Parser();
		case diagrama_concreta.diagram.edit.parts.TCDAtributoNombreTipoDatoEditPart.VISUAL_ID:
			return getTCDAtributoNombreTipoDato_5001Parser();
		case diagrama_concreta.diagram.edit.parts.TCDMetodoNombreTipoRetornoEditPart.VISUAL_ID:
			return getTCDMetodoNombreTipoRetorno_5002Parser();
		case diagrama_concreta.diagram.edit.parts.TCDAgregacionNombreOrigenEditPart.VISUAL_ID:
			return getTCDAgregacionNombreOrigen_6001Parser();
		case diagrama_concreta.diagram.edit.parts.TCDAsociacionNombreOrigenEditPart.VISUAL_ID:
			return getTCDAsociacionNombreOrigen_6002Parser();
		case diagrama_concreta.diagram.edit.parts.TCDComposicionNombreOrigenEditPart.VISUAL_ID:
			return getTCDComposicionNombreOrigen_6003Parser();
		case diagrama_concreta.diagram.edit.parts.TCDDependenciaNombreOrigenEditPart.VISUAL_ID:
			return getTCDDependenciaNombreOrigen_6004Parser();
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
