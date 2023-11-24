/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo_Public;

public class persona {
    // Atributos públicos
    public String nombre;
    public int edad;

    // Constructor público
    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método público
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}
