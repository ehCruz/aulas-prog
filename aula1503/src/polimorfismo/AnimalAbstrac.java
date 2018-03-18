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
public abstract class AnimalAbstrac {

    public abstract void emitirSon();

    public abstract void movimentar();

    public void imprimir() {
        System.out.println("Sou um ET.");
    }
}
