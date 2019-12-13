/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.exercicios7;
import java.util.Scanner;
/**
 *
 * @author Hassan
 */
public class Exercicio2 {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double d[]=new double[10];
        
        for(int i=0;i<d.length;i++){
        System.out.println("Introduza os 10 valores");
        d[i]=sc.nextInt();
        
          
    }
        for(int i=0;i<d.length;i++)
        {
              System.out.println(d[i]);
        }
}
}