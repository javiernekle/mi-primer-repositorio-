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
public class actividadN5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    /*Escriba un programa en el cual se ingrese un valor límite positivo,
y a continuación solicite números al usuario
hasta que la suma de los números introducidos supere el límite inicial.*/

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un límite positivo");
        int limite = leer.nextInt();
        int num = 0;
        int suma = num;
        while (suma <= limite) {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            suma += num;
        }

        System.out.println("La suma " + suma + " superó el límite");
    }
}