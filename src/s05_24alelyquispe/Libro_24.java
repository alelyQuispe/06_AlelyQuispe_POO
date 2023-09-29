/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s05_24alelyquispe;

import javax.swing.JOptionPane;

/**
 *
 * @author Alely
 */
public class Libro_24 {
  private String titulo;
 private String autor;

 public Libro_24(String titulo, String autor) {
 this.titulo = titulo;
 this.autor = autor;
 }

 public void mostrarDatos() {
 JOptionPane.showMessageDialog(null, "Libro:\nTítulo: " + titulo + "\nAutor: " + autor);
 }

}
