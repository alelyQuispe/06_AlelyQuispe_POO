/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S10_24;

public class Entrenador_24 extends seleccionFutbol_24{
    
    //constructor
    public Entrenador_24(String idFederacion, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }
    
    
    //Atributos
    private String idFederacion;
    
    
    //Metodo dirigirPartido
    public void dirigirPartido(){
        
    }
    //Metodo dirigirEntrenamiento
    public void dirigirEntrenamiento(){
        System.out.println(nombre + "es el entrenador");
    }
}
