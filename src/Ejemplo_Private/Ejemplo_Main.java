/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo_Private;

public class Ejemplo_Main {
    public static void main(String[] args) {
        persona1 objPer = new persona1("Juan", 25);

        // Acceder a los atributos y llamar al método
        System.out.println("Nombre: " + objPer.getNombre());
        System.out.println("Edad: " + objPer.getEdad());
        objPer.levantarMano();
    }
}
