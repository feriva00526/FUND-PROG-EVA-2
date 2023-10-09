/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner input = new Scanner(System.in);
        
        System.out.println("INTRODUCE LA CALIFICACION");
        
        califa = input.nextInt();
        
        if( califa >= 70){
            System.out.println("APROBADO: VIAJE A CANCUN!!!");
             System.out.println("FELICIDADES!!");
        }
        else  System.out.println("NO ACREDITADO: A PICAR PIEDRA"); 
        
         System.out.println("FIN DEL PROGRAMA!");
    }
    
}
