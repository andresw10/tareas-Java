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
    public static void main(String[] args) {
           int acumulador,existencia,ac=0;
       String nombre,telefono,organizacion,placa;
       String[][] contacto=new String[][]{{"",""},
                                          {"",""},
                                          {"",""},
                                          {"",""},
                                          {"",""},
                                          {"",""},
                                          {"",""},
                                          {"",""}};
   Scanner  input=new Scanner(System.in);
      
                
                 
        do {
            System.out.println( "---------Menu-----------");
		 System.out.println("--------------------------------------");
		 System.out.println("-       [1] ingreso al curso");
                 System.out.println("-       [3] consulta");
                 System.out.println("-       [5] Salir");
		 System.out.println( "--------------------------------------");
		 System.out.println( "digite una opcion");
                 r=input.next();
                 switch(r){
                     case "1": 
                         System.out.println("REGISTRO");
                         System.out.println("--------------------------------------");
                      
				acumulador=0;
                         for (int i = 0; i < 8; i++) {
                             if (contacto[i][0]== "") {
                                  System.out.println("digite identificacion");
                                  contacto[i][0]=input.next();
                                   System.out.println("digite resultado");
                                   contacto[i][1]=input.next();
                                                                    
                                i=5;
                             }else{
                             acumulador=1+acumulador;
                             }
                         }
                         if (acumulador ==3) {
                             System.out.println("curso llenos");
                         }
                         break;
	
                          case "2":
                             System.out.println("consulta");
                         for (int i = 0; i < 5; i++) {
                               System.out.println("el estudiante "+ contacto[i][0] +", "+ contacto[i][1]+ ".");
                         }
                         break;
                     case "3":
                         System.out.println("Adios");
                         break;
                     default: {

                         System.out.println("Opcion incorrecta");

                    }
                 }
            
        } while (r=="5");
    }
}
