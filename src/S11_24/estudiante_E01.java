/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_24;

public class estudiante_E01 extends persona_E01{
    //atributos
    String universidad;
    int matricula;
    String carrera;

    public estudiante_E01(String nombre, int edad, String universidad, int matricula, String carrera) {
        super(nombre, edad);
        this.universidad = universidad;
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public void estudiar() {
        System.out.println("estudio en" + universidad + " la carrera de " + carrera);
    }

    public void pagarMatricula() {
        System.out.println("ya pague mi matrícula.");
    }
}
