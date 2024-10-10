package com.tuempresa.facturacion.acciones;

import org.openxava.actions.*;
import org.openxava.jpa.*;

import com.tuempresa.facturacion.modelo.*;

public class EliminarFactura extends ViewBaseAction{

	@Override
	public void execute() throws Exception {
		Factura factura = XPersistence.getManager().find(Factura.class, getView().getValue("oid"));
		factura.setEliminado(true);	
		addMessage(
			"object_deleted", "Factura");
		getView().clear();
		getView().setKeyEditable(true);
	}
}
