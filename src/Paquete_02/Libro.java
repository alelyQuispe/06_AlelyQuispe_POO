/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_02;

public class Libro {
    //Atributos
    String titulo;
    String autor;
    int numPaginas;
    boolean Disponibilidad;
    
    //Metodos
    void detalles(){
        System.out.println("titulo:"+ titulo+ "autor:"+ autor);
    }
    
    void prestar(){
        if(Disponibilidad){
            Disponibilidad = false;
        System.out.println("El se presto");
        }else{
                System.out.println("El libro no se presto");
                }
    }
    
    void devolver(){
        System.out.println("El libro se devolvio");
    }
    
    void cambiarAutor(){
        System.out.println("El autor se cambio");
    }
}
