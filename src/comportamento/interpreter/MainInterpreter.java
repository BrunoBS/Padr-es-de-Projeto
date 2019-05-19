package comportamento.interpreter;

/**
 *
 * Dada uma linguagem, definir uma representação para sua gramática 
 * juntamente com um interpretador que usa a representação para 
 * interpretar sentenças dessa linguagem.
 * @author Bruno B
 */
public class MainInterpreter {
    public static void main(String[] args) {	
		Expressao esquerda = new Subtracao(new Numero(10),new Numero(5));
		Expressao direita = new Soma(new Numero(2),new Numero(10));
		Expressao soma = new Soma(esquerda,direita);
		
		int resultado = soma.avalia();
		
		System.out.println(resultado);
	}
}
