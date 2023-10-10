/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_24;

public class main_S11_24_E01 {
    public static void main(String[] args) {
        estudiante_E01 estudiante = new estudiante_E01("Elena", 20, "Universidad X", 12345, "Ingeniería");
        empleado_E01 empleado = new empleado_E01("Carlos", 30, "Empresa Y", 50000, "Desarrollador");
        cliente_E01 cliente = new cliente_E01("María", 25, "teléfono móvil", 600, "Tarjeta de crédito");

        estudiante.saludar();
        estudiante.obtenerEdad();
        estudiante.estudiar();
        estudiante.pagarMatricula();

        empleado.saludar();
        empleado.obtenerEdad();
        empleado.trabajar();
        empleado.recibirSalario();

        cliente.saludar();
        cliente.obtenerEdad();
        cliente.comprar();
        cliente.realizarDevolucion();
    }
}
