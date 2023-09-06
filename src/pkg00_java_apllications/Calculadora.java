/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg00_java_apllications;

/*import javax.swing.JOptionPane;*/

import java.util.Scanner;

public class Calculadora {
    // Atributos
    int a;
    int b;
    int totalSuma;
    int totalResta;
    int totalMultiplicar;

    // Constructor
    public Calculadora() {
    }

    // Métodos
    public void sumar() {
        totalSuma = a + b;
    }

    public void multiplicar() {
        totalMultiplicar = a * b;
    }

    public void restar() {
        totalResta = a - b;
    }

    public void preguntar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el valor a: ");
        a = scanner.nextInt();

        System.out.print("Ingresa el valor b: ");
        b = scanner.nextInt();

        scanner.close();
    }

    public void mostrarValores() {
        System.out.println("La suma es " + totalSuma);
        System.out.println("La resta es " + totalResta);
        System.out.println("La multiplicación es " + totalMultiplicar);
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.preguntar();
        calculadora.sumar();
        calculadora.restar();
        calculadora.multiplicar();
        calculadora.mostrarValores();
    }
}
