/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1503;

/**
 *
 * @author Eduardo Cruz
 */
public class EstruturaDVD {

    private double preco;
    private String nome;

    public EstruturaDVD(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
