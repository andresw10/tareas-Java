/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sofka.punto9;

import java.util.Scanner;

/**
 *
 * @author devzeros
 */
public class Punto9 {

   
 private static double b1,b2,h;
        private static String r;
    public static void main(String[] args) {
   
     
       Scanner  input=new Scanner(System.in);
      
        do {
                 System.out.println( "---------Tortas-----------");
		 System.out.println("--------------------------------------");
		 System.out.println("-       [1] rectángulo");
		 System.out.println("-       [2] triángulo" );
		 System.out.println("-       [3] trapecio");
                 System.out.println("-       [4] Salir");
		 System.out.println( "--------------------------------------");
		 System.out.println( "digite una opcion");
                 r=input.next();
                 switch(r){
                     case "1": 
                         System.out.println("area de rectángulo");
                         System.out.println("--------------------------------------");
                         System.out.println("medida de base");
                         b1=input.nextDouble();
                         System.out.println("medida de base");
                         h=input.nextDouble();
                         System.out.println("Area " + b1*h);
			
                         break;
                     case "2":
                         System.out.println("area de triángulo");
                             System.out.println("--------------------------------------");
                         System.out.println("medida de base");
                         b1=input.nextDouble();
                         System.out.println("medida de base");
                         h=input.nextDouble();
                         System.out.println("Area " + (b1*h)/2);
			
                        
				
                         break;
                     case "3":
                         System.out.println("area de trapecio" );
                        System.out.println("--------------------------------------");
                         System.out.println("medida de base menor");
                         b1=input.nextDouble();
                          System.out.println("medida de base mayos");
                         b2=input.nextDouble();
                         System.out.println("medida de base");
                         h=input.nextDouble();
                         System.out.println("Area " + ((b1*b2)/2)*h);
			
		
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
