/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.area_volumen;
import javax.swing.JOptionPane;
/**
 *
 * @author Chris
 */
public class Area_Volumen {
 public static void main(String[] args) {
         
        String radioString = JOptionPane.showInputDialog("Ingrese el radio de la circunferencia:");
        double radio = Double.parseDouble(radioString);
        
        double area = Math.PI * Math.pow(radio, 2);

        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        JOptionPane.showMessageDialog(null, "El área de la circunferencia es: " + area);
        JOptionPane.showMessageDialog(null, "El volumen de la circunferencia es: " + volumen);
    }
}
