/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s07v2_24;

/**
 *
 * @author Alely
 */
public class Persona_24 {
    // Atributos
    private String nombre;
    private int edad;
    private double altura;

    // Constructor
    public Persona_24(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // Métodos
    public void saludar() {
        System.out.println("Hola, mi nombre es " + this.nombre + ".");
    }

    public double calcularIMC(double peso) {
        double alturaMetros = this.altura / 100; // convertir altura de cm a metros
        double imc = peso / (alturaMetros * alturaMetros);
        return imc;
    }

    // Sobrecarga de método
    @Override
    public String toString() {
        return "Persona: " + this.nombre + ", Edad: " + this.edad + ", Altura: " + this.altura + " cm";
    }

    // Métodos con valores de retorno de diferentes tipos de datos
    public String obtenerNombre() {
        return this.nombre;
    }

    public double obtenerAltura() {
        return this.altura;
    }

    public void cambiarAltura(double nuevaAltura) {
        this.altura = nuevaAltura;
    }

    
}
