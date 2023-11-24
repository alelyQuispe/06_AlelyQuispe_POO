/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_02;

public class Coche {
    //Atributos
    String marca;
    int modelo;
    double precio;
    int fabricacion;
    
    //Metodos
    void detalles(){
        System.out.println("marca:"+ marca+ "modelo:"+ modelo);
    }
    
    void descuento(){
        System.out.println("El coche no tiene descuento");
    }
    
    void Aumento(){
        System.out.println("El coche tiene un aumento de precio");
    }
    
    void tipoModelo(){
        System.out.println("El modelo del coche es X");
    }
}
