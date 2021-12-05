package com.ejemplo.tiendaalamano.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Categorias")
public class Categorias {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IdCategoria;
	
	@Column(name = "Categoria",length = 25, nullable=false)
	private String Categoria;
	
	@Column(name = "Producto", length = 40, nullable = false)
	private String Producto;
	
	@Column(name ="Marca", length = 25, nullable=true)
	private String Marca;

	public Categorias(int idCategoria, String categoria, String producto, String marca) {
		super();
		IdCategoria = idCategoria;
		Categoria = categoria;
		Producto = producto;
		Marca = marca;
	}

	public int getIdCategoria() {
		return IdCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		IdCategoria = idCategoria;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public String getProducto() {
		return Producto;
	}

	public void setProducto(String producto) {
		Producto = producto;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	
	
	
	
	

	
	
	
}
