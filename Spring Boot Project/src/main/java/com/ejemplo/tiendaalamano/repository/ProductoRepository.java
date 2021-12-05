package com.ejemplo.tiendaalamano.repository;

import org.springframework.data.repository.CrudRepository;

import com.ejemplo.tiendaalamano.model.Productos;

public interface ProductoRepository extends CrudRepository<Productos, Integer> {

}
