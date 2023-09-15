
package Paquete_Metodo_Principal;

import Paquete_Prueba1.Clase1;
import Paquete_Prueba1.Clase2;
import Paquete_Prueba2.Clase3;


public class Clase_metodo_principal {
    public static void main(String[] args) {
        Clase1 objclas = new Clase1();
        Clase2 objclas2 = new Clase2();
        Clase3 objclas3 = new Clase3();
        
        Clas objclas = objclas;
        objclas2.b = "texto";
        objclas3.b = "Hola";
        
        System.out.println("objclas2: " + objclas2.b);
        System.out.println("objclas3: " + objclas3.b);
    }
                
    }
