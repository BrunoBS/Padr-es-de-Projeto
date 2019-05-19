/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamento.templateMethod;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Bruno B
 */
public class RelatorioCompleto extends Relatorio {

   

    @Override
    public void corpo(List<Conta> conta) {
        System.out.printf("\t|\t %s \t|\t %s \t|\t %s \t\t|\n", "TITULAR", "AG.", "SALDO");

        for (Conta c : conta) {
            System.out.printf("\t|\t %s \t|\t %s \t|\t %.2f \t|\t\n", c.getTitular(), c.getAgencia(), c.getSaldo());
        }

    }

   

}
