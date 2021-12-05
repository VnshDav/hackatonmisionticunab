package com.ejemplo.tiendaalamano.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.tiendaalamano.model.Punto;
import com.ejemplo.tiendaalamano.service.PuntoService;


	@RestController 
	@RequestMapping ("/api")
	public class PuntosController {
	    @Autowired 
	    PuntoService Service;

	    

	    @PostMapping(value = "/Punto_de_ventas", consumes = "application/json")
	    @ResponseStatus(HttpStatus.CREATED)
	    public void (@RequestBody @Validated MarcaModel nuevaMarca) {
	       Service.crearMarca(nuevaMarca);
	    }

	    @RequestMapping(value = "/marcas/{id}", method = RequestMethod.DELETE)
	    @ResponseStatus(HttpStatus.OK)
	    public String eliminarById(@PathVariable int id) {
	        marcaService.eliminarMarcaById(id);
	        return "La ha eliminado la categoria con de id: " + id;
	    }
	}
	
}
