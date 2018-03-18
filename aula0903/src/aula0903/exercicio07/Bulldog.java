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
public class Bulldog extends Cachorro {

    public Bulldog() {
        super();
    }

    public Bulldog(String raca, String dataNascimento) {
        super(raca, dataNascimento);
    }

    @Override
    public String latir() {
        return ("Latido grave!"); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
