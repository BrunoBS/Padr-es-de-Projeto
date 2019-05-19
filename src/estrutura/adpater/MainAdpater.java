/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura.adpater;

/**
 *
 * Converter a interface de uma classe em outra interface, 
 * esperada pelo cliente O Adapter permite que interfaces 
 * incompatíveis trabalhem em conjunto – o que, de outra forma, seria impossível.

 * @author Bruno B
 */
public class MainAdpater {

    public static void main(String args[]) {
        TomadaDeTresPinos t3 = new TomadaDeTresPinos();

        TomadaDeDoisPinos a = new AdapterTomadaDois(t3);
        a.ligarNaTomadaDeDoisPinos();
        
        TomadaDeDoisPinos t2 = new TomadaDeDoisPinos();
        TomadaDeTresPinos b= new AdapterTomadaTres(t2);
        b.ligarNaTomadaDeTresPinos();
        
    }
}
