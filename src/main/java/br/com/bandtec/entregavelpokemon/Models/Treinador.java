package br.com.bandtec.entregavelpokemon.Models;

import java.util.ArrayList;
import java.util.List;

public class Treinador extends Pessoa {
    private Integer quantInsignias;
    private List<Pokemon> pokemonList;

    public Treinador(String nome, Integer idade, String codigo, Integer quantInsignias) {
        super(nome, idade, codigo);
        this.quantInsignias = quantInsignias;
        this.pokemonList = new ArrayList<>();
    }

    @Override
    public Double salarioPokemonAoMes() {
        return this.quantInsignias * 1000.0;
    }

    public Integer getQuantInsignias() {
        return quantInsignias;
    }

    public void setQuantInsignias(Integer quantInsignias) {
        this.quantInsignias = quantInsignias;
    }

    public Double getSalarioPokemonAoMes() {
        return salarioPokemonAoMes();
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }
}
