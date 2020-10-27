package br.com.dr.pokedex.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "fraquezas")
public class Fraquezas implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Integer id;

	private String nome;

	@ManyToOne
	private Pokemon pokemon;

	public Fraquezas(String nome) {
		super();
		this.nome = nome;
	}

	public Fraquezas() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
