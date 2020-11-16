package br.com.dr.pokedex.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.dr.pokedex.model.Pokemon;
import br.com.dr.pokedex.repository.PokemonRepository;

@ApplicationScoped
public class PokemonService {

	@Inject
	PokemonRepository poke;

	public List<Pokemon> listarTodos() {
		return poke.findAll().list();
	}
	
	public void salvar(Pokemon pokemon) {
		poke.persist(pokemon);
	}


	public Pokemon find (Long id) {
		return poke.findById(id);
	}

	public void deleta(Pokemon pokemon){
		poke.delete(pokemon);
	}
	

}
