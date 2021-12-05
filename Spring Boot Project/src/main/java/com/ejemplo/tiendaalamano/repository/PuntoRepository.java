package com.ejemplo.tiendaalamano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ejemplo.tiendaalamano.model.Punto;

public interface PuntoRepository extends JpaRepository <Punto, Long>, JpaSpecificationExecutor<Punto> {
 	}

