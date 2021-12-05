package com.ejemplo.tiendaalamano.service;

import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Productos;

@Service 
public class ProductosService implements IProductosService {

	@Override
	public void addAttribute(String string, Productos productos) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public Productos EncontrarProducto(int idProucto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void EliminarProducto(int idProducto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Productos RegistrarProducto(String nombreProducto, String Marca, String Categoria, double precio,
			double impuesto) {
		// TODO Auto-generated method stub
		return null;
	}

}
