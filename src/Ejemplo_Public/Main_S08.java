/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo_Public;

public class Main_S08 {
    public static void main(String[] args) {
        persona persona1 = new persona("Alely", 19);

        // Acceder a los atributos y llamar al método
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Edad: " + persona1.edad);
        persona1.saludar();
    }
}
