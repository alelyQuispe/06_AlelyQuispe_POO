/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplo_Protected;

public class Main_protected {

    public static void main(String[] args) {
        persona3 persona = new persona3("Ana", 28);

        // Acceder a los atributos y llamar al método
        System.out.println("Nombre: " + persona.nombre);  // se dio acceso con respecto a la protección de los paquete
        System.out.println("Edad: " + persona.edad); 
        persona.saludar();                                
    }
    
}
