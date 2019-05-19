/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamento.observer;

/**
 *
 * @author Bruno B
 */
public abstract class DadosObserver {

    protected DadosSubject dados;

    public DadosObserver(DadosSubject dados) {
        this.dados = dados;
    }

    public abstract void update();
}
