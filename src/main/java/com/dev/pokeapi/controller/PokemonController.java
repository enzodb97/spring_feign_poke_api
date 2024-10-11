package com.dev.pokeapi.controller;


import com.dev.pokeapi.dto.pokemonDTO;
import com.dev.pokeapi.repository.PokeApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

    @Autowired
    private PokeApiClient pokeApiClient;

    @GetMapping("/pokemon/{pokemonId}")
    public pokemonDTO getPokeInfo(@PathVariable("pokemonId") int pokemonId) {
        return pokeApiClient.getPokeInfo(pokemonId);

    }
}
