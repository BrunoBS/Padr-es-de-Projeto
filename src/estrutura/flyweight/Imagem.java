/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura.flyweight;

/**
 *
 * @author Bruno B
 */
//Estado intrínseco
public class Imagem {
	protected String nomeDaImagem;

	public Imagem(String imagem) {
		nomeDaImagem = imagem;
	}

	public void desenharImagem() {
		System.out.println(nomeDaImagem + " desenhada!");
	}
}