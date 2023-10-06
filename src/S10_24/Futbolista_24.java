/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S10_24;

public class Futbolista_24 extends seleccionFutbol_24{
    
    //constructor
    public Futbolista_24(int dorsal, String demarcacion, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    
    //Atributos
    private int dorsal;
    private String demarcacion;
    
    //Metodo jugarPartido
    public void jugarPartido(){
        System.out.println(getNombre() + "esta jugando un partido");
    }
    //Metodo entrenar
    public void entrenar(){
        System.out.println(getNombre() + "esta entrenando");
    }
    
    //GET Y SET

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

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
