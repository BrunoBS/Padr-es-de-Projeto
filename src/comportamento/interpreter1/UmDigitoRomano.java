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

public class UmDigitoRomano extends NumeroRomanoInterpreter {

	@Override
	public String um() {
		return "I";
	}

	@Override
	public String quatro() {
		return "IV";
	}

	@Override
	public String cinco() {
		return "V";
	}

	@Override
	public String nove() {
		return "IX";
	}

	@Override
	public int multiplicador() {
		return 1;
	}

}
