package br.com.dr.pokedex.repository;

import br.com.dr.pokedex.model.Pokemon;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public class PokemonRepository implements PanacheRepository<Pokemon>{
	
	//   public Pokemon findByName(String name){
	//        return find("name", name).firstResult();
	//    }
}
