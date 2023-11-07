/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_ejercicio3_practicas_ciclos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_EJERCICIO3_PRACTICAS_CICLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
     
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Por favor, introduce un número entero positivo.");
            return;
        }

  
        int sumatoria = 0;
        for (int i = 1; i <= numero; i++) {
            sumatoria += i;
              System.out.print(i + " + ");
        }

        System.out.println("");
        System.out.println("La sumatoria desde 1 hasta " + numero + " es: " + sumatoria);
        
    }
}

    
    

