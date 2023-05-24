package br.com.cotiinformatica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cotiinformatica.entities.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Integer> {

}
