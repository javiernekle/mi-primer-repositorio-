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
public class ActividadN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    /*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado 
e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al usuario 
si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */




      Scanner leer = new Scanner(System.in);
        String fin;
        do {
            System.out.print("Ingrese un nombre: ");
            String nombre = leer.next();
            System.out.print("Ingrese una edad: ");
            int edad = leer.nextInt();
            mostrar(nombre, edad);
            System.out.println("Desea continuar? Si/No");
            fin = leer.next();
        } while (!(fin.equals("No")));
    }

    public static void mostrar(String nombre, int edad) {
        if (edad >= 18) {
            System.out.println(nombre + " tiene " + edad + " años y es mayor de edad");
        } else {
            System.out.println(nombre + " tiene " + edad + " años y NO es mayor de edad");
        }
    }

    public static String nombre(Scanner l) {
        String nombre = l.next();
        return nombre;
    }

    public static int edad(Scanner l) {
        int edad = l.nextInt();
        return edad;
    }
   
}
