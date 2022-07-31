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
private static int edad;
    public static void main(String[] args) {
        Scanner  input=new Scanner(System.in);
        System.out.println("Digite edad:");
        edad=input.nextInt();
        if (edad>=18) {
            System.out.println("Usted es mayor de edad");
        }
        
        
    }
}
