package diagrama.model;

import abstracta.AbstractaFactory;
import abstracta.ModelFactory;
import abstracta.Multiplicidad;
import abstracta.TCDAgregacion;
import abstracta.TCDAsociacion;
import abstracta.TCDClase;
import abstracta.TCDComposicion;
import abstracta.TCDDependencia;
import abstracta.TCDHerencia;
import abstracta.TCDPaquete;
import abstracta.TCDRelacion;
import abstracta.TCDAtributo;
import abstracta_relacional.Abstracta_relacionalFactory;
import abstracta_relacional.ForeignKey;
import abstracta_relacional.Table;
import abstracta_relacional.Type;

public class TransformacionM2R {

	private ModelFactory modelFactoryAbstracta;
	private abstracta_relacional.ModelFactory modelFactoryRelacional;

	public TransformacionM2R(ModelFactory modelFactoryAbstracta,
			abstracta_relacional.ModelFactory modelFactoryRelacional) {
		super();
		this.modelFactoryAbstracta = modelFactoryAbstracta;
		this.modelFactoryRelacional = modelFactoryRelacional;
	}

	public String transformarM2R() {
		String mensaje = "Se ha realizado la transformacion M2R";

		modelFactoryRelacional.getLstSchema().clear();
		abstracta_relacional.Schema schema = Abstracta_relacionalFactory.eINSTANCE.createSchema();
		modelFactoryRelacional.getLstSchema().add(schema);

		for (TCDClase tcdClase : modelFactoryAbstracta.getListaTodasClases()) {
			// Crea las tablas
			creartabla(tcdClase);
		}
		for (TCDClase tcdClase : modelFactoryAbstracta.getListaTodasClases()) {
			// Crea las relaciones
			for (TCDRelacion tcdRelacion : tcdClase.getListaRelaciones()) {
				crearRelacion(tcdRelacion);
			}
		}
		return mensaje;
	}
	
	private void crearRelacion(TCDRelacion tcdRelacion) {

		TCDClase RelSourceCon = tcdRelacion.getSource();
		TCDClase RelTargetCon = tcdRelacion.getTarget();
		Table tableSource = obtenerTableRelacional(RelSourceCon.getNombre());
		Table tableTarget = obtenerTableRelacional(RelTargetCon.getNombre());

		if (tcdRelacion instanceof TCDHerencia && tcdRelacion.getSource().getNombre().equalsIgnoreCase(tableTarget.getName())) {
			TCDClase tcdClase = obtenerTCDClase(tcdRelacion);
			for (TCDAtributo tcdAtributo : tcdClase.getListaAtributos()) {
				crearColumna(tcdAtributo, tableTarget);
			}
		} else {
			Multiplicidad multiplicidadSource;
			Multiplicidad multiplicidadTarget;
			if (tcdRelacion instanceof TCDAgregacion) {
				TCDAgregacion relacionAux = ((TCDAgregacion) tcdRelacion);
				multiplicidadSource = relacionAux.getMultiplicidadOrigen();
				multiplicidadTarget = relacionAux.getMultiplicidadDestino();
				if (multiplicidadSource == Multiplicidad._0N || multiplicidadSource == Multiplicidad._1N) {
					if (multiplicidadTarget == Multiplicidad._0N || multiplicidadTarget == Multiplicidad._1N) {
						crearTablaRelacion(tableSource, tableTarget);
						return;
					}
				}
			} else if (tcdRelacion instanceof TCDAsociacion) {
				TCDAsociacion relacionAux = ((TCDAsociacion) tcdRelacion);
				multiplicidadSource = relacionAux.getMultiplicidadOrigen();
				multiplicidadTarget = relacionAux.getMultiplicidadDestino();
				if (multiplicidadSource == Multiplicidad._0N || multiplicidadSource == Multiplicidad._1N) {
					if (multiplicidadTarget == Multiplicidad._0N || multiplicidadTarget == Multiplicidad._1N) {
						crearTablaRelacion(tableSource, tableTarget);
						return;
					}
				}
			} else if (tcdRelacion instanceof TCDComposicion) {
				TCDComposicion relacionAux = ((TCDComposicion) tcdRelacion);
				multiplicidadSource = relacionAux.getMultiplicidadOrigen();
				multiplicidadTarget = relacionAux.getMultiplicidadDestino();
				if (multiplicidadSource == Multiplicidad._0N || multiplicidadSource == Multiplicidad._1N) {
					if (multiplicidadTarget == Multiplicidad._0N || multiplicidadTarget == Multiplicidad._1N) {
						crearTablaRelacion(tableSource, tableTarget);
						return;
					}
				}
			} else if (tcdRelacion instanceof TCDDependencia) {
				TCDDependencia relacionAux = ((TCDDependencia) tcdRelacion);
				multiplicidadSource = relacionAux.getMultiplicidadOrigen();
				multiplicidadTarget = relacionAux.getMultiplicidadDestino();
				if (multiplicidadSource == Multiplicidad._0N || multiplicidadSource == Multiplicidad._1N) {
					if (multiplicidadTarget == Multiplicidad._0N || multiplicidadTarget == Multiplicidad._1N) {
						crearTablaRelacion(tableSource, tableTarget);
						return;
					}
				}
			}
			ForeignKey foreignKey = Abstracta_relacionalFactory.eINSTANCE.createForeignKey();
			foreignKey.setTableReferenced(tableSource);
			tableTarget.getListForeignKey().add(foreignKey);
		}
	}

