/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamento.command;

/**
 *
 * Encapsular uma solicitação como objeto, desta forma 
 * permitindo parametrizar cliente com diferentes solicitações,
 * enfileirar ou fazer o registro de solicitações e suportar 
 * operações que podem ser desfeitas.

 * @author Bruno B
 */
public class MainCommand {

    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("Bruno", 150.0);
        Pedido pedido2 = new Pedido("Ricardo", 250.0);

        FilaDeTrabalho fila = new FilaDeTrabalho();

        fila.adiciona(new PagaPedidoCommand(pedido1));
        fila.adiciona(new PagaPedidoCommand(pedido2));
        fila.adiciona(new ConcluiPedidoComand(pedido1));

        fila.processa();
        System.out.println(" .... ");
        fila.adiciona(new ConcluiPedidoComand(pedido2));
        fila.processa();

    }
}
