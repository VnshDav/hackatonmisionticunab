package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class Punto {

	@Entity 
	@Table (name = "puntoventa")
	public class Puntoventa implements Serializable  {

	    private static final long serialVersionUID = 1L;

	    @Id 
	    @GeneratedValue (strategy = GenerationType .IDENTITY)
	    private Long idPunto;

	    @Column(name = "Nombre", nullable = false)
	    private String nombrePunto;

	    @Column(name = "Ubicacion", nullable = false)
	    private String Ubicaion;

		public Puntoventa(Long idPunto, String nombrePunto, String ubicaion) {
			super();
			this.idPunto = idPunto;
			this.nombrePunto = nombrePunto;
			Ubicaion = ubicaion;
		}

		public Long getIdPunto() {
			return idPunto;
		}

		public void setIdPunto(Long idPunto) {
			this.idPunto = idPunto;
		}

		public String getNombrePunto() {
			return nombrePunto;
		}

		public void setNombrePunto(String nombrePunto) {
			this.nombrePunto = nombrePunto;
		}

		public String getUbicaion() {
			return Ubicaion;
		}

		public void setUbicaion(String ubicaion) {
			Ubicaion = ubicaion;
		}

	    
	    
	}
	
	
	
}
