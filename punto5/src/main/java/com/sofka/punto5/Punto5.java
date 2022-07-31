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
private static String nombre;
private static String apellido;
private static String edad;
private static String estatura;
    public static void main(String[] args) {
            Scanner  input=new Scanner(System.in);
        System.out.println("Digite nombre de su mascota:");
        nombre=input.next();
        System.out.println("Digite edad de la mascota:");
        apellido=input.next();
        System.out.println("Digite tipo de mascota:");
        edad=input.next();
         System.out.println("Digite nombre completo del dueño:");
        estatura=input.next();
         System.out.println(nombre+" es un(a) "+edad+", el cual, tiene "+apellido+" años de edad y "+ estatura+" es actualmente su dueño(a).");
    }
}
