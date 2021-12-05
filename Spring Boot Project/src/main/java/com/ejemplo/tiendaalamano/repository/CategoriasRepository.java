package com.ejemplo.tiendaalamano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo.tiendaalamano.model.Categorias;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Integer>{

	
}