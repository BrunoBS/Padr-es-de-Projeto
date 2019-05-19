/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criacao.builder;

/**
 *
 * @author Bruno B
 */
class PessoaBuilder {

    private String nome;
    private int id;
    private int peso;
    private int altura;
    private int idade;

    public PessoaBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public PessoaBuilder identificador(int id) {
        this.id = id;
        return this;
    }

    public PessoaBuilder peso(int peso) {
        this.peso = peso;
        return this;
    }

    public PessoaBuilder altura(int atura) {
        this.altura = altura;
        return this;
    }

    public PessoaBuilder idade(int idade) {
        this.idade = idade;
        return this;
    }

    public Pessoa build() {
        return new Pessoa(this);
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public int getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

}
