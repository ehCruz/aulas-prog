/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1603.exercicio04;

import com.thoughtworks.xstream.mapper.CannotResolveClassException;
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
public class AnaliseContaCorrente {

    public static void main(String[] args) {
        new AnaliseContaCorrente().processarAcao();
    }

    public void processarAcao() {
        abrirArquivo();
    }

    public void abrirArquivo() {
        JFileChooser chooser = new JFileChooser(".");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Apenas Arquivos com extensão .xml são suportados",
                "xml");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Exercicio 04");
        
        int retAbertura = chooser.showOpenDialog(null);
        String msg;
        if (retAbertura == JFileChooser.APPROVE_OPTION) {
            try {
                FileReader reader = new FileReader(chooser.getSelectedFile());
                List<ContaCorrente> cc = new ContaCorrente().carregarXML(reader);
                msg = cc.get(0).imprimir();
                JOptionPane.showMessageDialog(null, msg, "Informações da Conta", JOptionPane.WARNING_MESSAGE);
            } catch (CannotResolveClassException | FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, e.getCause(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
