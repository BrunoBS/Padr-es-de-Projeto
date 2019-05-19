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
public class IteradorCanais {

	ArrayList<Canal> lista;
	int contador;

	protected IteradorCanais(ArrayList<Canal> lista) {
		this.lista = lista;
		contador = 0;
	}

	public void first() {
		contador = 0;
	}

	public void proximoCanal() {
		contador++;
	}

	public void voltarCanal() {
		contador--;
	}

	public boolean isDone() {
		return contador == lista.size();
	}

	private Canal currentItem() {
		if (isDone()) {
			contador = lista.size() - 1;
		} else if (contador < 0) {
			contador = 0;
		}
		return lista.get(contador);
	}

	public String getNomeCanal() {
		return currentItem().nome;
	}
}
