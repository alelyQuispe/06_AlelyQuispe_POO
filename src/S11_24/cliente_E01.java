/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_24;


public class cliente_E01 extends persona_E01{
    //atributos 
    String productoComprado;
    double totalCompra;
    String metodoPago;

    public cliente_E01(String nombre, int edad, String productoComprado, double totalCompra, String metodoPago) {
        super(nombre, edad);
        this.productoComprado = productoComprado;
        this.totalCompra = totalCompra;
        this.metodoPago = metodoPago;
    }

    public void comprar() {
        System.out.println("hola, soy cliente y he comprado un " + productoComprado + " por" + totalCompra +
                ". Método de pago: " + metodoPago);
    }

    public void realizarDevolucion() {
        System.out.println("He hecho un devolucion del producto");
    }
}
