/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1603.swing;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author eduardo
 */
public class AberturaArquivos {

    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));

        chooser.setDialogTitle("Abertura diretório");

        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //Não exibira arquivos apenas diretorios
        chooser.setAcceptAllFileFilterUsed(false);

        //Exibe a tela 
        int retAbertura = chooser.showOpenDialog(null);
        String title;
        String msg;
        switch (retAbertura) {
            //Botão selecionar pressionado
            case JFileChooser.APPROVE_OPTION:
                title = "CONFIRMOU";
                msg = "Diretorio escolhido: " + chooser.getCurrentDirectory();
                JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
                break;
            //Botão cancelar pressionado
            case JFileChooser.CANCEL_OPTION:
                title = "CANCELOU";
                msg = "Botão cancelar";
                JOptionPane.showMessageDialog(null, msg, title, JOptionPane.WARNING_MESSAGE);
                break;
            //ERROR AO SELECIONAR ARQUIVO
            case JFileChooser.ERROR_OPTION:
                title = "ERRO";
                msg = "Erro ao selecionar";
                JOptionPane.showMessageDialog(null, msg, title, JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}
