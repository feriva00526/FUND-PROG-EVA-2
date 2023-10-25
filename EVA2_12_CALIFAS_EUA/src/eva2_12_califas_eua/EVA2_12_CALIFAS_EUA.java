/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_12_califas_eua;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_12_CALIFAS_EUA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
Scanner input = new Scanner(System.in);
int CALIFA;
System.out.print("INTRODUCE TU CALIFICACION DE 0-100: ");
CALIFA = input.nextInt();

if ((CALIFA >= 90) && (CALIFA <= 100)){
    System.out.println("A");
} 
else if ((CALIFA >= 80) && (CALIFA <= 89)){
      System.out.println("B");
    } 
    else  if ((CALIFA >= 70) && (CALIFA <= 79)){
          System.out.println("C");
       }
      else  if ((CALIFA >= 60) && (CALIFA <= 69)){
              System.out.println("D");
            }
          else if ((CALIFA < 60) && (CALIFA >= 0)){
              System.out.println("F");
}
             else {
                 System.out.println("CALIFICACION INVALIDA");
             }
                 
}}