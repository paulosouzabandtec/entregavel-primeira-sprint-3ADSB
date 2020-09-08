package br.com.bandtec.entregavelpokemon.Models;

public class Pokemon {
    private String nome;
    private String tipo;
    private Integer poderBase;

    public Pokemon(String nome, String tipo, Integer poderBase) {
        this.nome = nome;
        this.tipo = tipo;
        this.poderBase = poderBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getPoderBase() {
        return poderBase;
    }

    public void setPoderBase(Integer poderBase) {
        this.poderBase = poderBase;
    }
}
