/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo_Protected;

public class persona3 {
    // Atributos protegidos
    protected String nombre;
    protected int edad;

    // Constructor protegido
    protected persona3(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método protegido
    protected void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}