	private TCDClase obtenerTCDClase(TCDRelacion tcdRelacion) {

		for (TCDClase tcdClase : modelFactoryAbstracta.getListaTodasClases()) {
			if (tcdClase.getNombre().equalsIgnoreCase(tcdRelacion.getSource().getNombre())) {
				return tcdClase;
			}
		}
		return null;
	}

	private void creartabla(TCDClase tcdClase) {
		
		String name = tcdClase.getNombre();

		Table existe_table = obtenerTableRelacional(name);
		if (existe_table == null) {

			abstracta_relacional.Table table = Abstracta_relacionalFactory.eINSTANCE.createTable();
			table.setName(tcdClase.getNombre());

			for (TCDAtributo tcdAtributo : tcdClase.getListaAtributos()) {
				crearColumna(tcdAtributo, table);
			}
			abstracta_relacional.Schema schema = modelFactoryRelacional.getLstSchema().get(0);
			schema.getListTables().add(table);
		}
	}
	
	private void crearTablaRelacion(Table tableSource, Table tableTarget) {
		
		String name = tableSource.getName() + "_" + tableTarget.getName();

		Table existe_table = obtenerTableRelacional(name);
		if (existe_table == null) {

			abstracta_relacional.Table table = Abstracta_relacionalFactory.eINSTANCE.createTable();
			table.setName(name);

			ForeignKey foreignKeySource = Abstracta_relacionalFactory.eINSTANCE.createForeignKey();
			ForeignKey foreignKeyTarget = Abstracta_relacionalFactory.eINSTANCE.createForeignKey();
			foreignKeySource.setTableReferenced(tableSource);
			foreignKeyTarget.setTableReferenced(tableTarget);
			table.getListForeignKey().add(foreignKeySource);
			table.getListForeignKey().add(foreignKeyTarget);
		}
	}
	
	private void crearColumna(TCDAtributo tcdAtributo, Table table) {
		
		abstracta_relacional.Column column = Abstracta_relacionalFactory.eINSTANCE.createColumn();
		column.setName(tcdAtributo.getNombre());
		
		if (tcdAtributo.getTipoDato().getName().equalsIgnoreCase("string")) {
			column.setType(Type.VARCHAR);
		} else if (tcdAtributo.getTipoDato().getName().equalsIgnoreCase("number")) {
			column.setType(Type.NUMBER);
		} else if (tcdAtributo.getTipoDato().getName().equalsIgnoreCase("boolean")) {
			column.setType(Type.BOOLEAN);
		} else if (tcdAtributo.getTipoDato().getName().equalsIgnoreCase("undefined")) {
			column.setType(Type.VARCHAR);
		} else if (tcdAtributo.getTipoDato().getName().equalsIgnoreCase("null")) {
			column.setType(Type.VARCHAR);
		} else if (tcdAtributo.getTipoDato().getName().equalsIgnoreCase("void")) {
			column.setType(Type.VARCHAR);
		} else if (tcdAtributo.getTipoDato().getName().equalsIgnoreCase("any")) {
			column.setType(Type.VARCHAR);
		}
		
		column.setData_default(tcdAtributo.getValorDefecto());
		column.setAuto_increment(false);
		column.setIs_not_null(false);

		table.getListColumns().add(column);
		
	}

	private Table obtenerTableRelacional(String name) {

		abstracta_relacional.Schema schema = modelFactoryRelacional.getLstSchema().get(0);
		
		for (Table table : schema.getListTables()) {
			if (table.getName().equalsIgnoreCase(name)) {
				return table;
			}
		}
		return null;
	}
}
