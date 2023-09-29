/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s05_24alelyquispe;

import javax.swing.JOptionPane;
import java.util.Scanner;
public class S05_24AlelyQuispe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Estudiante_24 estudiante= new Estudiante_24("Juan Perez", 20);
 Libro_24 libro = new Libro_24("La Odisea", "Homero");

 estudiante.mostrarDatos();
 libro.mostrarDatos();

 Scanner scanner = new Scanner(System.in);

 System.out.print("Ingrese el titular de la cuenta bancaria: ");
 String titularCuenta = scanner.nextLine();
 System.out.print("Ingrese el saldo de la cuenta bancaria: ");
 double saldoCuenta = scanner.nextDouble();

 CuentaBancaria_24 cuenta = new CuentaBancaria_24(titularCuenta, saldoCuenta);
 cuenta.mostrarDatos();

 scanner.nextLine(); // Limpiar el buffer del teclado

 System.out.print("Ingrese la marca del auto: ");
 String marcaAuto = scanner.nextLine();
 System.out.print("Ingrese el modelo del auto: ");
 String modeloAuto = scanner.nextLine();

 Auto_24 auto = new Auto_24(marcaAuto, modeloAuto);
 auto.mostrarDatos();
    }
    
}
