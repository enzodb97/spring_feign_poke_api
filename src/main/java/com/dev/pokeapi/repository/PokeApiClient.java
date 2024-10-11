package com.dev.pokeapi.repository;

import com.dev.pokeapi.dto.pokemonDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "pokeapi", url="https://pokeapi.co/api/v2")
public interface PokeApiClient {
    @GetMapping("/pokemon/{pokemonId}")
    public pokemonDTO getPokeInfo(@PathVariable ("pokemonId") int pokemonId);
}
