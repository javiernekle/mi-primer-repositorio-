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
public class actividadN6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
  /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.*/

     Scanner leer = new Scanner(System.in); 
  
     System.out.println("ingrese 2 numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        String opción;
       
  do{
          System.out.println("menú"
          + "\n1. sumar" 
          + "\n2. restar"
          + "\n3. multplicar"    
          + "\n4. dividir"
          + "\n5. salir"
          + "\nElija una opción");  
          opción = leer.nextLine();
       
  switch (opción){
       
                case "1":
                System.err.println(" la suma es: " + (num1 + num2 ));
                break;
                case "2":
                System.err.println(" la resta es: " + (num1 - num2));
                break;
                case "3":
                System.err.println("la multiplicacion es: " + (num1 * num2));
                 case "4":
                System.err.println("la divicion es: " + (num1 / num2));
                break;
                case "5":
                System.out.println("estas seguro de que desaea salir del programa? (S.N) ");
                opción = leer.next();
         }
  
  }while (!"S".equalsIgnoreCase(opción));
        
    }
    
}

