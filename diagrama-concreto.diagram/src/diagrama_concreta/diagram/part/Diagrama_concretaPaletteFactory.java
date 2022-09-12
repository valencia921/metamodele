
/*
 * 
 */
package diagrama_concreta.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class Diagrama_concretaPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(diagrama_concreta.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createTcdAtributo1CreationTool());
		paletteContainer.add(createTcdClase2CreationTool());
		paletteContainer.add(createTcdMetodo3CreationTool());
		paletteContainer.add(createTcdPaquete4CreationTool());
		paletteContainer.add(createTcdParametro5CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				diagrama_concreta.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createTcdAgregacion1CreationTool());
		paletteContainer.add(createTcdAsociacion2CreationTool());
		paletteContainer.add(createTcdComposicion3CreationTool());
		paletteContainer.add(createTcdDependencia4CreationTool());
		paletteContainer.add(createTcdHerencia5CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createTcdAtributo1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				diagrama_concreta.diagram.part.Messages.TcdAtributo1CreationTool_title,
				diagrama_concreta.diagram.part.Messages.TcdAtributo1CreationTool_desc, Collections.singletonList(
						diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAtributo_3001));
		entry.setId("createTcdAtributo1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.getImageDescriptor(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAtributo_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTcdClase2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				diagrama_concreta.diagram.part.Messages.TcdClase2CreationTool_title,
				diagrama_concreta.diagram.part.Messages.TcdClase2CreationTool_desc, Collections.singletonList(
						diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdClase_2001));
		entry.setId("createTcdClase2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes
				.getImageDescriptor(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdClase_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTcdMetodo3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				diagrama_concreta.diagram.part.Messages.TcdMetodo3CreationTool_title,
				diagrama_concreta.diagram.part.Messages.TcdMetodo3CreationTool_desc, Collections.singletonList(
						diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdMetodo_3002));
		entry.setId("createTcdMetodo3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes
				.getImageDescriptor(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdMetodo_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTcdPaquete4CreationTool() {
		ToolEntry entry = new ToolEntry(diagrama_concreta.diagram.part.Messages.TcdPaquete4CreationTool_title,
				diagrama_concreta.diagram.part.Messages.TcdPaquete4CreationTool_desc, null, null) {
		};
		entry.setId("createTcdPaquete4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTcdParametro5CreationTool() {
		ToolEntry entry = new ToolEntry(diagrama_concreta.diagram.part.Messages.TcdParametro5CreationTool_title,
				diagrama_concreta.diagram.part.Messages.TcdParametro5CreationTool_desc, null, null) {
		};
		entry.setId("createTcdParametro5CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTcdAgregacion1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				diagrama_concreta.diagram.part.Messages.TcdAgregacion1CreationTool_title,
				diagrama_concreta.diagram.part.Messages.TcdAgregacion1CreationTool_desc, Collections.singletonList(
						diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAgregacion_4005));
		entry.setId("createTcdAgregacion1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.getImageDescriptor(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAgregacion_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTcdAsociacion2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				diagrama_concreta.diagram.part.Messages.TcdAsociacion2CreationTool_title,
				diagrama_concreta.diagram.part.Messages.TcdAsociacion2CreationTool_desc, Collections.singletonList(
						diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAsociacion_4001));
		entry.setId("createTcdAsociacion2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.getImageDescriptor(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdAsociacion_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTcdComposicion3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				diagrama_concreta.diagram.part.Messages.TcdComposicion3CreationTool_title,
				diagrama_concreta.diagram.part.Messages.TcdComposicion3CreationTool_desc, Collections.singletonList(
						diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdComposicion_4002));
		entry.setId("createTcdComposicion3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.getImageDescriptor(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdComposicion_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTcdDependencia4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				diagrama_concreta.diagram.part.Messages.TcdDependencia4CreationTool_title,
				diagrama_concreta.diagram.part.Messages.TcdDependencia4CreationTool_desc, Collections.singletonList(
						diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdDependencia_4003));
		entry.setId("createTcdDependencia4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.getImageDescriptor(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdDependencia_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTcdHerencia5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				diagrama_concreta.diagram.part.Messages.TcdHerencia5CreationTool_title,
				diagrama_concreta.diagram.part.Messages.TcdHerencia5CreationTool_desc, Collections.singletonList(
						diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdHerencia_4004));
		entry.setId("createTcdHerencia5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.getImageDescriptor(
				diagrama_concreta.diagram.providers.Diagrama_concretaElementTypes.TcdHerencia_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
