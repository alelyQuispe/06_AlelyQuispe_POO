/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s07v2_24;

/**
 *
 * @author Alely
 */
public class Main_S07v2_24 {
    public static void main(String[] args) {
        // Crear objetos de la clase Persona
        Persona_24 persona = new Persona_24("Alice", 30, 165);

        // Usar métodos de la clase Persona
        persona.saludar();
        System.out.println("IMC: " + persona.calcularIMC(70));
        System.out.println(persona);

        // Cambiar edad y altura usando métodos con parámetros y argumentos
        persona.cambiarAltura(170);
        System.out.println(persona);

        // Obtener atributos usando métodos con valores de retorno
        System.out.println("Nombre: " + persona.obtenerNombre());
        System.out.println("Altura: " + persona.obtenerAltura() + " cm");
    }
}
