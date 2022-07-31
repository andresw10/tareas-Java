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
private static String recibidas;
    public static void main(String[] args) {
             int existe;
         Scanner  input=new Scanner(System.in);
        System.out.println("Digite nombre:");
       String[][] pelicula=new String[][]{{"dolex","100","vendido"},
                                          {"acetaminofen","2000","disponible"},
                                          {"pedialite","50000","vendido"}};
        do {
            System.out.println( "---------La Droguería Mi Salud-----------");
		 System.out.println("--------------------------------------");
		 System.out.println("-       [1] compra de producto");
		 System.out.println("-       [2] consulta de precios por producto" );
		 System.out.println("-       [3] devoluciones");
                 System.out.println("-       [4] Salir");
		 System.out.println( "--------------------------------------");
		 System.out.println( "digite una opcion");
                 r=input.next();
                 switch(r){
                     case "1": 
                        
                        System.out.println("compra de producto");
			System.out.println("--------------------------------------");	
			System.out.println( "Que pelicula quiere?" );
                        recibidas=input.next();
                        existe=0;
                        for (int i = 0; i <=2; i++) {
                            if (pelicula[i][2]=="vendido") {
                                existe=1;
                                pelicula[i][2]="vendido";
                            }else{
                                existe=2;
                                System.out.println( pelicula[i][0]+ "----> NO esta disponible ");
                            }
                         }
			 if (existe==0) {
                              System.out.println(  "no existe producto con este nombre");
                         }
				
			
                         break;
                     case "2":
                         System.out.println("consulta de precios por producto");
                               System.out.println("--------------------------------------");
                         for (int i = 0; i <= 2; i++) {
                             if (pelicula[i][1]=="disponible") {
                             System.out.println(pelicula[i][0]+ "----> esta disponible ");              
                             }else{
                             System.out.println(pelicula[i][0]+ "---->NO esta disponible ");              
                             }
                         }
				
                         break;
                     case "3":
                         System.out.println("devoluciones");
                         System.out.println("--------------------------------------");
                         System.out.println("producto resividas");
				
                        recibidas =input.next();
			 existe=0;	
			 for (int i = 0; i <= 2; i++) {
                             if (pelicula[i][0]==recibidas) {
                                 existe=1;
                                
                                 pelicula[i][2]="disponible";
                             }
                         }
			 if (existe==0) {
                             	 System.out.println("no existe producto con este nombre");
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
