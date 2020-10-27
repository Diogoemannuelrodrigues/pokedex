package br.com.dr.pokedex.resource;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.dr.pokedex.model.Pokemon;
import br.com.dr.pokedex.service.PokemonService;

@Path("/pokemon")
public class PokemonResource {

	@Inject
	PokemonService service;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pokemon> listar() {
		return service.listarTodos();
	}

	@POST
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	public void salvar(Pokemon pokemon) {
		service.salvar(pokemon);
	}

}
