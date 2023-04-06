/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosGuia4;

import java.util.Scanner;

/**
 *
 * @author iso_b
 */
public class actividad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro 
para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, 
ya que 25 es divisible entre 5, sin embargo, 17 si es primo.*/

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un número para validar si es primo!");
        int num = leer.nextInt();
        System.out.println(esPrimo(num));
    }

        public static boolean esPrimo(int num) {
        int contador = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
            }
            if (contador > 2) {
                break;
            }
        }
        return contador <= 2;
    }
    
}
