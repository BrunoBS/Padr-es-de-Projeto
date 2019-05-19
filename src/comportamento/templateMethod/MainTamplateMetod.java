/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamento.templateMethod;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Definir o esqueleto de um algoritmo em uma operação, 
 * postergando alguns passos para as subclasses, 
 * Template Method permite que subclasses redefinam certos 
 * passo de um algoritmo sem mudar a estrutura do mesmo.

 * @author Bruno B
 */
public class MainTamplateMetod {

    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<Conta>();

        Banco banco = new Banco("BANCOOB");
        banco.setTelefone("(44) 3032-7800");
        banco.setEndereco("Av. Duque de Caxias, 882 2º SobreLoja - Maringá-PR");
        banco.setEmail("email@sicoob.com.br");

        Conta c1 = new Conta();
        c1.setAgencia(4340);
        c1.setBanco(banco);
        c1.setTitular("Siglano");
        c1.setNumero(00001);
        c1.deposita(new BigDecimal(1000));

        Conta c2 = new Conta();
        c2.setAgencia(4340);
        c2.setBanco(banco);
        c2.setTitular("Fulando");
        c2.setNumero(00002);
        c2.deposita(new BigDecimal(1500));
        contas.addAll(Arrays.asList(c1, c2));
        
        Relatorio relatorio = new RelatorioSimples();
        System.out.println("Relatorio Simples: \n");
        relatorio.imprime(banco, contas);

        System.out.println("\n\n\n");
        relatorio = new RelatorioCompleto();
        System.out.println("Relatorio Completo: \n");
        relatorio.imprime(banco, contas);
    }
}
