package br.com.dr.pokedex.service;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@ApplicationScoped
@RegisterRestClient
@Path("/pokemons")
public interface PokemonService {

//	@Inject
//	@RestClient
//	private PokemonRepository repo;
//
//	public static List<Pokemon> listarTodos(){
//		return (List<Pokemon>) repo.findAll();
//	}

}
