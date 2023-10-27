/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_15_promedio_califa;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_15_PROMEDIO_CALIFA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantCalifa;
Scanner input = new Scanner(System.in);

System.out.println("Introduce el numero de calificaciones a capturar:");

cantCalifa = input.nextInt();
int sumaCalifas = 0;
//ACUMULADOR
        for (int i = 1; i <= cantCalifa; i++) {
            System.out.println("Introduce la calificacion: ");  
            int califa = input.nextInt();  
            //ACUMULADOR
            sumaCalifas = sumaCalifas + califa;
            //sumaCalifas+=califa;
        }
        System.out.println("LA SUMATORIA = " + sumaCalifas);
        double promedio = sumaCalifas / (cantCalifa * 1.0);
        System.out.println("El promedio de la calificaiones es = " + promedio);
    }
    
}
