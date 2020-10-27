package br.com.dr.pokedex.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheQuery;

@Entity
@Table(name = "pokemon")
public class Pokemon {

	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private Double peso;
	private Double altura;
	private String categoria;
	private String genero;
//  private List<String> habilidades;
//	private List<String> tipo;
//	private List<String> fraquezas;

	public Pokemon() {
	}

	public Pokemon(String nome, Double peso, Double altura, String categoria, String genero) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.categoria = categoria;
		this.genero = genero;
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

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

//	public List<String> getHabilidades() {
//		return habilidades;
//	}
//
//	public void setHabilidades(List<String> habilidades) {
//		this.habilidades = habilidades;
//	}
//
//	public List<String> getTipo() {
//		return tipo;
//	}
//
//	public void setTipo(List<String> tipo) {
//		this.tipo = tipo;
//	}
//
//	public List<String> getFraquezas() {
//		return fraquezas;
//	}
//
//	public void setFraquezas(List<String> fraquezas) {
//		this.fraquezas = fraquezas;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
