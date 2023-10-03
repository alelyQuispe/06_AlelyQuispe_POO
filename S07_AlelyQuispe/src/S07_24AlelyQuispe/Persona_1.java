/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S07_24AlelyQuispe;


public class Persona_1 {
    // Atributos
    private String nombre;
    private int edad;
    private double altura;
    
    // Constructor
    public Persona_1(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    
    // Método para establecer el nombre
    public void Nombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Método para establecer la edad
    public void Edad(int edad) {
        this.edad = edad;
    }
    
    // Método para establecer la altura
    public void Altura(double altura) {
        this.altura = altura;
    }
    
    // Método para obtener el nombre
    public String Nombre() {
        return nombre;
    }
    
    // Método para obtener la edad
    public int Edad() {
        return edad;
    }
    
    // Método para obtener la altura
    public double Altura() {
        return altura;
    }
    
    // Método para mostrar información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " metros");
    }
}
