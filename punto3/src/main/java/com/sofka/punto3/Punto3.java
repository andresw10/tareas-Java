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
private static String edad;
private static String estatura;
    public static void main(String[] args) {
            Scanner  input=new Scanner(System.in);
        System.out.println("Digite nombre:");
        nombre=input.next();
        System.out.println("Digite apellido:");
        apellido=input.next();
        System.out.println("Digite nombre del padre:");
        edad=input.next();
         System.out.println("Digite nombre de la madre:");
        estatura=input.next();
         System.out.println("Yo " + nombre + " " + apellido + ", soy hijo de " + edad + " y " + estatura);
    }
}
