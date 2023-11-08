/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicios6_practicas_ciclos;

import java.util.Scanner;

/**
 *
 * @author feriv
 */
public class EVA2_EJERCICIOS6_PRACTICAS_CICLOS {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un número entero positivo
        System.out.print("Ingrese un numero entero positivo: ");
        int numero = scanner.nextInt();

        // Validar que el número sea positivo
        if (numero < 0) {
            System.out.println("El numero debe ser positivo.");
        } else {
            // Convertir a binario usando un ciclo
            String binario = "";
            while (numero > 0) {
                int residuo = numero % 2;
                binario = residuo + binario;
                numero = numero / 2;
            }

            // Mostrar el resultado
            System.out.println("El equivalente en sistema binario es: " + binario);
        }
    }

}

