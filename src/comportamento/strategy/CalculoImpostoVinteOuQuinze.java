/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamento.strategy;

/**
 *
 * @author Bruno B
 */
public class CalculoImpostoVinteOuQuinze implements CalculaImposto {

    @Override
    public double calculaSalarioComImposto(Funcionario umFuncionario) {
        if (umFuncionario.getSalarioBase() > 3500) {
            return umFuncionario.getSalarioBase() * 0.8;
        }
        return umFuncionario.getSalarioBase() * 0.85;
    }
}
