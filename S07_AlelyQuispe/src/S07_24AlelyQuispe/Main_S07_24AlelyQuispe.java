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

    /*// Persona_1
    public static void main(String[] args) {
        // Crear una nueva persona
        Persona_1 persona1 = new Persona_1("Juan", 30, 1.75);
        
        // Mostrar información de la persona
        persona1.mostrarInformacion();
    }
}*/


// Persona_2
    public static void main(String[] args) {
        Persona_2 persona1 = new Persona_2("Ana", 25, 1.68);
        
        System.out.println("Nombre: " + persona1.Nombre());
        System.out.println("Edad: " + persona1.Edad() + " años");
        System.out.println("Altura: " + persona1.Altura() + " metros");

        if (persona1.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona es menor de edad.");
        }
    }
}
    
   
    
