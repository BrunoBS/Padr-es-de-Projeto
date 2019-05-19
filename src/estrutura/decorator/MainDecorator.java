/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura.decorator;

/**
 *
 * Dinamicamente, agregar responsabilidades adicionais a objetos Os Decorators
 * fornecem uma alternativa flexível ao uso de subclasses para extensão de
 * funcionalidades.
 *
 * @author Bruno B
 */
public class MainDecorator {

    public static void main(String[] args) {
        Bebida cafe = new CafeExpresso();
        System.out.println(cafe.getNome() + " = " + cafe.getPreco());

        Bebida leite = new Leite();
        System.out.println(leite.getNome() + " = " + leite.getPreco());

        Bebida capuccino = new LeiteDecorator(cafe);
        System.out.println(capuccino.getNome() + " = " + capuccino.getPreco());

        Bebida capuccinoForte = new CafeDecorator(capuccino);
        System.out.println(capuccinoForte.getNome() + " = " + capuccinoForte.getPreco());
        
        Bebida capuccinoFraco = new LeiteDecorator(capuccino);
        System.out.println(capuccinoFraco.getNome() + " = " + capuccinoFraco.getPreco());
    }

}
