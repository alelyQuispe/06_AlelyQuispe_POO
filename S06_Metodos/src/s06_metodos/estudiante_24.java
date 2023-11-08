/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s06_metodos;

public class estudiante_24 {
    //Atributos
    private String nombre;
    private int edad;

    // Constructor sin parámetros
    public estudiante_24() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }

    // Constructor con parámetros
    public estudiante_24(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para establecer el nombre del estudiante
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para establecer la edad del estudiante
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para obtener el nombre del estudiante
    public String getNombre() {
        return this.nombre;
    }

    // Método para obtener la edad del estudiante
    public int getEdad() {
        return this.edad;
    }
}
