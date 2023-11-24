/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_01;

public class Perro {
  //Atributos
    String nombre;
    int edad;
    String raza;
    boolean tieneVacunas;
    
    //Metodos
    void ladrar(){
        System.out.println("El perro esta ladrando");
    }
    
    void correr(){
        System.out.println("El perro esta corriendo");
    }
    
    void dormir(){
        System.out.println("El perro esta durmiendo");
    }
    
    void vacunar(){
        System.out.println("El perro fue vacunado");
        tieneVacunas = true;
    }
}
