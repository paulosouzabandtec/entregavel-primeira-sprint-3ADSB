package br.com.bandtec.entregavelpokemon.Models;

public abstract class Pessoa {
    private String nome;
    private Integer idade;
    private String codigo;

    public Pessoa(){};

    public abstract Double salarioPokemonAoMes();

    public Pessoa(String nome, Integer idade, String codigo) {
        this.nome = nome;
        this.idade = idade;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
