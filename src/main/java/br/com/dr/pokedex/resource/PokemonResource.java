package br.com.dr.pokedex.resource;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.dr.pokedex.model.Pokemon;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.hibernate.orm.panache.PanacheQuery;

@Path("/pokemon")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PokemonResource {


	@GET
    @Transactional
    public PanacheQuery<PanacheEntityBase> list() {
       return Pokemon.findAll();
    }

    @POST
    public Pokemon cadastrarPokemon (Pokemon pokemon) {
    	pokemon.persist();
        return pokemon;
    }

}
