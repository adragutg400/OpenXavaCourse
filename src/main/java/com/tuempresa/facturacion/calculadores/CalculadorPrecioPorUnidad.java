package com.tuempresa.facturacion.calculadores;

import org.openxava.calculators.*;
import org.openxava.jpa.*;

import com.tuempresa.facturacion.modelo.*;

import lombok.*;

public class CalculadorPrecioPorUnidad implements ICalculator{
	
	@Getter @Setter
	int numeroProducto;

	@Override
	public Object calculate() throws Exception {
		Producto producto = XPersistence.getManager().find(Producto.class, numeroProducto);
		return producto.getPrecio();
	}

	
}
