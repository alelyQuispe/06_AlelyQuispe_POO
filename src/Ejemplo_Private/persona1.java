/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo_Private;

public class persona1 {
    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor público
    public persona1(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método público para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método público para obtener la edad
    public int getEdad() {
        return edad;
    }

    // Método público para levantar la mano
    public void levantarMano() {
        System.out.println("¡Hola! Soy " + nombre + " y estoy levantando la mano.");
    }
}
