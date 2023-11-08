/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicio7_practicas_ciclos;

import java.util.Scanner;

/**
 *
 * @author feriv
 */
public class EVA2_EJERCICIO7_PRACTICAS_CICLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
int numero;
        int numeroMinimo = Integer.MAX_VALUE;
        int numeroMaximo = Integer.MIN_VALUE;

        do {
            System.out.print("Ingrese un número (o un número negativo para salir): ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                if (numero < numeroMinimo) {
                    numeroMinimo = numero;
                }
                if (numero > numeroMaximo) {
                    numeroMaximo = numero;
                }
            }

        } while (numero >= 0);

        if (numeroMinimo == Integer.MAX_VALUE || numeroMaximo == Integer.MIN_VALUE) {
            System.out.println("No se ingresaron numeros positivos.");
        } else {
            System.out.println("El numero mas pequeño es: " + numeroMinimo);
            System.out.println("El numero mas grande es: " + numeroMaximo);
        }
    }
}

