/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_02;


public class CuentaBancaria {
    //Atributos
    String titular;
    String numeroCuenta;
    double saldo;
    String tipoCuenta;
    
    //Metodos
    void consultarSaldo(){
        System.out.println("saldo de la cuenta bancaria es X");
    }
    
    void depositar(){
        System.out.println("se deposito el monto de 10 000 soles");
    }
    
    void retirar(){
        System.out.println("No se puede retirar por que no hay suficiente saldo");
    }
    
    void tipoCuenta(){
        System.out.println("El tipo de cuenta es X");
    }
}
