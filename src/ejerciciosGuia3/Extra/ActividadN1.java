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
public class ActividadN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

 */

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un tiempo en minutos");
        int minutos = leer.nextInt();
        int horas = minutos / 60;
        int dias = 0;
        while (horas >= 24) {
            horas -= 24;
            dias++;
        }
        System.out.println("Su equivalente en días es " + dias + " y horas " + horas);
    }
    
}
