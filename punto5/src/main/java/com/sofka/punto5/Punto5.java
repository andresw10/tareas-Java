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

    public static void main(String[] args) {
   int c,f;
           int[][] pelicula=new int[10][10];
           Scanner  input=new Scanner(System.in);
            for (int i = 0; i <10; i++) {
               for (int j = 0; j < 10; j++) {
                   
                   pelicula[i][j]=(i+1)*(j+1);
               }
        }
             System.out.println("   0   1   2   3   4   5   6   7   8   9" );
             for (int i = 1; i <= 10; i++) {
              System.out.println(i-1+ " " + 1 +"x" + i+ " "+ 2+ "x"+ i +" " +3+ "x"+ i+ " "+ 4+ "x"+ i+ " "+ 5+ "x"+ i+ " "+ 6 +"x" +i +" "+ 7+ "x"+ i+ " "+ 8+ "x"+ i+ " "+ 9+ "x" +i+ " "+ 10 +"x"+ i );
        }
              System.out.println("digite fila");
              f=input.nextInt();
               System.out.println("digite columna");
               c=input.nextInt();
                System.out.println("el resultado es [" + pelicula[f][c]+ "]");
    }
}
