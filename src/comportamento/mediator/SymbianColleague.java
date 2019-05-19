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
public class SymbianColleague extends Colleague {

    public SymbianColleague(Mediator m) {
        super(m);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Symbian recebeu: " + mensagem);
    }

}
