/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criacao.abstractFactoy;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *Prover uma interface para criar famílias  de objetos  relacionados  ou 
 * dependentes  sem especificar suas classes  concretas , 
 * utilizado quando existe uma família de produtos bem definidas

 * @author Bruno B
 */
public class MainAbstractFactory {

    public static void main(String[] args) {

        EmpresaOnibus empresaOnibusFactory = new EmpresaOnibusFactory();

        PassagemUrbana urbano = empresaOnibusFactory.emitirPassagemUrbana("Maringá", "Londrina", new GregorianCalendar(2019, Calendar.MAY, 10, 22, 0));
        PassagemEstadual estadual = empresaOnibusFactory.emitirPassagemEstadual("Paraná", "São Paulo", new GregorianCalendar(2019, Calendar.MAY, 10, 23, 0));
        urbano.exibirDetalhe();
        estadual.exibirDetalhe();
    }

}
