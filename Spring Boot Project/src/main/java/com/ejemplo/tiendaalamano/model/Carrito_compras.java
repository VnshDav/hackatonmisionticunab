package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carrito")
public class Carrito_compras implements Serializable{
	private static final long serialVersionUID =1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDRegistro",length = 20, nullable=false)
	private Long Registro;
	
    @Column(name="IDProducto",length = 20, nullable=false)
    private Long idproducto;
    
    @Column(name="NombreP",length = 50, nullable=true)
	private String nombreP;
    
    @Column(name="Cantidad",length = 25, nullable=false)
	private int cantidad;
    
    @Column(name="ValorUni",length = 25, nullable=false)
	private Double valoruni;

	public Carrito_compras(Long registro, Long idproducto, String nombreP, int cantidad, Double valoruni) {
		super();
		this.Registro = registro;
		this.idproducto = idproducto;
		this.nombreP = nombreP;
		this.cantidad = cantidad;
		this.valoruni = valoruni;
	}

	public Long getRegistro() {
		return Registro;
	}

	public void setRegistro(Long registro) {
		Registro = registro;
	}

	public Long getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(Long idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Double getValoruni() {
		return valoruni;
	}

	public void setValoruni(Double valoruni) {
		this.valoruni = valoruni;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
      
    