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
public class Exercicio3 {
    public static void main(String[] args) {
        
     Scanner sc=new Scanner(System.in);
        double vector[]=new double[50];
        
        for(int i=101;i<150;i++){
       vector[i]=sc.nextInt();
        
    }
        for(int i=101;i<150;i++)
        {
              System.out.println(vector[i]);
        }
}
}
