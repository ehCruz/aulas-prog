/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1603.exercicio02;

/**
 *
 * @author eduardo
 */
public final class Negocio {

    private double preco;
    private int quantidade;

    public double getVolume() {
        return getPreco() * getQuantidade();
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
