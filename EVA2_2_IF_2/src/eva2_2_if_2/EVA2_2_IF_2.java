/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_if_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_2_IF_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor1, valor2;
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Introduce valor 1");
        valor1 = input.nextInt();
        
       System.out.println("Introduce valor 2");
        valor2 = input.nextInt();
        
        if (valor1 > valor2)
             System.out.println("El valor mas grande es: " + valor1);
        else{
            
            if (valor1 == valor2)
               System.out.println("Ambos son iguales");
            else 
                
               System.out.println("El valor mas grande es: " + valor2);
        }
                }
    
}
