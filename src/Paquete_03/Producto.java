/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_03;

public class Producto {
    //Atributos
    String nombre;
    String categoria;
    int stock;
    int precio;
    
    //Metodos
    void MostrarDetalles(){
        System.out.println("nombre:" + nombre + "categoria:" + categoria);
    }
    
    void venta(){
        System.out.println("la venta de los productor se realizo con exito");
    }
    
    void precio(){
        System.out.println("El precio del producto:" + nombre +"equivale a 10 soles");
    }
    
    void stock(){
        System.out.println("Se modifico el stock del producto:" + nombre);
    }
}
