package br.com.cotiinformatica.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "matricula")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Matricula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idturma")
	private Integer idTurma;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idaluno")
	private Integer idAluno;

	@Column(name = "datamatricula", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataMatricula;

	@ManyToOne //Muitas matriculas têm 1 turma
	@JoinColumn(name = "idturma", nullable = false)
	private Turma turma;

	@ManyToOne //Muitas matriculas têm 1 aluno
	@JoinColumn(name = "idaluno", nullable = false)
	private Aluno aluno;

}
