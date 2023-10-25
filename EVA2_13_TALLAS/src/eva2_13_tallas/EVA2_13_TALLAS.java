/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_13_tallas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_13_TALLAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String TALLA ;
Scanner sc = new Scanner(System.in);
System.out.print("Introduzca UNA TALLA: ");
TALLA = sc.nextLine();
switch (TALLA.toUpperCase()) {
case "29":
System.out.println("SMALL");
break;
case "42":
System.out.println("MEDIUM");
break;
case "44":
System.out.println("LARGE");
break;
case "48":
System.out.println("X LARGE");
break;
default:
System.out.println("VALOR DESCONOCIDO");
}
}
}
