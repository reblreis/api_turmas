package br.com.cotiinformatica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cotiinformatica.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}
