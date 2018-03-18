/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula0903.exercicio07;

/**
 *
 * @author Eduardo Cruz
 */
public class CachorroPrincipal {

    public static void main(String[] args) {
        Cachorro pintcher = new Pintcher("Pintcher", "02/02/02");
        Cachorro bullDog = new Bulldog("Bull Dog", "01/06/2012");
        Cachorro viraLata = new ViraLata("Vira Lata", "30/02/2017");

        pintcher.imprimir();
        System.out.println("\n");
        bullDog.imprimir();
        System.out.println("\n");
        viraLata.imprimir();
    }
}
