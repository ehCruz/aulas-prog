/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1603.exercicio04;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.FileReader;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class ContaCorrente {

    private int numAgencia;
    private int numConta;
    private String nome;
    private double saldo;

    public List<ContaCorrente> carregarXML(FileReader f) {
        XStream stream = new XStream(new DomDriver());

        stream.alias("contaCorrente", this.getClass());

        List<ContaCorrente> lista = (List<ContaCorrente>) stream.fromXML(f);
        return lista;
    }

    public String imprimir() {
        return ("Nome: " + getNome() + "\nAgência: " + getNumAgencia()
                + "  Conta: " + getNumConta() + "\nSaldo: " + getSaldo());
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
