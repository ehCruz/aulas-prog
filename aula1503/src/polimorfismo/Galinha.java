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
public class Galinha extends AnimalAbstrac implements Animal {

    @Override
    public void emitirSon() {
        System.out.println("POco POco");
    }

    @Override
    public void movimentar() {
        System.out.println("Voando");
    }

    @Override
    public void imprimir() {
        super.imprimir(); //To change body of generated methods, choose Tools | Templates.
    }
}
