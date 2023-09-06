/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg00_java_apllications;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Calculadora objCalculadora1 = new Calculadora();
        
        JOptionPane.showMessageDialog(null, "Bienvenido, realice su operacion");

        objCalculadora1.preguntar();

        objCalculadora1.sumar();
        objCalculadora1.multiplicar();
        objCalculadora1.restar();

        /*objCalculadora1.mostrarValores();*/
        JOptionPane.showMessageDialog(null, "Los resultados son:\n" +
                "Suma: " + objCalculadora1.totalSuma +
                "\nResta: " + objCalculadora1.totalResta +
                "\nMultiplicación: " + objCalculadora1.totalMultiplicar);
    }
}
