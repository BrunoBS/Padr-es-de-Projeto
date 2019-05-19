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
public abstract class BebidaDecorator extends Bebida {

    Bebida coquetel;

    public BebidaDecorator(Bebida umCoquetel) {
        coquetel = umCoquetel;
    }

    @Override
    public String getNome() {
        return coquetel.getNome() + " + " + nome;
    }

    public double getPreco() {
        return coquetel.getPreco() + preco;
    }
}
