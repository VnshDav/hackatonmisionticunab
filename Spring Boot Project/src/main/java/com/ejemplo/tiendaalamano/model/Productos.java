/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="Productos")
public class Productos implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L; 
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idProducto;

	@Column (name="nombre",length=50, nullable=false)
    private String nombreProd;
	
	@Column (name="Categoria",length=20, nullable=true)
    private String CategoriaProd;
	
	@Column (name="Marca",length=20, nullable=true)
    private String Marca;
    
	@Column (name="Cantidad",length=20, nullable=false)
	private int cantidadProd;
	
	@Column (name="Precio",length=20, nullable=false)
    private double precioProd;
	
	@Column (name="puntos",length=20, nullable=true)
    private long puntosProd;
	
	@Column (name="Cupon", nullable=true)
    private Cupones cupon;

    public Productos() {
    }

	public Productos(String idProducto, String nombreProd, String categoriaProd, String marca, int cantidadProd,
			int precioProd, long puntosProd, Cupones cupon) {
		super();
		this.idProducto = idProducto;
		this.nombreProd = nombreProd;
		this.CategoriaProd = categoriaProd;
		this.Marca = marca;
		this.cantidadProd = cantidadProd;
		this.precioProd = precioProd;
		this.puntosProd = puntosProd;
		this.cupon = cupon;
	}

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProd() {
		return nombreProd;
	}

	public void setNombreProd(String nombreProd) {
		this.nombreProd = nombreProd;
	}

	public String getCategoriaProd() {
		return CategoriaProd;
	}

	public void setCategoriaProd(String categoriaProd) {
		CategoriaProd = categoriaProd;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public int getCantidadProd() {
		return cantidadProd;
	}

	public void setCantidadProd(int cantidadProd) {
		this.cantidadProd = cantidadProd;
	}

	public double getPrecioProd() {
		return precioProd;
	}

	public void setPrecioProd(int precioProd) {
		this.precioProd = precioProd;
	}

	public long getPuntosProd() {
		return puntosProd;
	}

	public void setPuntosProd(long puntosProd) {
		this.puntosProd = puntosProd;
	}

	public Cupones getCupon() {
		return cupon;
	}

	public void setCupon(Cupones cupon) {
		this.cupon = cupon;
	}

	
		

}