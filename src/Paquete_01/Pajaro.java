/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_01;

public class Pajaro {
    //Atributos
    String especie;
    int edad;
    String colorPlumaje;
    boolean puedeVolar;
    
    //Metodos
    void cantar(){
        System.out.println("El pajaro esta cantando");
    }
    
    void volar(){
        System.out.println("El pajaro esta volando");
    }
    
    void comer(){
        System.out.println("El pajaro esta comiendo");
    }
    
    void envejecer(){
        edad++;
        System.out.println("El pajaro envejecio");
    }
}
