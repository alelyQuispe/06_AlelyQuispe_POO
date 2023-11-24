/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_03;

public class Proyecto {
    //Atributos
    String nombre;
    String descripcion;
    int duracion;
    int presupuesto;
    
    //Metodos
    void MostrarDetalles(){
        System.out.println("nombre:" + nombre + "descripcion:" + descripcion);
    }
    
    void inversion(){
        System.out.println("la inversion se realizo, aumento de presupuesto");
    }
    
    void tiempo(){
        System.out.println("La duracion del proyecto se extendio");
    }
    
    void descripcion(){
        System.out.println("Se modifico la descripcion del proyecto");
    }
}
