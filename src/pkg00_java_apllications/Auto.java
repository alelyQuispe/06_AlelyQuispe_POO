/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg00_java_apllications;

import javax.swing.JOptionPane;

public class Auto {
    //Atributos    
    String marca;
    String color;
    int km;
  
    // Método para crearAuto esto permite mantener los atributos y se puede llamar desde la clase Auto
    public static Auto crearAuto() {
        Auto auto = new Auto();
        return auto;
    }
    
    // Método para acelerar el auto
    public void acelerar() {
        if (km >= 20) {
            JOptionPane.showMessageDialog(null, "El auto de color " + color + " acelera.");
        } else {
            JOptionPane.showMessageDialog(null, "El auto de color " + color + " no aceleró.");
        }
    }

    public static void main(String[] args) {
        Auto auto = new Auto();

        // Obtener la marca del auto
        auto.marca = JOptionPane.showInputDialog("Ingrese la marca del auto:");

        // Obtener el color del auto
        auto.color = JOptionPane.showInputDialog("Ingrese el color del auto:");

        // Obtener los kilómetros como cadena y convertirlo a entero
        String kmStr = JOptionPane.showInputDialog("Ingrese los kilómetros del auto:"); // solo acepta numeros no numeros+km
        auto.km = Integer.parseInt(kmStr);

        // Llamar al método acelerar para mostrar el mensaje
        auto.acelerar();
    }
}
