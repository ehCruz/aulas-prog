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
public class PrincipalAnimal {

    public static void main(String[] args) {
        new PrincipalAnimal().processar();
    }

    public void processar() {
        Animal cao = new Cachorro();
        som(cao);

        Galinha galinha = new Galinha();
        som(galinha);
        galinha.imprimir();
    }

    public void som(Animal a) {
        a.emitirSon();
    }
}
