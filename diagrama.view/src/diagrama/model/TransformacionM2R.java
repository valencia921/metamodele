package diagrama.model;

import abstracta.ModelFactory;
import abstracta.Multiplicidad;
import abstracta.TCDAgregacion;
import abstracta.TCDAsociacion;
import abstracta.TCDClase;
import abstracta.TCDClass_identifier;
import abstracta.TCDComposicion;
import abstracta.TCDDependencia;
import abstracta.TCDHerencia;
import abstracta.TCDRelacion;
import abstracta.TCDAtributo;
import abstracta_relacional.Abstracta_relacionalFactory;
import abstracta_relacional.Column;
import abstracta_relacional.PrimaryKey;
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

		modelFactoryRelacional.getLstSchema().get(0).getListTables().clear();

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

		TCDClase ClasSourceCon = tcdRelacion.getSource();
		TCDClase ClasRelTargetCon = tcdRelacion.getTarget();
		Table tableSource = obtenerTableRelacional(ClasSourceCon.getNombre());
		Table tableTarget = obtenerTableRelacional(ClasRelTargetCon.getNombre());

		if (tcdRelacion instanceof TCDHerencia) {
			if (tcdRelacion.getSource().getNombre().equalsIgnoreCase(tableSource.getName())) {
				return;
			} else {
				Column column = obtenerColumna(tableSource, tableSource.getPrimaryKey().get(0).getColumna().getName());
				crearForanea(column, tableTarget);
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
					} else {
						Column column = obtenerColumna(tableTarget,
								tableTarget.getPrimaryKey().get(0).getColumna().getName());
						crearForanea(column, tableSource);
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
					} else {
						Column column = obtenerColumna(tableTarget,
								tableTarget.getPrimaryKey().get(0).getColumna().getName());
						crearForanea(column, tableSource);
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
					} else {
						Column column = obtenerColumna(tableTarget,
								tableTarget.getPrimaryKey().get(0).getColumna().getName());
						crearForanea(column, tableSource);
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
					} else {
						Column column = obtenerColumna(tableTarget,
								tableTarget.getPrimaryKey().get(0).getColumna().getName());
						crearForanea(column, tableSource);
					}
				}
			}
		}
	}

	private void crearForanea(Column column, Table table) {

		Column column_foreign = Abstracta_relacionalFactory.eINSTANCE.createColumn();
		column_foreign.setAuto_increment(column.isAuto_increment());
		column_foreign.setData_default(column.getData_default());
		column_foreign.setIs_not_null(true);
		column_foreign.setIs_unique(true);
		column_foreign.setName(column.getName());
		column_foreign.setType(column.getType());

		table.getListColumns().add(column_foreign);
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

			Table table = Abstracta_relacionalFactory.eINSTANCE.createTable();
			table.setName(tcdClase.getNombre());

			for (TCDAtributo tcdAtributo : tcdClase.getListaAtributos()) {
				crearColumna(tcdAtributo, table);
			}

			if (tcdClase.getIdentificadores().size() > 0) {
				for (TCDClass_identifier id : tcdClase.getIdentificadores()) {
					crearPrimaryKeys(id, table);
				}
			} else {
				PrimaryKey primaryKey = Abstracta_relacionalFactory.eINSTANCE.createPrimaryKey();
				Column columna = obtenerColumna(table, tcdClase.getListaAtributos().get(0).getNombre());
				primaryKey.setColumna(columna);
				columna.setIs_unique(true);
				columna.setIs_not_null(true);
			}

			abstracta_relacional.Schema schema = modelFactoryRelacional.getLstSchema().get(0);
			schema.getListTables().add(table);
		}
	}

	private void crearPrimaryKeys(TCDClass_identifier id, Table table) {

		PrimaryKey primaryKey = Abstracta_relacionalFactory.eINSTANCE.createPrimaryKey();
		Column columna = obtenerColumna(table, id.getIdentificador().getNombre());
		primaryKey.setColumna(columna);
		columna.setIs_unique(true);
		columna.setIs_not_null(true);

		table.getPrimaryKey().add(primaryKey);
	}

	private Column obtenerColumna(Table table, String nombre) {

		for (Column column : table.getListColumns()) {
			if (column.getName().equalsIgnoreCase(nombre)) {
				return column;
			}
		}
		return null;
	}

	private void crearTablaRelacion(Table tableSource, Table tableTarget) {

		String name = tableSource.getName() + "_" + tableTarget.getName();
		String name2 = tableTarget.getName() + "_" + tableSource.getName();

		Table existe_table = obtenerTableRelacional(name);
		Table existe_table2 = obtenerTableRelacional(name2);

		if (existe_table == null && existe_table2 == null) {

			Table table = Abstracta_relacionalFactory.eINSTANCE.createTable();
			table.setName(name);

			Column columnSource = obtenerColumna(tableSource,
					tableSource.getPrimaryKey().get(0).getColumna().getName());
			Column columnTarget = obtenerColumna(tableTarget,
					tableTarget.getPrimaryKey().get(0).getColumna().getName());
			crearForanea(columnSource, table);
			crearForanea(columnTarget, table);
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
		column.setIs_unique(false);

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
