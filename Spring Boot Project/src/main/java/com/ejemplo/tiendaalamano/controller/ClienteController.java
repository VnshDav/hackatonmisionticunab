package com.ejemplo.tiendaalamano.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.tiendaalamano.model.Usuario;
import com.ejemplo.tiendaalamano.service.UsuarioService;

public class ClienteController {

	@RestController
	@RequestMapping("/api")
	public class UsuarioController {
	    @Autowired
	    private UsuarioService UsuarioService;

	    @RequestMapping(value = "/cliente", method = RequestMethod.POST, consumes = "application/json")
	    @ResponseStatus(HttpStatus.CREATED)
	    public void createUsuario(@RequestBody @Validated Usuario usuario) {
	        UsuarioService.save(usuario);
	    }

	    @RequestMapping(value = "/usuario/all", method = RequestMethod.GET)
	    @ResponseStatus(HttpStatus.OK)
	    public List<Usuario> getAllModels() {
	        return UsuarioService.findAll();
	    }

	
	}	
}
