/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura.facade;

/**
 *
 * @author Bruno B
 */
public class SistemaBacen {

    public void configuraConsulta() {
        System.out.println("Configura Consulta Banco Central");
    }

    public void consulta(String documento) {
        System.out.println("Consulta Cliente no Banco Central: " + documento);
    }
}
