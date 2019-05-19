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
public class CafeDecorator extends BebidaDecorator {

    public CafeDecorator(Bebida bebida) {
        super(bebida);
        nome = "Café Expresso";
        preco = 2.5;
    }

}
