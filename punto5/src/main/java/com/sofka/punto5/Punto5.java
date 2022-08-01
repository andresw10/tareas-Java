/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sofka.punto5;

import java.util.Scanner;

/**
 *
 * @author devzeros
 */
public class Punto5 {
 private static String r;
    public static void main(String[] args) {
          Scanner   input=new Scanner(System.in);
         do {
            System.out.println( "---------Su banco fiel-----------");
		 System.out.println("--------------------------------------");
		 System.out.println("-       [1] captura nombre");
		 System.out.println("-       [2] saludar persona" );
                 System.out.println("-       [3] Salir");
		 System.out.println( "--------------------------------------");
		 System.out.println( "digite una opcion");
                 r=input.next();
              
            
        } while (r=="3");
    }
}
