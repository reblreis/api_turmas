package br.com.cotiinformatica.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "aluno")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idaluno")
	private Integer idAluno;

	@Column(name = "nome", length = 150, nullable = false)
	private String nomeAluno;

	@Column(name = "matricula", length = 20, nullable = false)
	private String matricula;

	@Column(name = "cpf", length = 15, nullable = false)
	private String cpf;

}
