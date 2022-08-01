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

    public static void main(String[] args) {
       int acumulador,existencia,ac=0;
       String nombre,telefono,organizacion;
      String[][] contacto=new String[][]{{"","",""},
                                          {"","",""},
                                          {"","",""}};
        Scanner  input=new Scanner(System.in);
      
                
                 
        do {
            System.out.println( "---------Menu-----------");
		 System.out.println("--------------------------------------");
		 System.out.println("-       [1] agregar contacto");
		 System.out.println("-       [2] contacto almacenados" );
		 System.out.println("-       [3] eliminar contacto");
                 System.out.println("-       [4] Salir");
		 System.out.println( "--------------------------------------");
		 System.out.println( "digite una opcion");
                 r=input.next();
                 switch(r){
                     case "1": 
                           System.out.println("REGISTRO");
                         System.out.println("--------------------------------------");
                     
				acumulador=0;
                         for (int i = 0; i < 3; i++) {
                             if (contacto[i][0]== "") {
                                  System.out.println("digite nombre");
                                  nombre=input.next();
                                   System.out.println("digite telefono");
                                   telefono=input.next();
                                    System.out.println("digite organizacion");
                                    organizacion=input.next();
                                    existencia=0;
                                    ac=0;
                                    if (i!=0) {
                                        for (int j = i; j >=0; j--) {
                                           ac=ac+1;
                                            if (telefono==contacto[j][1]) {
                                                 System.out.println("telefono ya existe");
                                                 j=0;
                                            }else{
                                            existencia=existencia+1;
                                            }
                                        }
                                        if (existencia==ac) {
                                            contacto[i][0]=nombre;
					    contacto[i][1]=telefono;
					    contacto[i][2]=organizacion;
                                        }
                                 }else{
                                      contacto[i][0]=nombre;
                                      contacto[i][1]=telefono;
                                      contacto[i][2]=organizacion;
                                    }
                                    i=3;
                                      System.out.println("registro exitozo");
                             }else{
                             acumulador=1+acumulador;
                             }
                         }
                         if (acumulador ==3) {
                             System.out.println("contactos llenos");
                         }
                         break;
					
                     case "2":
                         System.out.println("contacto almacenados");
                         for (int i = 0; i < 3; i++) {
                               System.out.println("Nombre_completo: "+ contacto[i][0] +" Telefono: "+ contacto[i][1]+ " Organizacion: "+ contacto[i][2]);
                         }
                         break;
                     case "3":
                         System.out.println("ELIMINAR" );
                     
				telefono="";
                                System.out.println("digite telefono" );
				
				telefono=input.next();
				existencia=0;
                                for (int i = 0; i < 3; i++) {
                                    if (telefono==contacto[i][1]) {
                                          contacto[i][0]="";
                                      contacto[i][1]="";
                                      contacto[i][2]="";
                                      System.out.println("eliminacion correcta" );
                                      i=3;
					existencia=1;
                                    }
                             
                         }
			                      if (existencia==0 ) {
                             System.out.println("telefono no existe" );
                         }
				
                         break;
                     case "4":
                         System.out.println("Adios");
                         break;
                     default: {

                         System.out.println("Opcion incorrecta");

                    }
                 }
            
        } while (r=="4");
    }
}
