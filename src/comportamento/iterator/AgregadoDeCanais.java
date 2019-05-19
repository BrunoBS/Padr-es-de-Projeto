/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamento.iterator;

import java.util.ArrayList;

/**
 *
 * @author Bruno B
 */
public abstract class AgregadoDeCanais {

    protected ArrayList<Canal> canais;

    public AgregadoDeCanais() {
        canais = new ArrayList<Canal>();
    }

    public int count() {
        return canais.size();
    }

    public IteradorCanais criarIterator() {
        return new IteradorCanais(canais);
    }
}
