/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamento.strategy;

/**
 *
 * Definir uma família de algoritmos, encapsular cada uma delas e
 * torná-las intercambiáveis, Strategy permite que o algoritmo
 * varie independentemente dos clientes que o utilizam

 * @author Bruno B
 */
public class MainStrategy {

    public static void main(String[] args) {
        Funcionario umFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR, 2100);
        System.out.println(umFuncionario.calcularSalarioComImposto());

        Funcionario outroFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR, 1700);
        System.out.println(outroFuncionario.calcularSalarioComImposto());
    }
}
