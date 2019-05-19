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
public class PessoaNormal {

    private int id;
    private int peso;
    private int altura;
    private int idade;
    private String nome;

    public PessoaNormal() {
    }

    public PessoaNormal(int idade) {
        this();
        this.idade = idade;
    }

    public PessoaNormal(int idade, int altura) {
        this(idade);
        this.altura = altura;
    }

    public PessoaNormal(int idade, int altura, int peso) {
        this(idade, altura);
        this.peso = peso;
    }

    public PessoaNormal(int idade, int altura, int peso, int id) {
        this(idade, altura, peso);
        this.id = id;
    }

    public PessoaNormal(int id, int peso, int altura, int idade, String nome) {
       this(idade, altura, peso, id);
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "PessoaNormal{" + "id=" + id + ", peso=" + peso + ", altura=" + altura + ", idade=" + idade + ", nome=" + nome + '}';
    }

  
    
    

}
