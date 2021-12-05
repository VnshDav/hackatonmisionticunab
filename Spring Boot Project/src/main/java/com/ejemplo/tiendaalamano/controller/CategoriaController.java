package com.ejemplo.tiendaalamano.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.tiendaalamano.model.Categorias;
import com.ejemplo.tiendaalamano.service.CategoriaService;

@RestController
@RequestMapping("/api")
public class CategoriaController {

	    @Autowired
	    CategoriaService Service;
	    
	    @GetMapping("/categorias")
	    public List<Categorias> findCategorias(){
	        return Service.VerCategorias();
	    }
	    @PostMapping(value = "/categoria", consumes = "application/json")
	    @ResponseStatus(HttpStatus.CREATED)
	    public void crearCategoria(@RequestBody @Validated Categorias NuevaCategoria) {
	        Service.CrearCategoria(NuevaCategoria);
	    }

	    
	    @RequestMapping(value = "/categorias/id", method = RequestMethod.DELETE)
	    @ResponseStatus(HttpStatus.OK)
	    public String eliminarById(@PathVariable int idCategoria) {
	        Service.eliminarCategoriaById(idCategoria);
	        return null;
}


}
