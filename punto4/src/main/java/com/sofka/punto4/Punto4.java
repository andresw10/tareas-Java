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
private static String nombre;
private static String apellido;

    public static void main(String[] args) {
            Scanner  input=new Scanner(System.in);
        System.out.println("Digite ciudad:");
        nombre=input.next();
        System.out.println("Digite país:");
        apellido=input.next();
        System.out.println("La ciudad "+nombre+ ", es la capital del país "+apellido);
        
    }
}
