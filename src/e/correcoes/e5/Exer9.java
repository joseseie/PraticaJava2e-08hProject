
package e.correcoes.e5;

import java.util.Scanner;

/**
 *
 * @author Iben Enky
 * @author José Seie
 * @author Nicolas Muchate
 * @author Hassan Mutola
 * 
 */
public class Exer9 {
   public static void main (String [] args ){
   
        //9.Faça um programa que leia 3 números inteiros distintos e escreva o menor deles.
        
        // # Algoritmo:
        //1. Ler os 3 números inteiros
        //2. Procurar o menor dos 3
        //3. Mostrar na tela.
        
        // Testar com: 2, 9, 0
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        int num1 = ler.nextInt();
        
        System.out.println("Digite o segundo número: ");
        int num2 = ler.nextInt();
        
        System.out.println("Digite o terceiro número: ");
        int num3 = ler.nextInt();
   
        if (num1 < num2) {
            
            if (num1 < num3) {
                System.out.println("O menor número é: " + num1);
            } else {
                System.out.println("O menor número é: " + num3);
            }
            
        } else {
            
            if (num2 < num3) {
                System.out.println("O menor número é: " + num2);
            } else {
                System.out.println("O menor número é: " + num3);
            }
            
        }
        
   }
}
