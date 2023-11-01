/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_22_do_while;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_22_DO_WHILE {

   final static String NOMBRE_USUARIO = "Admin";
final static String PASSWORD = "Admin";


public static void main(String[] args){

String usuario;
String pwd;
Scanner input = new Scanner(System.in);

do{
    System.out.println("--------------------------------------------------------");
    System.out.println("Introduce usuario");
    usuario = input.nextLine();
    System.out.println("Introduce contraseña");
    pwd = input.nextLine();

} while((!usuario.equals(NOMBRE_USUARIO))||(!pwd.equals(PASSWORD)));
    System.out.println(" Bienvenido al Sistema :) ");
        
    }
    
}
