/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamento.state;

/**
 *
 * Permite a um objeto alterar seu comportamento quando seu estado
 * interno muda, o objeto parecerá ter mudado de classe.

 * @author Bruno B
 */
public class Programa {
   public static void main(String[] args) {
		Orcamento orcamento  = new Orcamento(500.0);
		orcamento.aplicaDescontoExtra();
		System.out.printf("Desconto %.2f\n", orcamento.getValor());
		
		orcamento.aprova();
		orcamento.aplicaDescontoExtra();
		System.out.printf("Desconto %.2f\n", orcamento.getValor());
		
		orcamento.finaliza();
		System.out.printf("Desconto %.2f\n", orcamento.getValor());
                
                //Erro: Orcamento finalizado não pode aplicar desconto
                orcamento.aplicaDescontoExtra();
		System.out.printf("Desconto %.2f\n", orcamento.getValor());
		
		
		
	} 
}
