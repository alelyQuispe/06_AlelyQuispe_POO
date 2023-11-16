/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S07_24AlelyQuispe;

/**
 *
 * @author Alely
 */
public class Main_S07_24AlelyQuispe {
    public static void main(String[] args) {
        // Persona_1
        // Crear una nueva persona
        Persona_1 persona1 = new Persona_1("Juan", 30, 1.75);
        
        // Mostrar información de la persona
        persona1.mostrarInformacion();
    
        // Persona_2
        Persona_2 persona2 = new Persona_2("Ana", 25, 1.68);
        
        System.out.println("Nombre: " + persona2.Nombre());
        System.out.println("Edad: " + persona2.Edad() + " años");
        System.out.println("Altura: " + persona2.Altura() + " metros");
    }
}
    
   
    
