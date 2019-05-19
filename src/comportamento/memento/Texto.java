/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamento.memento;

/**
 *
 * @author Bruno B
 */
public class Texto {

    protected String texto;
    TextoHistorico historico;

    public Texto() {
        historico = new TextoHistorico();
        texto = new String();
    }

    public void escreverTexto(String novoTexto) {
        historico.adicionarEstado(new TextoEstado(texto));
        texto += novoTexto;
    }

    public void desfazerEscrita() {
        texto = historico.getUltimoEstadoSalvo().getTextoSalvo();
    }

    public void mostrarTexto() {
        System.out.println(texto);
    }

}
