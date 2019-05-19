package criacao.factoryMethod;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Definir uma interface  para criar um objeto,
 * mas deixar que a subclasses  decidam que classe instanciar
 * Factory Method  permite que uma classe delegue
 * a responsabilidade de instanciamento  às subclasses
 * 
 * @author Bruno B
 */
public class MainFactoryMethod {

    public static void main(String[] args) {

        Empresa empresaUrbana = new EmpresaUrbanaFactory();
        Empresa empresaEstadual = new EmpresaEstadualFactory();

        Passagem urbano = empresaUrbana.emitir("Maringá", "Londrina", new GregorianCalendar(2019, Calendar.MAY, 22, 30, 0));
        Passagem estadual = empresaEstadual.emitir("Paraná", "São Paulo", new GregorianCalendar(2019, Calendar.MAY, 23, 00, 0));
        urbano.exibirDetalhe();
        estadual.exibirDetalhe();
    }

}
