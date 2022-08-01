/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sofka.punto3;

/**
 *
 * @author devzeros
 */
public class Punto3 {

    public static void main(String[] args) {
        int c,t;
              
        
        for (int i = 1; i < 1001; i++) {
            c=0;  t=0; 
            for (int j = 1; j <= i; j++) {
                t=i%j;
                if (t==0 ){
                    c=c+1;
                }
            }
            if (c==2) {
                System.out.println(i);
            }
        }
        
    }
}
