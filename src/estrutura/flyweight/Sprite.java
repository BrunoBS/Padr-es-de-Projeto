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
public class Sprite extends SpriteFlyweight {
	protected Imagem imagem;

	public Sprite(String nomeDaImagem) {
		imagem = new Imagem(nomeDaImagem);
	}

	@Override
	public void desenharImagem(Ponto ponto) {
		imagem.desenharImagem();
		System.out.println("No ponto (" + ponto.x + "," + ponto.y + ")!");
	}
}