/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_10_carreras;

import java.util.Scanner;

public class EVA2_10_CARRERAS {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa la abreviación de la Carrera:");
        String abreviacion = input.next().toUpperCase();

        switch (abreviacion) {
            case "ISC":
                System.out.println("Ingeniería en Sistemas Computacionales");
                break;

            case "INF":
                System.out.println("Ingeniería Informática");
                break;

            case "LA":
                System.out.println("Licenciatura en Administración");
                break;

            case "ARQ":
                System.out.println("Arquitectura");
                break;

            case "IND":
                System.out.println("Ingeniería Industrial");
                break;

            case "IDI":
                System.out.println("Ingeniería en Diseño Industrial");
                break;

            case "IGE":
                System.out.println("Ingeniería en Gestión Empresarial");
                break;

            default:
                System.out.println("La abreviación ingresada no corresponde a una carrera.");
                break;
        }
    }
}

