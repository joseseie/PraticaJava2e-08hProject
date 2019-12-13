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
public class exercicio5 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int A[]=new int[10];
        int B[]=new int[10];
        int soma[]=new int[10];
        
        for(int i=0;i<A.length;i++)
        {
            System.out.println("Introdua dez registos do array A");
            A[i]=Integer.parseInt(sc.nextLine());
        }
        for(int j=0;j<B.length;j++)
        {
         System.out.println("Introdua dez registos do array B");
            B[j]=Integer.parseInt(sc.nextLine());   
        }
        
        
         for(int i=0;i<A.length;i++)
        {
            System.out.println("os valores do array A sao"+ A[i]);
      
        }
        for(int j=0;j<B.length;j++)
        {
         System.out.println("Os valores do aray B sao"+B[j]);
            B[j]=Integer.parseInt(sc.nextLine());   
        }
        
        for(int s=0;s<soma.length;s++)
        {
            soma[s]=A[s]+B[s];
            System.out.println("Os valores do vector soma sao"+soma[s]);
            
        }
        }
}
