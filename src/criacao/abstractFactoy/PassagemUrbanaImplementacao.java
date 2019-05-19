/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criacao.abstractFactoy;

import java.util.Calendar;

/**
 *
 * @author Bruno B
 */
public class PassagemUrbanaImplementacao extends PassagemUrbana {

    public PassagemUrbanaImplementacao(String origem, String destino, Calendar dataHoraPartida) {
        super(origem, destino, dataHoraPartida);
    }

    @Override
    public void exibirDetalhe() {
        System.out.println("Passagem Urbana de "
                + this.getOrigem() + " para "
                + this.getDestino() + ". Data/Hora da saída é " + this.dataFormatada());
    }
}
