package com.tuempresa.facturacion.acciones;

import java.util.*;

import org.openxava.actions.*;
import org.openxava.model.*;

public class EliminarParaFacturacion extends ViewBaseAction{

	@Override
	public void execute() throws Exception {
		if(!getView().getMetaModel().containsMetaProperty("eliminado")) {
			executeAction("CRUD.delete");
			System.out.println("Se ha eliminado registro");
			return;
		}
		
		Map<String, Object> valores =
				new HashMap<>();
		valores.put("eliminado", true);
		MapFacade.setValues(
				getModelName(), 
				getView().getKeyValues(),
				valores);
		resetDescriptionsCache();
		addMessage(
			"object_deleted", getModelName());
		getView().clear();
		getView().setKeyEditable(true);
		getView().setEditable(false);
	}
}
