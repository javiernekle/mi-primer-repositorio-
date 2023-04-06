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
public class actividadN4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
        //La fórmula correspondiente es: F = 32 + (9 * C / 5).
        //Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de grados centígrados");
        
         Scanner leer = new Scanner(System.in);
             
        double centigrados = leer.nextDouble();
        double F = 32 + (9 * centigrados / 5);
       
        System.out.println("Los grados convetidos a Fahrenheit son: " + F);
    }
    
}
