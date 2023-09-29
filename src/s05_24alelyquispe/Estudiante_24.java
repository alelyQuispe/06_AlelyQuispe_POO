/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s05_24alelyquispe;
import javax.swing.JOptionPane;

public class Estudiante_24 {
   private String nombre;
 private int edad;

 public Estudiante_24(String nombre, int edad) {
 this.nombre = nombre;
 this.edad = edad;
 }

 public void mostrarDatos() {
 JOptionPane.showMessageDialog(null, "Estudiante:\nNombre: " + nombre + "\nEdad: " + edad);
 }
}
