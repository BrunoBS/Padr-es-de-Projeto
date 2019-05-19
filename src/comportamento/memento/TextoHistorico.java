/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamento.memento;

import java.util.ArrayList;

/**
 *
 * @author Bruno B
 */
public class TextoHistorico {

    protected ArrayList<TextoEstado> estados;

    public TextoHistorico() {
        estados = new ArrayList<TextoEstado>();
    }

    public void adicionarEstado(TextoEstado texto) {
        estados.add(texto);
    }

    public TextoEstado getUltimoEstadoSalvo() {
        if (estados.size() <= 0) {
            return new TextoEstado("");
        }
        TextoEstado estadoSalvo = estados.get(estados.size() - 1);
        estados.remove(estados.size() - 1);
        return estadoSalvo;
    }
}
