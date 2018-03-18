/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1603.exercicio03;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.FileReader;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class Pessoa {

    private String nome;
    private String data;
    private Endereco endereco;

    public String imprimirDados() {
        return ("Nome: " + getNome() + "\nData Nascimento: " + getData()
                + "\nEndereço:\n" + endereco.imprimir());
    }

    public List<Pessoa> carregarXML(FileReader f) {
        XStream stream = new XStream(new DomDriver());

        stream.alias("pessoa", this.getClass());
        List<Pessoa> p = (List<Pessoa>) stream.fromXML(f);
        return p;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
