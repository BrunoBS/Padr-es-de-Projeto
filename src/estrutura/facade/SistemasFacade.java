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
public class SistemasFacade {

    protected SistemaSerasa serasa;
    protected SistemaBacen bacen;

    public void inicializarSubsistemas() {

        bacen = new SistemaBacen();
        bacen.configuraConsulta();
      
        serasa = new SistemaSerasa();
        serasa.configuraConsulta();

    }

    public void consultaSerasa(String arquivo) {
        serasa.consulta(arquivo);
    }

    public void consultaBacen(String arquivo) {
        
        bacen.consulta(arquivo);
    }

}
