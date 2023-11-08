/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s06_metodos;

public class calculadora_24 {
    //Atributos
    int num1;
    int num2;

    // Método para sumar dos números enteros
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    // Método para sumar tres números enteros (sobrecarga del método anterior)
    public int sumar(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Método para multiplicar dos números enteros
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    // Método para multiplicar dos números decimales (sobrecarga del método anterior)
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
}
