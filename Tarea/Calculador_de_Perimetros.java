/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculador_de_perimetro;
import javax.swing.JOptionPane;
/**
 *
 * @author Chris
 */
public class Calculador_de_Perimetros {

 public static void main(String[] args) {
       
        String ladoAString = JOptionPane.showInputDialog("Ingrese la longitud del Primer lado:");
        double ladoA = Double.parseDouble(ladoAString);

        String ladoBString = JOptionPane.showInputDialog("Ingrese la longitud del Segundo lado :");
        double ladoB = Double.parseDouble(ladoBString);

        String ladoCString = JOptionPane.showInputDialog("Ingrese la longitud del Tercer lado :");
        double ladoC = Double.parseDouble(ladoCString);

        double perimetro = ladoA + ladoB + ladoC;
        JOptionPane.showMessageDialog(null, "El perímetro del triángulo es: " + perimetro);
    }
}
