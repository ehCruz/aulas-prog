/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1503;

import java.util.ArrayList;

/**
 *
 * @author Eduardo Cruz
 */
public class RegrasDVD implements InterfaceDVD {
    
    ArrayList<EstruturaDVD> listaVetor = new ArrayList<>();
    
    @Override
    public void adcionarDVD(EstruturaDVD dvd) {
        this.listaVetor.add(dvd);
    }
    
    @Override
    public void imprimirEstoque() {
        for (EstruturaDVD estruturaDVD : this.listaVetor) {
            System.out.println("Nome: " + estruturaDVD.getNome());
            System.out.println("Preço: " + estruturaDVD.getPreco());
        }
    }
}
