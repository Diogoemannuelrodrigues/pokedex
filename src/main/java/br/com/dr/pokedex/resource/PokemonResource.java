package br.com.dr.pokedex.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import br.com.dr.pokedex.model.Pokemon;
import br.com.dr.pokedex.service.PokemonService;

@Path("/pokemon")
public class PokemonResource {

	@Inject
	PokemonService service;

	@GET
    @javax.ws.rs.Produces(MediaType.APPLICATION_JSON)
    public List<Pokemon> listar() {
		return service.listarTodos();
    }

	 
	

}
