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
public abstract class Cachorro {

    private String raca;
    private String dataNascimento;

    public Cachorro() {
        super();
    }

    public Cachorro(String raca, String dataNascimento) {
        super();
        this.raca = raca;
        this.dataNascimento = dataNascimento;
    }

    public String latir() {
        return ("Latido padrão!");
    }

    public void imprimir() {
        System.out.println("---INFORMAÇÕES DO CÃO---\nRAÇA: " + getRaca()
                + "\nDATA NASCIMENTO: " + getDataNascimento() +
                "\nTIPO LATIDO: " + latir());
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
