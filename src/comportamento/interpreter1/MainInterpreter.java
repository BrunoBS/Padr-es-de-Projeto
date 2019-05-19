/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamento.interpreter1;

import java.util.ArrayList;

/**
 *
 * Dada uma linguagem, definir uma representação para sua gramática 
 * juntamente com um interpretador que usa a representação para 
 * interpretar sentenças dessa linguagem.
 * @author Bruno B
 */
public class MainInterpreter {

    public static void main(String[] args) {
        ArrayList<NumeroRomanoInterpreter> interpretadores = new ArrayList<NumeroRomanoInterpreter>();
        interpretadores.add(new QuatroDigitosRomano());
        interpretadores.add(new TresDigitosRomano());
        interpretadores.add(new DoisDigitosRomano());
        interpretadores.add(new UmDigitoRomano());

        String numeroRomano = "VII";
        Contexto contexto = new Contexto(numeroRomano);
        for (NumeroRomanoInterpreter numeroRomanoInterpreter : interpretadores) {
            numeroRomanoInterpreter.interpretar(contexto);
        }

        System.out.println(numeroRomano + " = " + Integer.toString(contexto.getOutput()));
    }

}
