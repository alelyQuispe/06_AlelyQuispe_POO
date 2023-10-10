/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_24;

public class empleado_E01 extends persona_E01 {
    //atributos
    String empresa;
    double salario;
    String puesto;

    public empleado_E01(String nombre, int edad, String empresa, double salario, String puesto) {
        super(nombre, edad);
        this.empresa = empresa;
        this.salario = salario;
        this.puesto = puesto;
    }

    public void trabajar() {
        System.out.println("Soy empleado en" + empresa + " y trabajo como " + puesto);
    }

    public void recibirSalario() {
        System.out.println("salario de este mes");
    }
}
