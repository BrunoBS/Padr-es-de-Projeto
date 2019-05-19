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
public class EmpresaOnibusFactory extends EmpresaOnibus {

    @Override
    public PassagemUrbana emitirPassagemUrbana(String origem, String destino, Calendar dataHoraPartida) {
        return new PassagemUrbanaImplementacao(origem, destino, dataHoraPartida);
    }

    @Override
    public PassagemEstadual emitirPassagemEstadual(String origem, String destino, Calendar dataHoraPartida) {
        return new PassagemEstadualImplementacao(origem, destino, dataHoraPartida);
    }

}
