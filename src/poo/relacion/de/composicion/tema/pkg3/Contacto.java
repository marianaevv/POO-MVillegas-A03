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
public class Contacto {
   /**
    * 
    */
    private String nombre;
    private String tel;
    private String correo;
    /**
     * Constructor
     * @param nombre
     * @param tel
     * @param correo 
     */
    public Contacto (String nombre, String tel, String correo)   {
        this.nombre= nombre;
        this.tel=tel;
        this.correo=correo;
        
      }
    /**
     * Metodo que guarda el nombre del contacto
     * @param nombre 
     */
    public void guardarNombre(String nombre){
        this.nombre = nombre;
        
    }
    /**
     * Metodo que guarda el numero del contacto
     * @param tel 
     */
   public void guardarNumero (String tel){
       this.tel = tel;
   }
   /**
    * Metodo que guarda el correo  del contacto
    * @param correo 
    */
   public void guardarCorreo (String correo){
       this.correo = correo;
   }
   
    /**
     * Metodo que obtiene el nombre del contacto y lo devuelve
     * @return cadena de caracteres
     */
      public String getNombre (){
       return nombre;
}
      /**
       * 
       * Metodo que obtiene el numero del contacto y lo devuelve
       * @return cadena de caracteres
       */
      public String getNumero (){
          return tel;
      }
      /**
       * Metodo que obtiene el correo del contacto y lo devuelve
       * @return cadena de caracteres
       */
      public String getCorreo(){
    return correo;
      }
          
}

