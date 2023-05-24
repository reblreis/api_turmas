package br.com.cotiinformatica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.AlunoPostDTO;
import br.com.cotiinformatica.dtos.AlunoPutDTO;
import br.com.cotiinformatica.entities.Aluno;
import br.com.cotiinformatica.repositories.AlunoRepository;

@RestController
@RequestMapping(value = "/api/alunos")
public class AlunosController {

	@Autowired // autoinicialização
	private AlunoRepository alunoRepository;

	@PostMapping
	public ResponseEntity<String> post(@RequestBody AlunoPostDTO dto) {
		try {

			Aluno aluno = new Aluno();

			aluno.setNomeAluno(dto.getNomeAluno());
			aluno.setMatricula(dto.getMatricula());
			aluno.setCpf(dto.getCpf());

			// salvar no banco de dados
			alunoRepository.save(aluno);
			
			//HTTP 201 - CREATED
			return ResponseEntity.status(201).body("Aluno cadastrado com sucesso.");

		} catch (Exception e) {
			//HTTP 500 - INTERNAL SERVER ERROR
			return ResponseEntity.status(500).body(e.getMessage());
		}
	}

	@PutMapping
	public void put(@RequestBody AlunoPutDTO dto) {
		// TODO
	}

	@DeleteMapping("{idAluno}")
	public void delete(@PathVariable("idAluno") Integer idAluno) {
		// TODO
	}

	@GetMapping
	public void getAll() {
		// TODO
	}

	@GetMapping("{idAluno}")
	public void getById(@PathVariable("idAluno") Integer idAluno) {
		// TODO
	}

}
