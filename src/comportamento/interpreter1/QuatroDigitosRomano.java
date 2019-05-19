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
public class QuatroDigitosRomano extends NumeroRomanoInterpreter {

	@Override
	public String um() {
		return "M";
	}

	@Override
	public String quatro() {
		return " ";
	}

	@Override
	public String cinco() {
		return " ";
	}

	@Override
	public String nove() {
		return " ";
	}

	@Override
	public int multiplicador() {
		return 1000;
	}

}
