/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamento.chain;

/**
 *
 * @author Bruno B
 */
public class Bancoob extends BancoChain {

	public Bancoob() {
		super(IDBancos.BANCOOB);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado no banco Bancoob");
	}
}
