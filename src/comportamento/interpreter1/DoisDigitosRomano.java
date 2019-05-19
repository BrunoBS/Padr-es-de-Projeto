 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamento.interpreter1;

/**
 *
 * @author Bruno B
 */


public class DoisDigitosRomano extends NumeroRomanoInterpreter {

    @Override
    public String um() {
        return "X";
    }

    @Override
    public String quatro() {
        return "XL";
    }

    @Override
    public String cinco() {
        return "L";
    }

    @Override
    public String nove() {
        return "XC";
    }

    @Override
    public int multiplicador() {
        return 10;
    }

}
