/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sofka.punto6;

import java.util.Scanner;

/**
 *
 * @author devzeros
 */
public class Punto6 {

       private static String r;
       private static String recibidas;
    public static void main(String[] args) {
       int existe;
       Scanner  input=new Scanner(System.in);
       System.out.println("Digite nombre:");
       String[][] pelicula=new String[][]{{"","",""},
                                          {"","",""},
                                          {"","",""}};
        do {
            System.out.println( "---------MOTO-----------");
		 System.out.println("--------------------------------------");
		 System.out.println("-       [1] ingreso de moto");
		 System.out.println("-       [2] consulta" );
		 System.out.println("-       [3] salida de moto");
                 System.out.println("-       [4] Salir");
		 System.out.println( "--------------------------------------");
		 System.out.println( "digite una opcion");
                 r=input.next();
                 switch(r){
                     case "1": 
                           System.out.println("salida de moto");
                         System.out.println("--------------------------------------");
                  
				
                       
			
			 for (int i = 0; i <= 2; i++) {
                             if (pelicula[i][0]=="") {
                                
                                 System.out.println("Fecha de ingreso");
                                 pelicula[i][0]=input.next();
                                 System.out.println("Observaciones del cliente");
                                 pelicula[i][1]=input.next();
                             }
                         }
                         break;
                     case "2":
                         System.out.println("consulta");
                               System.out.println("--------------------------------------");
                         for (int i = 0; i <= 2; i++) {
                         
                             System.out.println( "ingreso:.... "+pelicula[i][0]+ 
                                     "Observaciones del cliente.... "+pelicula[i][1]+
                                     "Salida.... "+pelicula[i][2]+ 
                                     "Observaciones del Mecanico.... "+pelicula[i][3]
                             );              
                           
                         }
				
                         break;
                     case "3":
                         System.out.println("salida de moto");
                         System.out.println("--------------------------------------");
                  
				
                       
			
			 for (int i = 0; i <= 2; i++) {
                             if (pelicula[i][2]=="") {
                                
                                 System.out.println("Fecha de Salida");
                                 pelicula[i][2]=input.next();
                                 System.out.println("Observaciones del Mecanico");
                                 pelicula[i][3]=input.next();
                             }
                         }
		
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
