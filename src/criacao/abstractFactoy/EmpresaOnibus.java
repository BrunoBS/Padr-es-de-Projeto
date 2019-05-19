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
// FABRICA
public abstract class EmpresaOnibus {

    public abstract PassagemUrbana emitirPassagemUrbana(String origem, String destino, Calendar dataHoraPartida);

    public abstract PassagemEstadual emitirPassagemEstadual(String origem, String destino, Calendar dataHoraPartida);
}
