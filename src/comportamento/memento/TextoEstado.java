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
public class TextoEstado {

    protected String estadoTexto;

    public TextoEstado(String texto) {
        estadoTexto = texto;
    }

    public String getTextoSalvo() {
        return estadoTexto;
    }
}
