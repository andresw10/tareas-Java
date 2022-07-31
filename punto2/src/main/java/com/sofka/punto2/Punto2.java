/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sofka.punto2;

import java.util.Scanner;

/**
 *
 * @author devzeros
 */
public class Punto2 {
private static String nombre;
private static String apellido;
private static String edad;
private static String estatura;
    public static void main(String[] args) {
            Scanner  input=new Scanner(System.in);
        System.out.println("Digite nombre:");
        nombre=input.next();
        System.out.println("Digite apellido:");
        apellido=input.next();
        System.out.println("Digite edad:");
        edad=input.next();
         System.out.println("Digite estatura:");
        estatura=input.next();
    }
}
