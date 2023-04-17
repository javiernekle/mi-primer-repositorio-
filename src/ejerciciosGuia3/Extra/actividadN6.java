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
public class actividadN6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      /*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
      por debajo de 1.60 mts. y el promedio de estaturas en general.*/
        
         Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int cantidadPersonas = leer.nextInt();
        int altura;
        int bajitos = 0;
        int promedioTotal = 0, promedioBajos = 0;
        for (int i = 0; i < cantidadPersonas; i++) {
            
            System.out.println("Ingrese la altura de la persona");
            altura = leer.nextInt();
            promedioTotal += altura;
           
            if (altura <= 160) {
                bajitos++;
                promedioBajos += altura;
            }
        }
        promedioTotal /= cantidadPersonas;
        promedioBajos /= bajitos;
        System.out.println("El promedio de personas bajitas es de " + promedioBajos);
        System.out.println("El promedio de personas totales es de " + promedioTotal);

    }
    
}
