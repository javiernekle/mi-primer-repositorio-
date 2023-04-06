/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosGuia3;

import java.util.Scanner;

/**
 *
 * @author iso_b
 */
public class actividadN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leer = new Scanner(System.in);
        
         
        System.out.println("Ingrese una frase");
        String frase = leer.next();
        // declarar e inicializar
        if(frase.equals("eureka hola")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }  
    }
    
}
