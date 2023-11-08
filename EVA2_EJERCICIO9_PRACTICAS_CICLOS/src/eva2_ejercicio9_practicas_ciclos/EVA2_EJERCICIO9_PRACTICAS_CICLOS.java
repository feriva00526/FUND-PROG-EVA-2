/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_ejercicio9_practicas_ciclos;

import java.util.Scanner;

/**
 *
 * @author feriv
 */
public class EVA2_EJERCICIO9_PRACTICAS_CICLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        String cadena = scanner.nextLine();

        System.out.print("Introduce el carácter a buscar: ");
        char caracter = scanner.next().charAt(0);

        int contador = contarApariciones(cadena, caracter);

        System.out.println("El caracter '" + caracter + "' aparece " + contador + " veces en la cadena.");
    }

    public static int contarApariciones(String cadena, char caracter) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }
}




