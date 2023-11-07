/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_ejercicio2_practicas_ciclos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_EJERCICIO2_PRACTICAS_CICLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número entero positivo: ");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entero positivo: ");
        int numero2 = scanner.nextInt();

        if (numero1 < 0 || numero2 < 0) {
            System.out.println("Por favor, introduce números enteros positivos.");
            return;
        }

  
        int inicio, fin;

        if (numero1 < numero2) {
            inicio = numero1;
            fin = numero2;
        } else {
            inicio = numero2;
            fin = numero1;
        }

        System.out.println("Números pares entre " + inicio + " y " + fin + ":");

        for (int i = inicio; i <= fin; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " - ");
            }
        }
    }
}
