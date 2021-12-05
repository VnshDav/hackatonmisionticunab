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
@Table (name="Clientes")
public class Cliente{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCliente;
	@Column(name="Nombre",length=50,nullable=false)
    private String nombre;
	
	@Column(name="Email",length=50,nullable=false)
    private String email;
	
	@Column(name="Direccion",length=45,nullable=false)
    private String direccion;
	
	@Column(name="Telefono",length=13,nullable=false)
    private int telefono;
	
	@Column(name="Puntos",length=20,nullable=false)
    private int puntosAcumulados;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, String email, String direccion, int telefono, int puntosAcumulados) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.puntosAcumulados = puntosAcumulados;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }
    
}
