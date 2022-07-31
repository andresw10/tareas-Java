/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sofka.punto8;

import java.util.Scanner;

/**
 *
 * @author devzeros
 */
public class Punto8 {
 private static String r;
 private static int ventas;
       private static int recibidas;
    public static void main(String[] args) {
       int existe=60;
     
       Scanner  input=new Scanner(System.in);
      
        do {
            System.out.println( "---------Tortas-----------");
		 System.out.println("--------------------------------------");
		 System.out.println("-       [1] Registrar pedidos");
		 System.out.println("-       [2] disponibilidad de tortas" );
		 System.out.println("-       [3] Ventas de tortas");
                 System.out.println("-       [4] Salir");
		 System.out.println( "--------------------------------------");
		 System.out.println( "digite una opcion");
                 r=input.next();
                 switch(r){
                     case "1": 
                           System.out.println("pedido");
                         System.out.println("--------------------------------------");
                      System.out.println("cantidad de tortas deseadas");
				
                       recibidas=input.nextInt();
                       ventas=ventas+1;
                       existe=existe-recibidas;
			
                         break;
                     case "2":
                         System.out.println("hay " + existe + " tortas disponibles");
                            
                        
				
                         break;
                     case "3":
                         System.out.println("Venta de hoy " + ventas);
                       
		
                         break;
                     case "4":
                         System.out.println("Adios");
                         break;
                     default: {

                         System.out.println("Opcion incorrecta");

                    }
                 }
            
        } while (r!="4");
      
       
    }
}
