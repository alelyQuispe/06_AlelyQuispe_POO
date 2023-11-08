/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s06_metodos;

public class S06_Metodos {

    public static void main(String[] args) {
        //estudiante
        estudiante_24 estudiante1 = new estudiante_24();
        estudiante1.setNombre("Alice");
        estudiante1.setEdad(20);
        System.out.println("Estudiante 1 - Nombre: " + estudiante1.getNombre() + ", Edad: " + estudiante1.getEdad());

        estudiante_24 estudiante2 = new estudiante_24("Bob", 22);
        System.out.println("Estudiante 2 - Nombre: " + estudiante2.getNombre() + ", Edad: " + estudiante2.getEdad());

        // calculadora
        calculadora_24 calculadora = new calculadora_24();
        int sumaEnteros = calculadora.sumar(5, 10);
        System.out.println("Suma de enteros: " + sumaEnteros);

        int sumaTresEnteros = calculadora.sumar(2, 4, 6);
        System.out.println("Suma de tres enteros: " + sumaTresEnteros);

        double multiplicacionDecimales = calculadora.multiplicar(2.5, 3.5);
        System.out.println("Multiplicación de decimales: " + multiplicacionDecimales);
    }
}
