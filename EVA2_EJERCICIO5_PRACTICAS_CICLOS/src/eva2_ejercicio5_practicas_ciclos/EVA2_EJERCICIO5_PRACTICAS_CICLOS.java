/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicio5_practicas_ciclos;

import java.util.Scanner;

/**
 *
 * @author feriv
 */
public class EVA2_EJERCICIO5_PRACTICAS_CICLOS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Ingrese la base (numero entero positivo): ");
        int base = scanner.nextInt();

        System.out.print("Ingrese el exponente (numero entero positivo): ");
        int exponente = scanner.nextInt();

      
        if (base < 1 || exponente < 1) {
            System.out.println("Ambos numeros deben ser enteros positivos.");
        } else {
            
            int resultado = 1;
            for (int i = 1; i <= exponente; i++) {
                resultado *= base;
            }

         
            System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);
        }
    }
}
