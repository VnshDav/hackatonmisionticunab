package com.ejemplo.tiendaalamano.service;

import java.util.List;

import com.ejemplo.tiendaalamano.model.Categorias;

public interface ICategoriaService {

	public void CrearCategoria(Categorias categoria) ;
    public List<Categorias> VerCategorias();
    public void eliminarCategoriaById(int idCategoria);

}
