/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.relacion.de.composicion.tema.pkg3;

/**
 *
 * @author Mariana Villegas
 */
public class Tecla {
    //Aatriutos
   private char digito;
    //método
   /**
    *Metodo que guardara valores para ciertas teclas 
    * @param d 
    */
    public void setDigito(char d){
        this.digito = d;
               
    }
    /**
     * Metodo que regresa el valor que se le da al digito por medio del for
     * @return cadena de caracteres 
     */
    public char getDigito(){
        return this.digito;
    }
}
