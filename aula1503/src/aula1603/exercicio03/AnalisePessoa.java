/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1603.exercicio03;

import com.thoughtworks.xstream.mapper.CannotResolveClassException;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author eduardo
 */
public class AnalisePessoa {

    public static void main(String[] args) throws FileNotFoundException {
        new AnalisePessoa().processarAcao();
    }

    public void processarAcao() throws FileNotFoundException {
        abrirArquivo();
//        listarTodosDados();
    }

    public void abrirArquivo() throws FileNotFoundException {
        JFileChooser chooser = new JFileChooser(".");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Apenas Arquivos com extensão .xml são suportados",
                "xml");

        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Exercicio 03");
        int retAbertuta = chooser.showOpenDialog(null);
        String msg;
        if (retAbertuta == JFileChooser.APPROVE_OPTION) {
            FileReader reader = new FileReader(chooser.getSelectedFile());
            List<Pessoa> pessoas = new Pessoa().carregarXML(reader);
            Pessoa pessoa = pessoas.get(1);
            msg = pessoa.imprimirDados();
            JOptionPane.showMessageDialog(null, msg, "PESSOA 01", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void listarTodosDados() throws FileNotFoundException {

        JFileChooser chooser = new JFileChooser(".");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Apenas Arquivos com extensão .xml são suportados",
                "xml");

        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Exercicio 03");
        int retAbertuta = chooser.showOpenDialog(null);
        StringBuffer msg = new StringBuffer();
        if (retAbertuta == JFileChooser.APPROVE_OPTION) {
            try {
                FileReader reader = new FileReader(chooser.getSelectedFile());
                List<Pessoa> p = new Pessoa().carregarXML(reader);
                int i = 0;
                for (Pessoa pessoa : p) {
                    msg.append("Pessoa: " + (++i) + "\n");
                    msg.append(pessoa.imprimirDados() + "\n\n");
                }
                JOptionPane.showMessageDialog(null, msg, "Lista de todas as pessoas", JOptionPane.INFORMATION_MESSAGE);
            } catch (CannotResolveClassException | FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }

        } else if (retAbertuta == JFileChooser.ERROR_OPTION) {
            JOptionPane.showMessageDialog(null, "ERRO ARQUIVO SELECIONADO É INVÁLIDO", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

}
