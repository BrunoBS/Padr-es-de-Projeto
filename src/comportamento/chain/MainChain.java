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
public class MainChain {

    public static void main(String[] args) {
        BancoChain bancos = new Bancoob();
        bancos.setNext(new BancoDoBrasil());
        bancos.setNext(new Bradesco());

        try {
            bancos.efetuarPagamento(IDBancos.BANCOOB);
            bancos.efetuarPagamento(IDBancos.BRADESCO);
            bancos.efetuarPagamento(IDBancos.BANCOOB);
            bancos.efetuarPagamento(IDBancos.BANCO_DO_BRASIL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
