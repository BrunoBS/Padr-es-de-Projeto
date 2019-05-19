/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamento.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Bruno B
 */
public class MainIterator {

    public static void main(String[] args) {
        CanaisEsportes meusCanais = new CanaisEsportes();
        System.out.println("Iterando com for:");
        for (IteradorCanais it = meusCanais.criarIterator();
                !it.isDone();
                it.proximoCanal()) {
            System.out.println(it.getNomeCanal());
        }

        System.out.println("\nIterando manualmente:");
        IteradorCanais it = meusCanais.criarIterator();
        System.out.println(it.getNomeCanal());
        it.proximoCanal();
        System.out.println(it.getNomeCanal());
        it.proximoCanal();
        System.out.println(it.getNomeCanal());
        it.proximoCanal();
        System.out.println(it.getNomeCanal());
        it.proximoCanal();
        System.out.println(it.getNomeCanal());

        System.out.println("\nIterando fora dos limites:");
        it.proximoCanal();
        System.out.println(it.getNomeCanal());
        it.first();
        it.voltarCanal();
        System.out.println(it.getNomeCanal());

        System.out.println("\nIterando API Java (While):");
        List<String> canais = Arrays.asList(
                "Esporte ao vivo",
                "Basquete 2011",
                "Campeonato Italiano",
                "Campeonato Espanhol",
                "Campeonato Brasileiro");
        Iterator itr = canais.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element);
        }
        System.out.println("\nIterando API Java (Manual)");
        itr = canais.iterator();
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());

        System.out.println("\nIterando API Java (Fora do Limite)");
        System.out.println(itr.next());

    }

}
