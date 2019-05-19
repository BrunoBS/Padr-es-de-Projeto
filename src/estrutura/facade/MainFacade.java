/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura.facade;

/**
 * Fornecer uma interface unificada para um conjunto de interfaces
 * em um subsistema Facade define uma interface de nível mais
 * alto que torna o subsistema mais fácil de ser usado.

 * @author Bruno B
 */
public class MainFacade {
    
	public static void main(String[] args) {
		System.out.println("##### Configurando subsistemas #####");
		SistemasFacade fachada = new SistemasFacade();
		fachada.inicializarSubsistemas();

		System.out.println("##### Utilizando subsistemas #####");
		fachada.consultaBacen("000.000.000-00");
		fachada.consultaSerasa("000.000.000-00");

	}

    
}
