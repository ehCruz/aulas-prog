/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Eduardo Cruz
 */
public class Cachorro implements Animal {

    @Override
    public void emitirSon() {
        System.out.println("AU AU");
    }

    @Override
    public void movimentar() {
        System.out.println("Correndo");
    }

}
