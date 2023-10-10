/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_24;

public class persona_E01 {
    //atributos
    String nombre;
    int edad;

    public persona_E01(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + ".");
    }

    public void obtenerEdad() {
        System.out.println("Tengo " + edad + " años.");
    }
}
