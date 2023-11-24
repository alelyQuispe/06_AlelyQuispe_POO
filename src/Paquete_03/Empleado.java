/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_03;

public class Empleado {
    //Atributos
    String nombre;
    String cargo;
    int edad;
    int salario;
    
    //Metodos
    void MostrarInformacion(){
        System.out.println("nombre:" + nombre + "cargo:" + cargo);
    }
    
    void trabajar(){
        System.out.println("El empleado esta trabjando");
    }
    
    void salario(){
        System.out.println("se le incremento el salario");
    }
    
    void cargo(){
        System.out.println("el empleado a sido promovido de cargo");
    }
}
