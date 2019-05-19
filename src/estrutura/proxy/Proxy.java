/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura.proxy;

/**
 *
 * @author Bruno B
 */
public class Proxy extends Sistema {

    protected String usuario, senha;

    public Proxy(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public String getNumeroDeUsuarios() {
        if (temPermissaoDeAcesso()) {
            return super.getNumeroDeUsuarios();
        }
        return null;
    }

    @Override
    public String getUsuariosConectados() {
        if (temPermissaoDeAcesso()) {
            return super.getUsuariosConectados();
        }
        return null;
    }

    private boolean temPermissaoDeAcesso() {
        return usuario == "admin" && senha == "admin";
    }
}
