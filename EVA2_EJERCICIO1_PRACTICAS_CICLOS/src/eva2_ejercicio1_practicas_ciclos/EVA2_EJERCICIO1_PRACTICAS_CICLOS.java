/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_ejercicio1_practicas_ciclos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_EJERCICIO1_PRACTICAS_CICLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);

    

        // Solicitar al usuario dos números enteros positivos
        System.out.print("Introduce el primer número entero positivo: ");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entero positivo: ");
        int numero2 = scanner.nextInt();

        // Verificar si los números son positivos
        if (numero1 < 0 || numero2 < 0) {
            System.out.println("Por favor, introduce números enteros positivos.");
            return;
        }

        // Imprimir todos los números entre ellos en orden ascendente
        int inicio, fin;

        if (numero1 < numero2) {
            inicio = numero1;
            fin = numero2;
        } else {
            inicio = numero2;
            fin = numero1;
        }

        for (int i = inicio; i <= fin; i++) {
            System.out.print(i + " - ");
        }
    }
}


    
    

