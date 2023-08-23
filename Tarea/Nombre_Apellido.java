/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nombre_apellido;
import javax.swing.JOptionPane;
/**
 *
 * @author Chris
 */
public class Nombre_Apellido {

    public static void main(String args [])
    {
        
         String Primerainformacion;
         
         String Segundainformacion;
         
         
         String Nombre;
         String Apellido;
         String Informacion;
         
        Primerainformacion = JOptionPane.showInputDialog("Escriba su Nombre");
                 
        Segundainformacion = JOptionPane.showInputDialog("Escriba su Apellido");
                
             Nombre = (Primerainformacion);
                     
             Apellido = (Segundainformacion);
                     
             Informacion = Nombre + "__" + Apellido;
             
             JOptionPane.showMessageDialog (null, "Su Nombre Completo  es " + Informacion,"Informe", JOptionPane.PLAIN_MESSAGE);

            System.exit(0);
            
             
    }
}
