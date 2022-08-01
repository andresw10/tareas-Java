/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sofka.punto7;

import java.util.Scanner;

/**
 *
 * @author devzeros
 */
public class Punto7 {
  private static String r;
    public static void main(String[] args) {
           int acumulador,existencia,ac=0;
       String nombre,telefono,organizacion,placa;
       String[][] contacto=new String[][]{{"","","","",""},
                                          {"","","","",""},
                                          {"","","","",""},
                                          {"","","","",""},
                                          {"","","","",""}};
   Scanner  input=new Scanner(System.in);
      
                
                 
        do {
            System.out.println( "---------Menu-----------");
		 System.out.println("--------------------------------------");
		 System.out.println("-       [1] agregar usuario");
		 System.out.println("-       [2] ingresar" );
		 System.out.println("-       [3] retirar");
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
                         for (int i = 0; i < 5; i++) {
                             if (contacto[i][0]== "") {
                                  System.out.println("digite placa");
                                  contacto[i][0]=input.next();
                                   System.out.println("digite marca");
                                   contacto[i][1]=input.next();
                                    System.out.println("digite nombre del dueño");
                                    contacto[i][2]=input.next();
                                    System.out.println("digite telefono");
                                    contacto[i][3]=input.next();
                                   
                                i=5;
                             }else{
                             acumulador=1+acumulador;
                             }
                         }
                         if (acumulador ==3) {
                             System.out.println("espacios llenos");
                         }
                         break;
					
                     case "2":
                            System.out.println("ingresar" );
                            System.out.println("digite placa" );
                            placa=input.next();
                          
			
                            acumulador=0;
                            for (int i = 0; i < 5; i++) {
                                if (contacto[i][0]==placa) {
                                    contacto[i][0]="Entro";
                                    System.out.println("digite placa" );
                                    i=5;
                                }else{
                                 acumulador= acumulador+1;
                                }
                         }
			
                          if (acumulador==5) {
                                  System.out.println("placa no existe" );
                         }
			
                         break;
                     case "3":
                         System.out.println("retirar" );
                         System.out.println("digite placa" );
                            placa=input.next();
                          
			
                            acumulador=0;
                            for (int i = 0; i < 5; i++) {
                                if (contacto[i][0]==placa) {
                                    contacto[i][0]="salio";
                                    System.out.println("digite placa" );
                                    i=5;
                                }else{
                                 acumulador= acumulador+1;
                                }
                         }
			
                          if (acumulador==5) {
                                  System.out.println("placa no existe" );
                         }
			
				
                         break;
                          case "4":
                             System.out.println("consulta");
                         for (int i = 0; i < 5; i++) {
                               System.out.println("placa: "+ contacto[i][0] +" marca: "+ contacto[i][1]+ " estado: "+ contacto[i][4]);
                         }
                         break;
                     case "5":
                         System.out.println("Adios");
                         break;
                     default: {

                         System.out.println("Opcion incorrecta");

                    }
                 }
            
        } while (r=="5");
    }
}
