
package e.exercicios7;

import java.util.Scanner;

/**
 *
 * @author Hassan
 */
public class exercicio7 {
    
     public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);
        
        int A[]=new int[10];
        for(int i=0;i<A.length;i++)
        {
            System.out.println("Introdua dez registos do array A");
            A[i]=Integer.parseInt(sc.nextLine());
        }
        
        
         for(int i=0;i<A.length;i++)
        {
            double soma=0;
            if(A[i]%5==0){
            soma+=A[i];
            System.out.println("os valores da soma sao"+ soma);
            }
        }
     }
}
