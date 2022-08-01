/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sofka.punto2;

import java.util.Random;

/**
 *
 * @author devzeros
 */
public class Punto2 {

    public static void main(String[] args) {
        
        int u,r;
        int[] pelicula=new int[20];
         Random random = new Random();
        for (int i = 0; i < 20; i++) {
            pelicula[i]=random.nextInt(100 + 1) + 1;
        }u=0;
        while(u<20){
            r=pelicula[u]%2;
            if (r==0) {
                System.out.println(pelicula[u]+" es par");
            }else{
                    System.out.println(pelicula[u]+" es Impar");
            }
            u=u+1;
        }
       
    }
}
