/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo_Default;

public class persona2 {
     // Atributos por defecto (package-private)
    String nombre;
    int edad;

    // Constructor por defecto
    persona2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método por defecto (package-private)
    void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}
