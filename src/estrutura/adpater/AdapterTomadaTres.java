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
public class AdapterTomadaTres extends TomadaDeTresPinos {

    private TomadaDeDoisPinos tomadaDeDoisPinos;

    public AdapterTomadaTres( TomadaDeDoisPinos tomadaDeDoisPinos) {
        System.out.print(super.toString());
        this.tomadaDeDoisPinos = tomadaDeDoisPinos;

    }

    public void ligarNaTomadaDeTresPinos() {
        tomadaDeDoisPinos.ligarNaTomadaDeDoisPinos();
    }

}
