/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosGuia3.Extra;

/**
 *
 * @author iso_b
 */
public class actividadN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, 
A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable.
Utilizar sólo una variable auxiliar.
 */

          
         int A,B,C,D,AUXILIAR;
          A = 1;
          B = 2;
          C = 3;
          D = 4;
          AUXILIAR = B;
       
          System.out.println("valores inicilaes son;" + " A = " + A + " B = " + B + " C = " + C + " D = " + D);
      
          if ( A != B && B != C && C != D);{
           B = C;
           C = A;
           A = D;
           D = AUXILIAR;
        
      }
           System.out.println("valores FINALES son;" + " A = " + A + " B = " + B + " C = " + C + " D = " + D);     
    }
}

    
