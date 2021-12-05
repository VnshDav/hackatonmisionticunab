package com.ejemplo.tiendaalamano.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Punto;
import com.ejemplo.tiendaalamano.repository.PuntoRepository;

@Service
public class PuntoService {

 	    @Autowired
	    private PuntoRepository puntoRepo;

	    public void save(Punto nuevoPunto) {
	    	puntoRepo.save(nuevoPunto);
			
	    }

	    public void delete(long id) {
	        puntoRepo.deleteById(id);

	    }

	    public List<Punto> VerPunto(long id) {
	     puntoRepo.findById(id);
			return null;
	    }
	}

