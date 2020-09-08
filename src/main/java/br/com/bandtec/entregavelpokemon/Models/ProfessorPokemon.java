package br.com.bandtec.entregavelpokemon.Models;

public class ProfessorPokemon extends Pessoa{
    private Integer quantPokemonsEstudados;

    public ProfessorPokemon(String nome, Integer idade, String codigo, Integer quantPokemonsEstudados) {
        super(nome, idade, codigo);
        this.quantPokemonsEstudados = quantPokemonsEstudados;
    }

    @Override
    public Double salarioPokemonAoMes() {
        return this.quantPokemonsEstudados * 30.0;
    }

    public Integer getQuantPokemonsEstudados() {
        return quantPokemonsEstudados;
    }

    public void setQuantPokemonsEstudados(Integer quantPokemonsEstudados) {
        this.quantPokemonsEstudados = quantPokemonsEstudados;
    }

    public Double getSalarioPokemonAoMes() {
        return this.salarioPokemonAoMes();
    }
}
