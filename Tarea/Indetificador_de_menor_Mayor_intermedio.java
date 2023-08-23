/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.indetificador_de_menor_mayor_intermedio;
import javax.swing.JOptionPane;
/**
 *
 * @author Chris
 */
public class Indetificador_de_menor_Mayor_intermedio {

       public static void main(String[] args) {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        double numero3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer número:"));

        double mayor = Math.max(numero1, Math.max(numero2, numero3));
        double menor = Math.min(numero1, Math.min(numero2, numero3));
        double intermedio = numero1 + numero2 + numero3 - mayor - menor;

        String mensaje = "Número mayor: " + mayor + "\n" +
                         "Número menor: " + menor + "\n" +
                         "Número intermedio: " + intermedio;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
