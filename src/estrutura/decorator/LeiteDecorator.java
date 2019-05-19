/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura.decorator;

/**
 *
 * @author Bruno B
 */
public class LeiteDecorator extends BebidaDecorator {

    public LeiteDecorator(Bebida bebida) {
        super(bebida);
        nome = "Leite";
        preco = 3.5;
    }

}
