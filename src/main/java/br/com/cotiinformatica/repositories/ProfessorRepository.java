package br.com.cotiinformatica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cotiinformatica.entities.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

}
