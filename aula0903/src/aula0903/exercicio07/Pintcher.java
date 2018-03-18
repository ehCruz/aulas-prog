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
public class Pintcher extends Cachorro {

    public Pintcher() {
        super();
    }

    public Pintcher(String raca, String dataNascimento) {
        super(raca, dataNascimento);
    }

    @Override
    public String latir() {
        return ("Latido agudo!");
    }
}
