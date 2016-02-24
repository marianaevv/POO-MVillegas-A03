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
public class POORelacionDeComposicionTema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Telefono starTac = new Telefono ();
                
                starTac.EA.presionar();
                System.out.println ("el starTac esta "+ starTac.EA.IO);
                starTac.setTeclado();
        //Ciclos que recorren toda la matriz
        for (int i = 0; i < 5; i++) { 
            for (int j = 0; j < 3; j++) {
                System.out.print(starTac.Teclado[i][j].getDigito() + " ");
            }
            System.out.println("");
        }
        
       }
    
}
