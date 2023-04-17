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
public class actividadN7 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        // TODO code application logic here
        
       /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. 
Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().*/

  Scanner leer = new Scanner(System.in);

  String cadena;
  int contadorcorrectas = 0;
  int contadorincorrectas = 0;

  do {      
 
System.out.println("ingrese una cadena");
 cadena = leer.next();
 
 boolean FDE = cadena.length() <=5 && cadena.startsWith("x") && cadena.endsWith("o");
 
 if (FDE) {
  contadorcorrectas ++;
 }else{
         
  contadorincorrectas ++;
 }
 }while (!"&&&&&".equals(cadena));
       
 System.err.println("_____________________________________");
 System.out.println("se ingresaron: " + contadorcorrectas   + " cadenas correctas");
 System.err.println("_____________________________________");
 System.out.println("se ingresaron: " + (contadorincorrectas -1 + " cadenas incorrectas"));
 System.err.println("_____________________________________");
    }

}    
