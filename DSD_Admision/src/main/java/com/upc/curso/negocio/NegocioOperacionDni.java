package com.upc.curso.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upc.curso.repositorio.PersonaRepositorio;
import com.upc.curso.entidades.Persona;

@Service
public class NegocioOperacionDni {

	@Autowired
	private PersonaRepositorio personaRepositorio;

	public List<Persona> ConPersona() {

		List<Persona> oLisPersona = null;
		oLisPersona = personaRepositorio.allpersona();
		return oLisPersona;

	}

}
