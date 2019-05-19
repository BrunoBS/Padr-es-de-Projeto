/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criacao.prototype;

/**
 *
 * @author Bruno B
 */
public class Ovelha extends Animal {

   public Ovelha(String nome){
       this.animalNome =nome;
       setAnimalNome(animalNome);
      }

    public void comer() {
        System.out.println(animalNome + " está comendo!");
    }

    public void andar() {
        System.out.println(animalNome + " está andando!");
    }

}
