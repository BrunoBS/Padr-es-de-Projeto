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
public class TresDigitosRomano extends NumeroRomanoInterpreter {

	@Override
	public String um() {
		return "C";
	}

	@Override
	public String quatro() {
		return "CD";
	}

	@Override
	public String cinco() {
		return "D";
	}

	@Override
	public String nove() {
		return "CM";
	}

	@Override
	public int multiplicador() {
		return 100;
	}

}
