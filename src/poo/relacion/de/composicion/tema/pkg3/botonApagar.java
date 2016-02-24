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
    public botonApagar(){
        this.IO = false;
    }
    public void presionar (){
        {
        this.IO = !this.IO;
        }
    }
}
