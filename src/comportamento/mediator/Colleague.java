/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamento.mediator;

/**
 *
 * @author Bruno B
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator m) {
        mediator = m;
    }

    public void enviarMensagem(String mensagem) {
        mediator.enviar(mensagem, this);
    }

    public abstract void receberMensagem(String mensagem);
}
