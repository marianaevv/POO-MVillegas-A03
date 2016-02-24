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
public class Telefono {
//Atributo, instanciar objeto
    botonApagar  EA = new botonApagar(); //por default es publico
    Tecla [][] Teclado = new Tecla [5][3];
    public void setTeclado (){
        int digito=0;
        String g;
        for (int i = 0; i < (Teclado.length -1); i++) { //Ciclo que recorrera la matriz 
            for (int j = 0; j < Teclado[0].length; j++) {
                Tecla aux=new Tecla(); //Dentro del for creamos el auxiliar para que en cada ciclo se cree un nuevo auxiliar
                digito++;
                g=Integer.toString(digito);
                aux.setDigito(g.charAt(0));
                Teclado[i][j]=aux;
            }
        }
        
        //Se declarara un auxiliar nuevo para cada variable
                 
        Tecla aux1=new Tecla(); 
        aux1.setDigito('*');
        Teclado[3][0]=aux1;
        Tecla aux2=new Tecla();
        aux2.setDigito('0');
        Teclado[3][1]=aux2;
        Tecla aux3=new Tecla();
        aux3.setDigito('#');
        Teclado[3][2]=aux3;
        Tecla aux4=new Tecla();
        aux4.setDigito('V');
        Teclado[4][0]=aux4;
        Tecla aux5=new Tecla();
        aux5.setDigito('M');
        Teclado[4][1]=aux5;
        Tecla aux6=new Tecla();
        aux6.setDigito('R');
        Teclado[4][2]=aux6;
        
        }       
        
            
        }
 
     
