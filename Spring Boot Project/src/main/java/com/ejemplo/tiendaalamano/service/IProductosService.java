package com.ejemplo.tiendaalamano.service;

import com.ejemplo.tiendaalamano.model.Productos;

public interface IProductosService {

	
	public Productos EncontrarProducto (int idProucto);
	public void EliminarProducto(int idProducto);
	public Productos RegistrarProducto(String nombreProducto, String Marca, String Categoria, double precio, double impuesto);
	public void addAttribute(String string, Productos productos);
	
	
}
