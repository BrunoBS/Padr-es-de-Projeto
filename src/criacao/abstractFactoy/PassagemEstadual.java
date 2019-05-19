/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criacao.abstractFactoy;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Bruno B
 */
//PRODUTO
public abstract class PassagemEstadual {

    private String origem;
    private String destino;
    private Calendar dataHoraPartida;
    private final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public PassagemEstadual(String origem, String destino, Calendar dataHoraPartida) {
        this.origem = origem;
        this.destino = destino;
        this.dataHoraPartida = dataHoraPartida;
    }

    public abstract void exibirDetalhe();

    public String dataFormatada() {
        return df.format(dataHoraPartida.getTime());
    }

    //GETs e SETs   ..

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public Calendar getDataHoraPartida() {
        return dataHoraPartida;
    }

}
