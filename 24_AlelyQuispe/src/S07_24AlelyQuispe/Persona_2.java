/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S07_24AlelyQuispe;


public class Persona_2 {
    
    //Atributos
    private String nombre;
    private int edad;
    private double altura;

    //Constructor
    public Persona_2(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public void Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String Nombre() {
        return nombre;
    }

    public void Edad(int edad) {
        this.edad = edad;
    }

    public int Edad() {
        return edad;
    }

    public void Altura(double altura) {
        this.altura = altura;
    }

    public double Altura() {
        return altura;
    }

    // Método para verificar si la persona es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}
    