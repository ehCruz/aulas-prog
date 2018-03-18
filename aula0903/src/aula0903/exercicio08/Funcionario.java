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
public abstract class Funcionario {

    private String nome;
    private String matricula;
    private String dataAdmissao;
    private double salario;
    private double comissao;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String matricula, String dataAdmissao, double salario, double comissao) {
        super();
        this.nome = nome;
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.comissao = comissao;
    }

    public double calcularSalario() {
        setSalario(getSalario() + getComissao());
        return getSalario();
    }

    public void imprimir() {
        System.out.println("NOME:" + getNome() + "\nMATRIULA: " + getMatricula()
                + "\nSALÁRIO: " + getSalario() + "\nCOMISSÃO: " + getComissao());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

}
