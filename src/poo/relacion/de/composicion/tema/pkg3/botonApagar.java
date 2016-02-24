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
public class botonApagar {
    //Atributos
    public Boolean IO;
    
    //constructor
    public botonApagar(){
        this.IO = false;
    }
    /**
     * Metodo que apaga o enciende dependiendo de el estado del telefono
     */
    public void presionar (){
        {
        this.IO = !this.IO;
        }
    }
}
