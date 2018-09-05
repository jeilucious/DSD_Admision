package com.upc.curso.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upc.curso.entidades.Persona;
import com.upc.curso.negocio.NegocioOperacionDni;

@RestController
@RequestMapping("/api")
public class ReniecRest {

	@Autowired
	private NegocioOperacionDni negocioOperacionDni;

	@GetMapping("/TodasPersonas/")
	public List<Persona> consultaClienteCuen() {
		return negocioOperacionDni.ConPersona();
	}

}
