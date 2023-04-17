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
        
    /*Escriba un programa en el cual se ingrese un valor limite positivo,
y a continuación solicite números al usuario
hasta que la suma de los números introducidos supere el límite inicial.*/

        Scanner leer = new Scanner(System.in);
        
        int auxiliar = 0;
        
        System.out.println("ingrese un valor limite");
        int limite = leer.nextInt();
        
        while (auxiliar < limite){
              
        System.out.println("ingrese un numero");
        int num = leer.nextInt();
        auxiliar += num;
        }
        System.err.println("el numero: " + auxiliar + " a exedido el limite");  
      
    }
    }


    
