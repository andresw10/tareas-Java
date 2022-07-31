/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sofka.punto3;

import java.util.Scanner;

/**
 *
 * @author devzeros
 */
public class Punto3 {
private static String nombre;
private static String apellido;
private static int edad;
    public static void main(String[] args) {
            Scanner  input=new Scanner(System.in);
        System.out.println("Digite nombre:");
        nombre=input.next();
        System.out.println("Digite apellido:");
        apellido=input.next();
        System.out.println("Digite edad:");
        edad=input.nextInt();
         if (edad>=18) {
          System.out.println(nombre+" "+apellido+" usted es mayor de edad, por lo tanto puede entrar a la fiesta.");
         }else{
         System.out.println(nombre+" "+apellido+" usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
         }
       
    }
}
