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
public class PrincipalFuncionario {

    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Adalberto Silva", "33678", "15/12/2012", 2.259, 360.98);
        Funcionario diretor = new Diretor("Roberto Seilá", "0012", "05/09/1998", 12.575, 5.550);

        System.out.println("\n--Gerente--");
        gerente.imprimir();
        System.out.println("\n--Diretor--");
        diretor.imprimir();
    }
}
