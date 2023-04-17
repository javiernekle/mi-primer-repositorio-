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
public class actividadN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        /* Crear un programa que dado un número determine si es par o impar.*/
      
        Scanner leer = new Scanner(System.in);
        
         
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        // declarar e inicializar
        if(num % 2 == 0){
            System.out.println("es par");
    }else{
            System.out.println("es impar");
        }  
    }
}

