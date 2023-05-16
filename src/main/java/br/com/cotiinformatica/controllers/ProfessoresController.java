package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.ProfessorPostDTO;
import br.com.cotiinformatica.dtos.ProfessorPutDTO;

@RestController
@RequestMapping(value = "/api/professores")
public class ProfessoresController {

	@PostMapping
	public void post(@RequestBody ProfessorPostDTO dto) {
		// TODO
	}

	@PutMapping
	public void put(@RequestBody ProfessorPutDTO dto) {
		// TODO
	}

	@DeleteMapping("{idProfessor}")
	public void delete(@PathVariable("idProfessor") Integer idProfessor) {
		// TODO
	}

	@GetMapping
	public void getAll() {
		// TODO
	}

	@GetMapping("{idProfessor}")
	public void getById(@PathVariable("idProfessor") Integer idProfessor) {
		// TODO
	}

}
