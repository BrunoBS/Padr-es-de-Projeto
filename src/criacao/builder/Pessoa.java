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
public class Pessoa {

    private int id;
    private int peso;
    private int altura;
    private int idade;
    private String nome;

    public Pessoa(PessoaBuilder builder) {
        this.id = builder.getId();
        this.peso = builder.getPeso();
        this.altura = builder.getAltura();
        this.idade = builder.getIdade();
        this.nome = builder.getNome();
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

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", peso=" + peso + ", altura=" + altura + ", idade=" + idade + ", nome=" + nome + '}';
    }

}
