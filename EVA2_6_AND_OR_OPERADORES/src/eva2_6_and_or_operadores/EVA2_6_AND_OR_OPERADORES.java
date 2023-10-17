/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_and_or_operadores;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_6_AND_OR_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int califa;

        System.out.println("Ingresa tu calificacion");
        califa = input.nextInt();
        
        if (( califa >= 0 ) && (califa <= 100)){
        System.out.println("La calificacion "+ califa +" es valida!!"); 
        
        if(califa >= 70)
                System.out.println("Acreditas");
        else 
                System.out.println("No acreditas70");
        }else 
            System.out.println("La calificacion " + califa + " NO es valida!!");
        
        
    }
    
}
