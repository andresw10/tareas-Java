/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sofka.punto4;

/**
 *
 * @author devzeros
 */
public class Punto4 {

    public static void main(String[] args) {
        int c;
           int[][] pelicula=new int[4][5];
           c=0;
           for (int i = 0; i <4; i++) {
               for (int j = 0; j < 5; j++) {
                   c=c+1;
                   pelicula[i][j]=c;
               }
        }
           for (int i = 0; i <4; i++) {
        System.out.println(pelicula[i][0]+" "+pelicula[i][1]+" "+pelicula[i][2]+" "+pelicula[i][3]+" "+pelicula[i][4]);
           }
             for (int i = 0; i <4; i++) {
       
                 if (i%2==0) {
                      System.out.println(pelicula[i][0]+" "+pelicula[i][1]+" "+pelicula[i][2]+" "+pelicula[i][3]+" "+pelicula[i][4]);
                 }else{
                  System.out.println(pelicula[i][4]+" "+pelicula[i][3]+" "+pelicula[i][2]+" "+pelicula[i][1]+" "+pelicula[i][0]);
                 }
           }
    }
}
