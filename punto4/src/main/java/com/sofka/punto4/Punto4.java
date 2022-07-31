/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sofka.punto4;

import java.util.Scanner;

/**
 *
 * @author devzeros
 */
public class Punto4 {
private static String r;
private static String recibidas;
    public static void main(String[] args) {
             int existe;
         Scanner  input=new Scanner(System.in);
        System.out.println("Digite nombre:");
       String[][] pelicula=new String[][]{{"harripoter","fabian","ok"},
                                          {"dragon ball","ninguno","jod11"},
                                          {"losvengadore","todoestabien","malacarcasa"}};
        do {
            System.out.println( "---------PELICULAS PORVENIR-----------");
		 System.out.println("--------------------------------------");
		 System.out.println("-       [1] Alquilar de pelicula");
		 System.out.println("-       [2] Consultar disponibilidad" );
		 System.out.println("-       [3] Recibir película.");
                 System.out.println("-       [4] Salir");
		 System.out.println( "--------------------------------------");
		 System.out.println( "digite una opcion");
                 r=input.next();
                 switch(r){
                     case "1": 
                        
                        System.out.println("alquiler de pelicula");
			System.out.println("--------------------------------------");	
			System.out.println( "Que pelicula quiere?" );
                        recibidas=input.next();
                        existe=0;
                        for (int i = 0; i <=2; i++) {
                            if (pelicula[i][2]=="ninguno") {
                                existe=1;
                                System.out.println(  "Cual es su nombre de usuario?");
                               pelicula[i][1]=input.next();
                            }else{
                                                existe=2;
                                                System.out.println( pelicula[i][0]+ "----> NO esta disponible ");
                            }
                         }
			 if (existe==0) {
                              System.out.println(  "no existe pelicula con este nombre");
                         }
				
			
                         break;
                     case "2":
                         System.out.println("Consultar disponibilidad");
                               System.out.println("--------------------------------------");
                         for (int i = 0; i <= 2; i++) {
                             if (pelicula[i][1]=="ninguno") {
                             System.out.println(pelicula[i][0]+ "----> esta disponible ");              
                             }else{
                             System.out.println(pelicula[i][0]+ "---->NO esta disponible ");              
                             }
                         }
				
                         break;
                     case "3":
                         System.out.println("daños u otra novedad sobre la película");
                         System.out.println("--------------------------------------");
                         System.out.println("peliculas resividas");
				
                        recibidas =input.next();
			 existe=0;	
			 for (int i = 0; i <= 2; i++) {
                             if (pelicula[i][0]==recibidas) {
                                 existe=1;
                                 System.out.println("Que novedad tiene?");
                                 pelicula[i][2]=input.next();
                                 pelicula[i][1]="ninguno";
                             }
                         }
			 if (existe==0) {
                             	 System.out.println("no existe pelicula con este nombre");
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
