/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S10_24;

import java.util.ArrayList;

public class Main_S10_24 {
    
    public static ArrayList<seleccionFutbol_24> integrantes = new ArrayList<seleccionFutbol_24>();

    public static void main(String[] args) {
        Futbolista_24 Paolo = new Futbolista_24(9, "delantero", 1, "Paolo", "Guerrero", 39);
        Masajista_24 raulMartinez = new Masajista_24("si", 15, 2, "raul", "Martinez", 50);
        Entrenador_24 ricardoGareca = new Entrenador_24("uno", 1, "Ricardo", "Gareca", 65);
        
        integrantes.add(Paolo);
        integrantes.add(raulMartinez);
        integrantes.add(ricardoGareca);
        
        for (seleccionFutbol_24 integrante : integrantes) {
		System.out.print(integrante.getNombre()+" "+integrante.getApellido());
	}
    }
}
