package br.com.dr.pokedex.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.dr.pokedex.model.Pokemon;
import br.com.dr.pokedex.repository.PokemonRepository;

@ApplicationScoped
public class PokemonService {
	
	@Inject
	PokemonRepository pokemonRepository;

	public List<Pokemon> listarTodos() {
		return pokemonRepository.findAll().list();
	}

}




