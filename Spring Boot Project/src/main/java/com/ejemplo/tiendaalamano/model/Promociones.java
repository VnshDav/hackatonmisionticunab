package com.ejemplo.tiendaalamano.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Promociones")
public class Promociones {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPromo;
	
	@Column(length = 20, nullable=false)
	private String estado; 

	@Column(length = 15, nullable=false)
	private long ValorDescuento;
	
	@Column(length = 150, nullable=true)
	private String descripcion;

	public Promociones(int idPromo, String estado, long valorDescuento, String descripcion) {
		super();
		this.idPromo = idPromo;
		this.estado = estado;
		this.ValorDescuento = valorDescuento;
		this.descripcion = descripcion;
	}

	public int getIdPromo() {
		return idPromo;
	}

	public void setIdPromo(int idPromo) {
		this.idPromo = idPromo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public long getValorDescuento() {
		return ValorDescuento;
	}

	public void setValorDescuento(long valorDescuento) {
		ValorDescuento = valorDescuento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
