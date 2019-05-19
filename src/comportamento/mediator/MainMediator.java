/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamento.mediator;

/**
 *  Definir um objeto que encapsula a forma como um conjunto de objetos 
 * interage, O Mediator promove o acoplamento fraco ao 
 * evitar que os objetos se refiram uns aos outros explicitamente
 * e permitir variar suas interações independentemente.

 * @author Bruno B
 */
public class MainMediator {

    public static void main(String[] args) {
        MensagemMediator mediador = new MensagemMediator();

        AndroidColleague android = new AndroidColleague(mediador);
        IOSColleague ios = new IOSColleague(mediador);
        SymbianColleague symbian = new SymbianColleague(mediador);

        mediador.adicionarColleague(android);
        mediador.adicionarColleague(ios);
        mediador.adicionarColleague(symbian);

        symbian.enviarMensagem("Oi, eu sou um Symbian!");
        System.out.println("=========");
        android.enviarMensagem("Oi Symbian! Eu sou um Android!");
        System.out.println("=========");
        ios.enviarMensagem("Olá todos, sou um iOs!");
    }
}
