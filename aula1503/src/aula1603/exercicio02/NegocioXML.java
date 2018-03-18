/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1603.exercicio02;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author eduardo
 */
public class NegocioXML {

    public static void main(String[] args) throws IOException {
//        Runtime.getRuntime().exec("");
        new NegocioXML().processar();
    }

    public void processar() throws IOException {
//        localizarAquivo();
        apresentarTodosItens();
    }

    private List<Negocio> carregarDadosArqXML(FileReader reader) {
        XStream stream = new XStream(new DomDriver());

        stream.alias("negocio", Negocio.class);

        List<Negocio> listaNegocio = (List<Negocio>) stream.fromXML(reader);
        return listaNegocio;
    }

    public void localizarAquivo() {
        try {
            // Criando objeto da classe
            JFileChooser chooser = new JFileChooser();
            //Informar extensão
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Apenas XML", "xml");
            chooser.setFileFilter(filtro);
            chooser.setCurrentDirectory(new java.io.File("."));

            //Exibe a tela 
            int retAbertura = chooser.showOpenDialog(null);
            String title;
            String msg;
            switch (retAbertura) {
                //Botão selecionar pressionado
                case JFileChooser.APPROVE_OPTION:
                    FileReader reader = new FileReader(chooser.getSelectedFile());
                    List<Negocio> negocios = carregarDadosArqXML(reader);
                    Negocio primeiroNegocio = negocios.get(0);
                    title = "Primeiro item";
                    msg = "Primeiro negocio: " + primeiroNegocio.getPreco()
                            + "\nQuantidade: " + primeiroNegocio.getQuantidade()
                            + "\nVolume: " + primeiroNegocio.getVolume();
                    JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
                    break;
                case JFileChooser.CANCEL_OPTION:
                    title = "Operação cancelada";
                    msg = "Operação cancelada";
                    JOptionPane.showMessageDialog(null, msg, title, JOptionPane.CANCEL_OPTION);
                    break;
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }

    public void apresentarTodosItens() {
        try {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Apenas XML", "xml");
            chooser.setFileFilter(filtro);
            chooser.setCurrentDirectory(new java.io.File("."));

            int retAbertura = chooser.showOpenDialog(null);
            StringBuffer mensagem = new StringBuffer();
            switch (retAbertura) {
                case JFileChooser.APPROVE_OPTION:
                    FileReader reader = new FileReader(chooser.getSelectedFile());
                    List<Negocio> negocios = carregarDadosArqXML(reader);
                    int i = 0;
                    for (Negocio negocio : negocios) {
                        mensagem.append("\n--Negocio nº"+(++i)+"--\n");
                        mensagem.append("Primeiro negocio: " + negocio.getPreco());
                        mensagem.append("\nQuantidade: " + negocio.getQuantidade());
                        mensagem.append("\nVolume: " + negocio.getVolume() + "\n");
                    }
                    JOptionPane.showMessageDialog(chooser, mensagem, "NEGOCIOS", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case JFileChooser.CANCEL_OPTION:
                    JOptionPane.showMessageDialog(chooser, "Cancelado", "NEGOCIOS", JOptionPane.CANCEL_OPTION);
                    break;
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
    }

}
