
package criacao.prototype;

/**
 *
 * Especificar os tipos de objetos  a serem criados usando uma instância 
 * com protótipo e criar novos objetos ao copiar este protótipo 
 * Criar um objeto novo, mas aproveitar o estado previamente 
 * existente em outro objeto

 * @author Bruno B
 */
public class MainPrototype {

    public static void main(String[] args) {
        final Ovelha ovelha = new Ovelha("Dolly");
        PrototypeFactory prototypeFactory = new PrototypeFactory(ovelha);
        Animal a = prototypeFactory.criarClone();

        System.out.println("Nome do animal: " + ovelha.getAnimalNome());
        ovelha.andar();
        ovelha.comer();

        System.out.println("Nome do animal clonado: " + a.getAnimalNome());
        a.andar();
        a.comer();
    }

}
