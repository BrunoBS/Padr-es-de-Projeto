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
public class PrototypeFactory {

    Animal animal;

    public PrototypeFactory(Animal animal) {
        this.animal = animal;
    }

    public Animal criarClone() {
        return (Animal) animal.clone();
    }
}
