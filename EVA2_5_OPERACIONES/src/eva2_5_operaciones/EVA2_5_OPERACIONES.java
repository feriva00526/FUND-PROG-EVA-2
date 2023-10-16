/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_operaciones;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_5_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        // TODO code application logic here
              
        Scanner input = new Scanner(System.in);
        int suma, val1, val2;
        
        val1= 100;
        val2= 200;
        suma= val1 + val2;
        System.out.println("SUMA------------");
        System.out.println("La suma es = " + suma);
//RESTULTADO SUMA
    //RESTA

int resta;
resta = val2 - val1;
        System.out.println("RESTA------------");
        System.out.println("La resta es = " + resta);
    //MULTIPLICACION

int multi;

multi= val1 * val2;

        System.out.println("MULTIPLICACION----");
        System.out.println("El resultado es =" + multi);
        
        //DIVISION
  int divi;
  val1= 11;
  val2 = 2;
  divi = val2 / val1;
  
        System.out.println("DIVISION------------");
        System.out.println("El resultado de la division de 11/2 es = " + divi);
        int residu = val1 % val2;
        System.out.println("El residuo de 11/2 = "  + residu);
        
        
        double resu = val1 / val2;
        
        System.out.println("El resultado de 11/2 es = " + resu);
        
        double val2Double = 2;
            resu = val1 / val2Double;
            System.out.println("La division de 11/2 es = " + resu);
        
            resu = 11/2.0;
            System.out.println("La division 11/2.0 = " +resu);
    
            //POTENCIA
          double potencia =  Math.pow(3, 3);
          
          System.out.println("POTENCIA------------");
          System.out.println("3 elvado a la 3 =" + potencia);
           double raiz =  Math.pow(100, 0.5);
          
          System.out.println("POTENCIA------------");
          System.out.println("Raiz cuadrada de 100 es  =" + raiz);
          
          //presedencia de operaciones
          int resuOp, x =3, y=2, z=5;
          
          resuOp = (x*z)+(x*y)/2 - (y-z);
          //(15) + (6)/2 - (-3)
          //15 + 3 -(-3)
          //15 + 3 + 3 = 21
          System.out.println("Resultado es = " + resuOp);
          
          System.out.println("FORMULA GENERAL-------");
          double resuForm, a=3, b=9, c=3;
          
          resuForm= ((-b)- Math.pow(((b * b)-(4*a*c)), 0.5))/(2*a);
          System.out.println("El resultado de la Formua General fue =" + resuForm);
         
    }
    
}
