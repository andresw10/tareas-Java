/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sofka.punto7;

import java.util.Scanner;

/**
 *
 * @author devzeros
 */
public class Punto7 {
private static double peso;
private static double estatura;
    public static void main(String[] args) {
        double indice;
            Scanner  input=new Scanner(System.in);
        System.out.println("Digite Peso [kg]:");
        peso=input.nextDouble();
        System.out.println("Digite Estatura [mtr]:");
        estatura=input.nextDouble();
       indice=peso/(estatura*estatura);
         if (indice<18.5) {
          System.out.println("bajo de peso");
         }else if(indice <25){
          System.out.println("peso Normal");
         }
         else if(indice <30){
          System.out.println("sobrepeso");
         }
         else{
         System.out.println(" obeso");
         }
       
    }
}
