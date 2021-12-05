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
@Table (name="Cupones")
public class Cupones implements Serializable { 
	private static final long serialVersionUID = -3904417485279370766L;

	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCupon;
    
	@Column(name = "Descripcion",length = 100, nullable=true)
	private String Descripcion;
	
	@Column(name = "Valor",length = 25, nullable=false)
    private double valorCupon;

	

	public Cupones() {
		super();
	}

	public Cupones(int idCupon, String descripcion, double valorCupon) {
		super();
		this.idCupon = idCupon;
		this.Descripcion = descripcion;
		this.valorCupon = valorCupon;
	}

	public int getIdCupon() {
		return idCupon;
	}

	public void setIdCupon(int idCupon) {
		this.idCupon = idCupon;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public double getValorCupon() {
		return valorCupon;
	}

	public void setValorCupon(double valorCupon) {
		this.valorCupon = valorCupon;
	}

 
}
	
