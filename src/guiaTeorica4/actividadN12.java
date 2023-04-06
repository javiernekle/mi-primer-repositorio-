/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiaTeorica4;

import java.util.Scanner;

/**
 *
 * @author iso_b
 */
public class actividadN12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, 
sino informe que no lo son.*/

  
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        EsMultiplo(num1, num2);
    }

    public static void EsMultiplo(int num1, int num2) {
        if (num1 < num2) {
            if (num2 % num1 == 0) {
                System.out.println("El primer número es múltiplo");
            } else {
                System.out.println("El primer número NO es múltiplo");
            }
        } else if (num1 == num2) {
            System.out.println("Los números son iguales, por lo que si son múltiplos");
        } else {
            if (num1 % num2 == 0) {
                System.out.println("El segundo número es múltiplo");
            } else {
                System.out.println("El segundo número NO es múltiplo");
            }
        }
    }
}

    
    

