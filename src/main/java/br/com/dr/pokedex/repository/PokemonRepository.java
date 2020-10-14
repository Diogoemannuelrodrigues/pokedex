package br.com.dr.pokedex.repository;

import javax.enterprise.context.ApplicationScoped;

import br.com.dr.pokedex.model.Pokemon;
import io.quarkus.hibernate.orm.panache.PanacheRepository;


@ApplicationScoped
public class PokemonRepository implements PanacheRepository<Pokemon> {

}
