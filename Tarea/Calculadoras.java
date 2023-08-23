/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoras;
import javax.swing.JOptionPane;
/**
 *
 * @author Chris
 */
public class Calculadoras {

    public static void main(String[] args) {
    while (true) {
            String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir", "Salir"};
            String operacion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione la operación:",
                "Calculadora ",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]
            );

            if (operacion == null || operacion.equals("Salir")) {
                JOptionPane.showMessageDialog(null, "¡Hasta luego Usuario :) !");
                break;
            }

            double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
            double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));
            double resultado = 0;

            switch (operacion) {
                case "Suma" -> resultado = numero1 + numero2;
                case "Resta" -> resultado = numero1 - numero2;
                case "Multiplicación" -> resultado = numero1 * numero2;
                case "División" -> {
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        JOptionPane.showMessageDialog(null, "No se puede dividir por el numero cero.");
                        continue;
                    }
            }
                default -> {
                    JOptionPane.showMessageDialog(null, "Opción es inválida.");
                    continue;
            }
            }

            JOptionPane.showMessageDialog(null, "El resultado de la operacion es : " + resultado);
        }
    }
} 