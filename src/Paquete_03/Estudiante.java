/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_03;

public class Estudiante {
    //Atributos
    String nombre;
    String curso;
    int edad;
    int nota;
    
    //Metodos
    void MostrarInformacion(){
        System.out.println("nombre:" + nombre + "edad:" + edad);
    }
    
    void estudiar(){
        System.out.println(nombre + "esta estudiando");
    }
    
    void examen(){
        System.out.println(nombre + "tomo el examen y obtuvo una buena calificacion");
    }
    
    void curso(){
        System.out.println(nombre + "cambio a otros cursos");
    }
}
