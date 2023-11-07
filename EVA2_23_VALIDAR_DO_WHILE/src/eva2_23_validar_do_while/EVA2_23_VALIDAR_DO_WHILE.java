/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_validar_do_while;

import java.util.Scanner;

/**
 *
 * @author feriv
 */


public class EVA2_23_VALIDAR_DO_WHILE {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuario;
        String contraseña;

        do {
            System.out.print("Ingrese el nombre de usuario: ");
            usuario = scanner.nextLine();

            System.out.print("Ingrese la contraseña: ");
            contraseña = scanner.nextLine();

            if (usuario.equals("admin") && contraseña.equals("admin")) {
                System.out.println("Acceso concedido");
                break;
            } else {
                System.out.println("Acceso denegado. Inténtelo de nuevo.");
            }
        } while (true);

        scanner.close();
    }
}
