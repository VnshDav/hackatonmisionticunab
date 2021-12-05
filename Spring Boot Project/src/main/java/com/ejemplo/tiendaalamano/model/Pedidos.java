/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.tiendaalamano.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Pedidos")
public class Pedidos {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido;
	
	@Column(name="producto", nullable=false)
    private String producto;
	
	@Column(name="Cliente", nullable=false)
    private String cliente;
	
	@Column(name="Cantidad",length = 25, nullable=false)
    private int cantidadCompra;
	
	@Column(name="Estado",length = 25, nullable=false)
    private Boolean estado;

    public Pedidos() {
    }

	public Pedidos(int idPedido, String producto, String cliente, int cantidadCompra, Boolean estado) {
		super();
		this.idPedido = idPedido;
		this.producto = producto;
		this.cliente = cliente;
		this.cantidadCompra = cantidadCompra;
		this.estado = estado;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getCantidadCompra() {
		return cantidadCompra;
	}

	public void setCantidadCompra(int cantidadCompra) {
		this.cantidadCompra = cantidadCompra;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

   

 


}