/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_01;

public class Gato {
     //Atributos
    String nombre;
    int edad;
    String colorPelo;
    boolean estaEsterilizado;
    
    //Metodos
    void maullar(){
        System.out.println("El gato esta maullando");
    }
    
    void jugar(){
        System.out.println("El gato esta jugando");
    }
    
    void dormir(){
        System.out.println("El gato esta durmiendo");
    }
    
    void esterilizar(){
        System.out.println("El gato fue esterilizado");
        estaEsterilizado = true;
    }
}
