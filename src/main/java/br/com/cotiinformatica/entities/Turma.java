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
@Table(name = "turma")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Turma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idturma")
	private Integer idTurma;

	@Column(name = "nometurma", length = 150, nullable = false)
	private String nomeTurma;

	@Column(name = "datainicio", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataInicio;

	@Column(name = "datatermino", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataTermino;

	@ManyToOne //Muitas turmas têm 1 professor
	@JoinColumn(name = "idprofessor", nullable = false)
	private Professor professor;

}
