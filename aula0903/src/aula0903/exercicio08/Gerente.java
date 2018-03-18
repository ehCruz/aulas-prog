/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula0903.exercicio08;

/**
 *
 * @author Eduardo Cruz
 */
public class Gerente extends Funcionario {

    private double prodEquipe;

    public Gerente(String nome, String matricula, String dataAdmissao, double salario, double comissao) {
        super(nome, matricula, dataAdmissao, salario, comissao);
    }

    @Override
    public double calcularSalario() {
        setSalario(getSalario() + getComissao() + getProdEquipe());
        return getSalario();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("BONUS PROD. EQUIPE: " + getProdEquipe()
                + "\nSALÁRIO TOTAL: " + calcularSalario());
    }

    public double getProdEquipe() {
        return prodEquipe;
    }

    public void setProdEquipe(double prodEquipe) {
        this.prodEquipe = prodEquipe;
    }

}
