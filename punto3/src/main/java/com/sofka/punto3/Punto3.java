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
 private static String signo,espacio;
 
    private static int l;
    public static void main(String[] args) {
        l=10;
        signo="*";
       
        while(l!=0){
            espacio="";  
            for (int k= 0; k <= l; k++) { 
                if (k!=0) {
                  espacio= " "+ espacio; 
            }
              
            }
             
            if (l<9) {
                   signo=signo + "**";
            }
        
            
            System.out.println(espacio+signo);
            l=l-1;
        }
         l=10;
        signo="*";
       
        while(l!=5){
            espacio="";  
            for (int k= 0; k <= l; k++) { 
                if (k!=0) {
                  espacio= " "+ espacio; 
            }
              
            }
             
            if (l<9) {
                   signo=signo + "**";
            }
        
            
            System.out.println(espacio+signo);
            l=l-1;
        }
    }
}
