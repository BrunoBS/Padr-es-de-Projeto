/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criacao.factoryMethod;

import java.util.Calendar;

/**
 *
 * @author Bruno B
 */
public class EmpresaEstadualFactory extends Empresa {

    @Override
    public Passagem emitir(String origem, String destino, Calendar dataHoraPartida) {
        return new PassagemEstadual(origem, destino, dataHoraPartida);
    }

}


