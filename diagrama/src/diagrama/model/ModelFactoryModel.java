package diagrama.model;

import java.util.ArrayList;

import diagrama_concreta.Diagrama_concretaFactory;
import diagrama_concreta.Diagrama_concretaPackage;
import diagrama_concreta.ModelFactory;
import diagrama_concreta.TcdAgregacion;
import diagrama_concreta.TcdAsociacion;
import diagrama_concreta.TcdClase;
import diagrama_concreta.TcdComposicion;
import diagrama_concreta.TcdDependencia;
import diagrama_concreta.TcdDiagramaClases;
import diagrama_concreta.TcdHerencia;
import diagrama_concreta.TcdRelacion;

public class ModelFactoryModel {

	// ------------------------------ Singleton
	// ------------------------------------------------
	// Clase estatica oculta. Tan solo se instanciara el singleton una vez
	private static class SingletonHolder {
		// El constructor de Singleton puede ser llamado desde aquí al ser protected
		private final static ModelFactoryModel eINSTANCE = new ModelFactoryModel();
	}

	// Método para obtener la instancia de nuestra clase
	public static ModelFactoryModel getInstance() {
		return SingletonHolder.eINSTANCE;
	}

	// ------------------------------ Singleton
	// ------------------------------------------------
	ModelFactory modelFactory = Diagrama_concretaFactory.eINSTANCE.createModelFactory();

	public ModelFactoryModel() {
		// TODO Auto-generated constructor stub

		ModelFactory tempModelFactory = modelFactory;

		modelFactory = cargar();

		if (modelFactory == null) {
			modelFactory = tempModelFactory;

		}
	}

	public ModelFactory cargar() {
		ModelFactory modelFactory = null;

		Diagrama_concretaPackage whoownmePackage = Diagrama_concretaPackage.eINSTANCE;
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();

		// EXISTEN 3 FORMAS DE CARGAR EL RECURSO

		// 1. CON LA SIGUIENTE RUTA (platform:/resource) SE CARGAR EL RECURSO CUANDO SE
		// HACE UNA NUEVA INSTANCIA DE ECLIPSE, EN DONDE SE CREA UN PROYECTO(test)
		// QUE CONTIENE LAS PRODUCCIONES, DONDE SE ESPECIFICA QUE RECURSO CARGAR
		org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI
				.createURI("platform:/resource/test/src/model/Model.diagrama_concreta");

		// 2.CON LA SIGUIENTE RUTA (platform:/plugin/) SE CARGAR EL RECURSO DE ALGUNOS
		// DE LOS PLUGINS(whoownme.model) EN LOS QUE SE ESTA TRABJANDO EN EL WORKSPACE
		// org.eclipse.emf.common.util.URI uri =
		// org.eclipse.emf.common.util.URI.createURI("platform:/plugin/whoownme.model/resource/model.whoownme");

		// 3. CON LA SIGUIENTE RUTA (file:\\E:\\) SE CARGA EL RECURSO INDICANDO UNA RUTA
		// DESDE EL DIRECTORIO DE ARCHIVOS DE WIMDOWS
		// org.eclipse.emf.common.util.URI uri =
		// org.eclipse.emf.common.util.URI.createURI("file:\\E:\\varios\\td\\whoownme\\whoownme\\whoownme.model\\resource\\model.whoownme");

		org.eclipse.emf.ecore.resource.Resource resource = resourceSet.createResource(uri);

		try {
			resource.load(null);
			modelFactory = (ModelFactory) resource.getContents().get(0);
			System.out.println("loaded: " + modelFactory);
		} catch (java.io.IOException e) {
			System.out.println("failed to read " + uri);
			System.out.println(e);
		}
		return modelFactory;
	}

	/**
	 * 
	 */
	public void generarModelToModel() {
		// TODO Auto-generated method stub
		String nombre = "";
		TcdClase clase = obtenerClase(nombre);

		ArrayList<Object> listaRelaciones = new ArrayList<>();

		listaRelaciones = listaRelacionesSource("Gato");

		for (int i = 0; i < listaRelaciones.size(); i++) {
			System.out.println("holaaaa " + listaRelaciones.get(i).toString());
		}

		ModelFactory modelFactory = cargar();

	}

	/**
	 * 
	 * @param nombre
	 * @return
	 */
	private ArrayList<Object> listaRelacionesSource(String nombre) {

		ArrayList<Object> relacionesOrigen = new ArrayList<>();
		for (TcdDiagramaClases diagrama : modelFactory.getListaDiagramas()) {
			for (TcdRelacion relacion : diagrama.getListaRelaciones()) {
				if (relacion.getSource().getNombre().equalsIgnoreCase(nombre)) {
					relacionesOrigen.add(relacion);
				}
			}
		}
		return relacionesOrigen;
	}

	/**
	 * 
	 * @param nombre
	 * @return
	 */
	private TcdClase obtenerClase(String nombre) {

		TcdClase clase = null;
		for (TcdDiagramaClases diagrama : modelFactory.getListaDiagramas()) {
			System.out.println("Diagramas de clases: " + diagrama.getNombre() + "\n");
			for (TcdClase clases : diagrama.getListaClases()) {
				if (clases.getNombre().equals(nombre)) {
					return clases;
				}
			}
		}
		return clase;
	}

}
