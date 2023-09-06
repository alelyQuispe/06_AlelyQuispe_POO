/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg00_java_apllications;

import java.util.Scanner;

public class Persona {
    //atributos
    String nombre;
    int edad;
    
    public Persona(String nombre, int edad) {  //define el constructor de la clase Persona
        this.nombre = nombre; //se está asignando el valor del parámetro nombre, "this" se define al atributo nombre
        this.edad = edad;
    }
    
    //metodos
    public void hablar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(nombre + " dice: ");
        String mensaje = scanner.nextLine();
        System.out.println(nombre + " dice: " + mensaje);
    }
    
    public void levantarMano() {
        System.out.println(nombre + " levanta la mano");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa la edad de la persona: ");
        int edad = scanner.nextInt();

        Persona persona = new Persona(nombre, edad);

        System.out.println("Hola, " + persona.nombre + ". ¿Qué deseas hacer?");
        System.out.println("1. Hablar");
        System.out.println("2. Levantar la mano");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                persona.hablar();
                break;
            case 2:
                persona.levantarMano();
                break;
            default:
                System.out.println("Opción no válida");
        }

    }
}

