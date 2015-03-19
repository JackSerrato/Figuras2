/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Ingenieria
 */
public abstract class Figura 
{
    
    protected double area;
    protected double volumen;
    protected String texto;
    
    
     abstract void calcularArea();
   
    abstract  void calcularVolumen();
    
    abstract  void pintar();
    
    
   abstract  void cambiarTexto(String txt);
   {
        String txt;
       
      
   }
    
}
