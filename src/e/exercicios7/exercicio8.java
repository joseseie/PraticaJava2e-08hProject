
package e.exercicios7;

import java.util.Scanner;

/**
 *
 * @author Hassan
 */
public class exercicio8 {
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
            double media=0;
            if(A[i]%2!=0){
            media=A[i]/10;
            System.out.println("os valores da soma sao"+ media);
            }
        }
        }
       }
