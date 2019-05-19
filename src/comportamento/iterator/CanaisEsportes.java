/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamento.iterator;

/**
 *
 * @author Bruno B
 */
public class CanaisEsportes extends AgregadoDeCanais {

    public CanaisEsportes() {
        canais.add(new Canal("Esporte ao vivo"));
        canais.add(new Canal("Basquete 2011"));
        canais.add(new Canal("Campeonato Italiano"));
        canais.add(new Canal("Campeonato Espanhol"));
        canais.add(new Canal("Campeonato Brasileiro"));
    }

}
