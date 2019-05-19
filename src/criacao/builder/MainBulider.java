/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criacao.builder;

/**
* Separar a construção de um objeto complexo de 
* sua representação para que o
* mesmo processo de construção possa 
* criar representações diferentes.

 * @author Bruno B
 */
public class MainBulider {

    public static void main(String[] args) {
        PessoaNormal pn = new PessoaNormal(1, 2, 77,30,"Bruno");
        System.out.println(pn);
        
        PessoaBuilder builder = new PessoaBuilder();
        Pessoa p = builder.nome("Bruno").idade(30).peso(77).identificador(1).altura(2).build();
        System.out.println(p);
        
        StringBuilder s = new StringBuilder();
        s.append("Bruno Barbosa").append( " da Silva");
        System.out.println(s.toString());
        
    }
}
