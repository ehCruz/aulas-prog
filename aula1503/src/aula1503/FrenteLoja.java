/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1503;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cruz
 */
public class FrenteLoja {

    public static void main(String[] args) {
        new FrenteLoja().processar();
    }

    public void processar() {
        Scanner sc = new Scanner(System.in);
        EstruturaDVD novoDvd;
        RegrasDVD regras = new RegrasDVD();

        int op;
        boolean loop = true;
        while (loop) {
            System.out.println("1 - Criar DVD");
            System.out.println("2 - Listar DVD");
            System.out.println("3 - Sair");
            System.out.println("Digite sua opção:");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    sc.nextLine();
                    System.out.println("Informe o nome do DVD:");
                    String nome = sc.nextLine();

                    System.out.println("Informe o valor do DVD:");
                    double preco = sc.nextDouble();

                    novoDvd = new EstruturaDVD(nome, preco);
                    regras.adcionarDVD(novoDvd);
                    break;
                case 2:
                    regras.imprimirEstoque();
                    break;
                case 3:
                    System.out.println("Finalizando...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Valor inserido é inválido");
                    break;
            }
        }
    }
}
