/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S10_24;

public class Masajista_24 extends seleccionFutbol_24{
    
    //constructor
    public Masajista_24(String titulo, int añosExperiencia, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.titulo = titulo;
        this.añosExperiencia = añosExperiencia;
    }
    
    //Atributos
    private String titulo;
    private int añosExperiencia;
    
    
    //Metodo darMasaje
    public void darMasaje(){
        System.out.println(nombre + "da masajes");
    }
}
