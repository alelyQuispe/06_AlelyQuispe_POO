/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S10_24;

public class seleccionFutbol_24 {

//CLASE PADRE
    //constructor
    public seleccionFutbol_24(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    //Atributos
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;
    
    //Metodo concentrarse
    public void concentrarse(){
        System.out.println(getNombre() +"se esta concentrando");
    }
    //Metodo viajar
    public void viajar(){
        System.out.println("el viaje comenzo" + getNombre());
    }
    
    //GET Y SET

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
   
}
