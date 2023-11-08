/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicio10_practicas_ciclos;

import java.util.Scanner;

/**
 *
 * @author feriv
 */
public class EVA2_EJERCICIO10_PRACTICAS_CICLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();

        if (esNumero(cadena)) {
            System.out.println("La cadena representa un numero valido.");
        } else {
            System.out.println("La cadena no representa un numero valido.");
        }
    }

    public static boolean esNumero(String cadena) {
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
