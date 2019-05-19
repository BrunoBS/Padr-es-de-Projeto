/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamento.observer;

import java.text.DecimalFormat;

/**
 *
 * @author Bruno B
 */
public class PorcentoObserver extends DadosObserver {

    public PorcentoObserver(DadosSubject dados) {
        super(dados);
    }

    @Override
    public void update() {
        int somaDosValores = dados.getState().valorA + dados.getState().valorB + dados.getState().valorC;
        DecimalFormat formatador = new DecimalFormat("#.##");
        String porcentagemA = formatador.format((double) dados.getState().valorA / somaDosValores);
        String porcentagemB = formatador.format((double) dados.getState().valorB / somaDosValores);
        String porcentagemC = formatador.format((double) dados.getState().valorC / somaDosValores);
        System.out.println("Porcentagem:"
                + "\nValor A: " + porcentagemA + "%"
                + "\nValor B: " + porcentagemB + "%"
                + "\nValor C: " + porcentagemC + "%");
    }

}
