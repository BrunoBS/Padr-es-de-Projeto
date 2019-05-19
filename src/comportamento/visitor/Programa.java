package comportamento.visitor;

/**
 *
 * Representar uma operação a ser executada nos elementos de uma 
 * estrutura de objetos, visitor permite definir uma nova operação 
 * sem mudar as classes dos elementos sobre os quais opera.
 * 
 * @author Bruno B
 */
public class Programa {

    public static void main(String[] args) {
        Visitor impressora = new ImpressoraVisitor();
        Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
        Expressao direita = new Soma(new Numero(2), new Numero(10));
        Expressao soma = new Soma(esquerda, direita);
       
        soma.aceita(impressora);
        System.out.println(" = " + soma.avalia());

        Expressao raiz = new RaizQuadrada(new Numero(9));
        System.out.println("\n ...");

        raiz.aceita(impressora);
        System.out.println(" = " + raiz.avalia());

    }
}
