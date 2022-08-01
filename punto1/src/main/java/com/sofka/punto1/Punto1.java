/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sofka.punto1;

/**
 *
 * @author devzeros
 */
public class Punto1 {
private static String signo;
    public static void main(String[] args) {
        signo="*";
        for (int i = 0; i < 10; i++) { 
            if (i>0) {
                   signo=signo + "*";
            }
            System.out.println(signo);
        }
        
    }
}
