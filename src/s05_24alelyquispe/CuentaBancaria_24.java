/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s05_24alelyquispe;

/**
 *
 * @author Alely
 */
public class CuentaBancaria_24 {
    private String titular;
 private double saldo;

 public CuentaBancaria_24(String titular, double saldo) {
 this.titular = titular;
 this.saldo = saldo;
 }

 public void mostrarDatos() {
 System.out.println("Cuenta Bancaria:\nTitular: " + titular + "\nSaldo: " + saldo);
 }
}
