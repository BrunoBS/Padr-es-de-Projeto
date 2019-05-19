/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura.adpater;

/**
 *
 * @author Bruno B
 */
public class AdapterTomadaDois extends TomadaDeDoisPinos {

    private TomadaDeTresPinos tomadaDeTresPinos;

    public AdapterTomadaDois(TomadaDeTresPinos tomadaDeTresPinos) {
        System.out.print(super.toString());
        this.tomadaDeTresPinos = tomadaDeTresPinos;

    }

    public void ligarNaTomadaDeDoisPinos() {
        tomadaDeTresPinos.ligarNaTomadaDeTresPinos();
    }

}
