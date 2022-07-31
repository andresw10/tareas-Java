/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sofka.punto1;

import java.util.Scanner;

/**
 *
 * @author devzeros
 */

public class Punto1 {
private static String nombre;
private static String apellido1;
private static String apellido2;
    public static void main(String[] args) {
            Scanner  input=new Scanner(System.in);
        System.out.println("Digite nombre:");
        nombre=input.next();
        System.out.println("Digite primer apellido:");
        apellido1=input.next();
        System.out.println("Digite segundo apellido:");
        apellido2=input.next();
    }
}
