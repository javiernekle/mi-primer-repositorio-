/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaTeorica3;

import java.util.Scanner;

/**
 *
 * @author iso_b
 */
public class actividadN10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
         e imprima el número ingresado seguido de tantos asteriscos como indique su valor. */
        
         Scanner leer = new Scanner(System.in);
         int cont = 0;
         int i;
         
         do {
            
             cont = cont +1;
            System.out.println("");
            System.out.println("Ingrese un numero");
            System.out.println("");
            int num = leer.nextInt();
            
         for (i = 0; i < num; i++) {
                System.out.print("*");
         }
        
         }while (cont != 4);
   
    }
}
