/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosGuia3.Extra;

import java.util.Scanner;

/**
 *
 * @author iso_b
 */
public class actividadN8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
    /*Escriba un programa que lea números enteros. 
Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos,
la cantidad de números pares y la cantidad de números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
Nota: recordar el uso de la sentencia break. */

 Scanner leer = new Scanner(System.in);
        int num;
        int contadorPar = 0;
        int contadorImpar = 0;
        int contador = 0;
        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            if (num > 0) {
                if (num % 2 == 0) {
                    contadorPar++;
                } else {
                    contadorImpar++;
                }
            }
            contador++;
        } while (!(num % 5 == 0));
        System.out.println("Se leyeron " + contador + " números");
        System.out.println("Se leyeron " + contadorPar + " números pares");
        System.out.println("Se leyeron " + contadorImpar + " números impares");
    }
    
    
}
