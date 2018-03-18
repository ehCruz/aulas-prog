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
public class Diretor extends Funcionario {

    private double proLabore;

    public Diretor(String nome, String matricula, String dataAdmissao, double salario, double comissao) {
        super(nome, matricula, dataAdmissao, salario, comissao);
    }

    @Override
    public double calcularSalario() {
        setSalario(getSalario() + getComissao() + getProLabore());
        return getSalario();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("BONUS PRÓ LABORE: " + getProLabore()
                + "\nSALÁRIO TOTAL: " + calcularSalario());
    }

    public double getProLabore() {
        return proLabore;
    }

    public void setProLabore(double proLabore) {
        this.proLabore = proLabore;
    }

}
