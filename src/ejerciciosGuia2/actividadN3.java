/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosGuia2;

import java.util.Scanner;

/**
 *
 * @author iso_b
 */
public class actividadN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Escribir un programa que pida una frase y la muestre toda en mayúsculas
       //y después toda en minúsculas. 
       
        Scanner leer = new Scanner(System.in);
       
        System.out.println("ingresa una frase");
        String frase = leer.next();

        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
    
}
