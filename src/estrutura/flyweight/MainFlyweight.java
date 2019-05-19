/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura.flyweight;

import estrutura.flyweight.FlyweightFactory.Sprites;

/**
 *  Usar compartilhamento para suportar eficientemente grandes 
 * quantidades de objetos de granularidade fina...
 * Antes de exemplificar vamos entende um pouco sobre a estrutura do padrão.
 * A classe Flyweight fornece uma interface com uma operação que deve ser 
 * realizado sobre um estado interno. No exemplo esta classe irá fornecer 
 * uma operação para desenhar a imagem em um determinado ponto. Desta forma 
 * a imagem é o estado intrínseco, que consiste de uma informação que 
 * não depende de um contexto externo. O ponto passado como parâmetro
 * é o estado extrínseco, que varia de acordo com o contexto.

 * @author Bruno B
 */
public class MainFlyweight {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        factory.getFlyweight(Sprites.CENARIO_1).desenharImagem(new Ponto(0, 0));
        factory.getFlyweight(Sprites.JOGADOR).desenharImagem(new Ponto(10, 10));
        factory.getFlyweight(Sprites.INIMIGO_1).desenharImagem(new Ponto(100, 10));
        factory.getFlyweight(Sprites.INIMIGO_1).desenharImagem(new Ponto(120, 10));
        factory.getFlyweight(Sprites.INIMIGO_1).desenharImagem(new Ponto(140, 10));
        factory.getFlyweight(Sprites.INIMIGO_2).desenharImagem(new Ponto(60, 10));
        factory.getFlyweight(Sprites.INIMIGO_2).desenharImagem(new Ponto(50, 10));
        factory.getFlyweight(Sprites.INIMIGO_3).desenharImagem(new Ponto(170, 10));
    }
}
