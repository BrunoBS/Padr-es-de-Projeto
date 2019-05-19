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
public class BarraObserver extends DadosObserver {

    public BarraObserver(DadosSubject dados) {
        super(dados);
    }

    @Override
    public void update() {
        String barraA = "", barraB = "", barraC = "";

        for (int i = 0; i < dados.getState().valorA; i++) {
            barraA += '=';
        }

        for (int i = 0; i < dados.getState().valorB; i++) {
            barraB += '=';
        }

        for (int i = 0; i < dados.getState().valorC; i++) {
            barraC += '=';
        }

        System.out.println("Barras:\n Valor A: " + barraA + "\nValor B: "
                + barraB + "\nValor C: " + barraC);
    }

}
