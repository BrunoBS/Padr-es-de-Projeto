/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criacao.prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bruno B
 */
public abstract class Animal implements Cloneable {

    String animalNome;

    public String getAnimalNome() {
        return animalNome;
    }

    public void setAnimalNome(String animalNome) {
        this.animalNome = animalNome;
    }
    
    @Override
    protected Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Animal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return o;
    }

    public void comer() {
        System.out.println(animalNome + " está comendo!");
    }

    public void andar() {
        System.out.println(animalNome + " está andando!");
    }

}
