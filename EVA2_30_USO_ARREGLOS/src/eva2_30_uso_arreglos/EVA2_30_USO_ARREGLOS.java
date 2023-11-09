/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_30_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_30_USO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        String[] listaProd = new String [10];
        listaProd[0] = "Tacos";
        listaProd[1] = "Tortas";
        listaProd[2] = "Tamales";
        listaProd[3] = "Tlacoyos";
        listaProd[4] = "Tlayudas";
        listaProd[5] = "Tampinqueñas";
        listaProd[6] = "Tortas Ahogadas";
        listaProd[7] = "Tchilaquils";
        listaProd[8] = "T-Bone";
        listaProd[9] = "Tripas";
        
        double[] listPrecios = {20, 40, 15, 50, 30, 54, 60, 200, 400, 10};
        
        System.out.println("-----------MENU------------");
        for (int i = 0; i < listaProd.length; i++) {
            
            System.out.println("-" + listaProd[i] + ": $ " + listPrecios[i]);
            
            
        }
        
        System.out.println("----------------------------");
        int opc, cant;
        System.out.println("¿Que desea ordenar?");
        opc = input.nextInt();
         System.out.println("¿Cuantas ordenes?");
        cant = input.nextInt();
        
        System.out.println("Tu total es de: $" + (cant * listPrecios[opc]));
     
    }
    
}
