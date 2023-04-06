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
public class actividadN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
        //El programa deberá después mostrar el resultado de la suma

        
 Scanner leer = new Scanner(System.in);
 
  System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        //Definir num Como Entero;
        //Leer num;
        //inicialización.
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        
        System.out.println("La suma de los números es: " + suma);
    }
    
}
