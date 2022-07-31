/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sofka.punto10;

import java.util.Scanner;

/**
 *
 * @author devzeros
 */
public class Punto10 {

    private static String r;
 private static double cantidad,retiro,ingreso;
       private static String titular ;
    public static void main(String[] args) {
       int existe=60;
     
       Scanner  input=new Scanner(System.in);
       System.out.println( "digite Titular");
                 titular=input.next();
                     System.out.println( "digite dinero actual:");
                 cantidad =input.nextDouble();
                
                 
        do {
            System.out.println( "---------Su banco fiel-----------");
		 System.out.println("--------------------------------------");
		 System.out.println("-       [1] Meter plata");
		 System.out.println("-       [2] Sacar plata" );
		 System.out.println("-       [3] Consultar");
                 System.out.println("-       [4] Salir");
		 System.out.println( "--------------------------------------");
		 System.out.println( "digite una opcion");
                 r=input.next();
                 switch(r){
                     case "1": 
                           System.out.println("ingresos");
                         System.out.println("--------------------------------------");
                      System.out.println("ingrese dinero a meter:");
				
                       ingreso=input.nextDouble();
                        cantidad=cantidad+ingreso;
                       
                         break;
                     case "2":
                         System.out.println("retiros");
                              retiro=input.nextDouble();
                         if (retiro<0) {
                             System.out.println("solo se permite valores positivos");
                         }else if(retiro>cantidad){
                              System.out.println("retiro supera la cantidad de dinero del titular");
                         }
                         else{
                             cantidad=cantidad-retiro;
                                System.out.println("Retiro exitoso");
                         }
				
                         break;
                     case "3":
                         System.out.println("Consultar" );
                        System.out.println("El TITULAR: "+ titular +", Tiene $ " + cantidad + " en su cuenta" );
		
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
