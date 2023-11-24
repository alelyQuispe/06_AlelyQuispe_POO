/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplo_Default;

public class Ejemplo_Default {

    public static void main(String[] args) {
        persona2 persona = new persona2("Carlos", 30);

        // Acceder a los atributos y llamar al método
        System.out.println("Nombre: " + persona.nombre);
        System.out.println("Edad: " + persona.edad);
        persona.saludar();
    }
    
}
