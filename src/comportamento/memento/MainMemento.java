/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamento.memento;

/**
 *
 * Sem violar o encapsulamento, capturar e externalizar um estado interno de um
 * objeto, de maneira que o objeto possa ser restaurado para esse estado mais
 * tarde ( Ctrl + Z )
 *
 * @author Bruno B
 */
public class MainMemento {

    public static void main(String[] args) {
        Texto texto = new Texto();
        texto.escreverTexto("Primeira linha do texto \n");
        texto.escreverTexto("Segunda linha do texto \n");
        texto.escreverTexto("Terceira linha do texto \n");
        texto.mostrarTexto();
        texto.desfazerEscrita();
        texto.mostrarTexto();
        texto.desfazerEscrita();
        texto.mostrarTexto();
        texto.desfazerEscrita();
        texto.mostrarTexto();
        texto.desfazerEscrita();
        texto.mostrarTexto();
    }
}
