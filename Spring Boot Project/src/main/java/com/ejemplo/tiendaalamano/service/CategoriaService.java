package com.ejemplo.tiendaalamano.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Categorias;
import com.ejemplo.tiendaalamano.repository.CategoriasRepository;

@Service
public class CategoriaService implements ICategoriaService{
	
	    @Autowired
	    private CategoriasRepository categoriaRepo;

	    public void CrearCategoria(Categorias categoria){
	        categoriaRepo.save(categoria);
	        
	    }
	    public List<Categorias> VerCategorias(){
	        return categoriaRepo.findAll();
	    }
	    
	    public void eliminarCategoriaById(int idCategoria) {
            categoriaRepo.deleteById(idCategoria);
        }
	}	


	
