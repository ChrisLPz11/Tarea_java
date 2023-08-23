 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repetidor;
import javax.swing.JOptionPane;
/**
 *
 * @author Chris
 */
public class Repetidor {
           public static void main(String[] args){
 String NumeroStr = JOptionPane.showInputDialog("Ingrese el Numero de veces que desea repetir el Nombre:");
        
        int Numero = Integer.parseInt(NumeroStr);
        String Nombre = JOptionPane.showInputDialog("Ingrese El Nombre que desea Imprimir:");
        StringBuilder Resultado = new StringBuilder();
        for (int i = 0; i < Numero; i++) {
            Resultado.append(Nombre).append("\n");
        }
        JOptionPane.showMessageDialog(null, Resultado.toString());
    }
}
