/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamento.observer;

/**
 *
 * @author Bruno B
 */
public class TabelaObserver extends DadosObserver {

    public TabelaObserver(DadosSubject dados) {
        super(dados);
    }

    @Override
    public void update() {
        System.out.println("Tabela:"
                + "\nValor A: " + dados.getState().valorA
                + "\nValor B: " + dados.getState().valorB
                + "\nValor C: " + dados.getState().valorC);
    }

}
