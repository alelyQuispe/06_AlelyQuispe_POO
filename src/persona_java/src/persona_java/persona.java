/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona_java;

/**
 *
 * @author Alely
 */
public class persona {
    //Atributos
    String nombre;
    int edad;
    double altura;

    //Metodos
    public persona (String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    
    //metodo retorno String
    public void Nombre(String nombre) {
        this.nombre = nombre;
    }

    public String Nombre() {
        return nombre;
    }
    //metodo retorno Int
    public void Edad(int edad) {
        this.edad = edad;
    }

    public int Edad() {
        return edad;
    }
    //metodo retorno Double
     public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
    //metodo1
    public String saludo() {
        return "mi nombre es " + nombre + ",mi es" + edad + " y mido " + altura + " metros.";
    }
     // sobrecarga Método1
    public String saludo1(String persona) {
        return "Hola " + persona + ", soy " + nombre + ".";
    }
}
