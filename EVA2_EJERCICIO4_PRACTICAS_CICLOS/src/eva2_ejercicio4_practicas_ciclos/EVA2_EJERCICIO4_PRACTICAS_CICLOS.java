/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_ejercicio4_practicas_ciclos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_EJERCICIO4_PRACTICAS_CICLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        int respuesta;
        
        do {
            // Solicitar un número al usuario
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();

            // Determinar si el número es positivo, negativo o cero
            if (numero > 0) {
                System.out.println("El número es positivo.");
            } else if (numero < 0) {
                System.out.println("El número es negativo.");
            } else {
                System.out.println("El número es cero.");
            }

            // Preguntar al usuario si desea terminar el programa
            System.out.print("¿Deseas terminar el programa? (s/n): ");
            respuesta = scanner.next().charAt(0);
        } while (respuesta != 's' && respuesta != 'S');
    }
}

    
    

