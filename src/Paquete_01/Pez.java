/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_01;

public class Pez {
    //Atributos
    String especie;
    int edad;
    String colorEscamas;
    String tamaño;
    
    //Metodos
    void nadar(){
        System.out.println("El pez esta nadando");
    }
    
    void tamaño(){
        System.out.println("El pez es grande");
    }
    
    void comer(){
        System.out.println("El pez esta comiendo");
    }
    
    void crecio(){
        edad++;
        System.out.println("El pez cumplio mas años");
    }
}
