/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.exercicios7;

import java.util.Random;



/**
 *
 * @author Hassan
 */
public class exercicio4 {
 public static void main (String[]args){
     int [] a = new int [5];
     Random numeros = new Random();
    for (int i=0; i< a.length; i++) {
a[i]=numeros.nextInt();
System.out.println("a[" + i + "]=" +a[i]);
    }
    System.out.println();
   
       
 }
}
