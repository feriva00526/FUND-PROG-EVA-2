/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicios8_practicas_ciclos;

import java.util.Scanner;

/**
 *
 * @author feriv
 */
public class EVA2_EJERCICIOS8_PRACTICAS_CICLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        char caracter;

        do {
            System.out.print("Introduce un caracter (o espacio para salir): ");
            caracter = scanner.nextLine().charAt(0);

            if (Character.isLetter(caracter)) {
                caracter = Character.toLowerCase(caracter);
                if (esVocal(caracter)) {
                    System.out.println("Es una vocal.");
                } else {
                    System.out.println("Es una consonante.");
                }
            } else if (caracter != ' ') {
                System.out.println("Por favor, introduce un caracter alfabético.");
            }

        } while (caracter != ' ');
    }

    public static boolean esVocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
}
