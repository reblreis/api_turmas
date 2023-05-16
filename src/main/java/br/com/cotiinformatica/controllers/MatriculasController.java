package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.MatriculaPostDTO;

@RestController
@RequestMapping(value = "/api/matriculas")
public class MatriculasController {

	@PostMapping
	public void post(@RequestBody MatriculaPostDTO dto) {
		// TODO
	}

	@DeleteMapping("{idMatricula}")
	public void delete(@PathVariable("idMatricula") Integer idMatricula) {
		// TODO
	}

}
