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
public class actividadN5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // Escribir un programa que lea un número entero por teclado
       //y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
       //Nota: investigar la función Math.sqrt().

        Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese un número");
        int numero = leer.nextInt();
        int numeroDoble = numero * 2;
        int numeroTriple = numero * 3;
        double raizCuadrada = Math.sqrt(numero);
        
        System.out.println("Su doble es: " + numeroDoble);
        System.out.println("Su triple es: " + numeroTriple);
        System.out.println("Su raiz cuadrada es: " + raizCuadrada);
    }
    
}
