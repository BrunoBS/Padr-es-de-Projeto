
package estrutura.proxy;

/**
 * Fornecer um substituto ou marcador da localização de 
 * outro objeto para controlar o acesso a esse objeto.

 * @author Bruno B
 */
public class MainProxy {

    public static void main(String[] args) {
        System.out.println("Hacker acessando");
        Sistema banco = new Proxy("Hacker", "1234");
        System.out.println(banco.getNumeroDeUsuarios());
        System.out.println(banco.getUsuariosConectados());

        System.out.println("\nAdministrador acessando");
        banco = new Proxy("admin", "admin");
        System.out.println(banco.getNumeroDeUsuarios());
        System.out.println(banco.getUsuariosConectados());
    }
}
