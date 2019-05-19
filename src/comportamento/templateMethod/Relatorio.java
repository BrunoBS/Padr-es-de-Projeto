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
public abstract class Relatorio {

    protected final void imprime(Banco banco, List<Conta> contas) {
        cabecalho(banco);
        corpo(contas);
        rodape(banco);

    }

    public void cabecalho(Banco banco) {
        System.out.println(banco.getNome());
        System.out.println(banco.getEndereco());
        System.out.println(banco.getTelefone());
    }

    protected abstract void corpo(List<Conta> conta);

    public void rodape(Banco banco) {
        System.out.println(banco.getEmail());
        System.out.println(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date()));
    }

}
