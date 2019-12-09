/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.correcoes.e5;

/**
 *
 * @author user
 */
public class Exer2 {
    public static void main (String[] args ){
        
      /*   2.	Faça um programa que imprima a frase: "Seja bem-vindo ao meu programa!", Em seguida, imprima uma linha em branco e na sequência, imprima as frases e o resultado da expressões matemáticas.
               “O produto de 8 por 90 é igual a:”
               “O quociente de 90 por 30 é igual a:”
               “O quadrado de 9 é: “

       */
     
    int a = 8;
    int b = 90;
    int c = 30;
    int d = 9;
    int produto= (a*b);
    int quociente=(b/c);
    int quadrado=(d*d);
        System.out.println("Seja bem-vinda ao meu programa");
        System.out.println("");
        System.out.println("O produto de 8 por 90 é igual a:"+produto);
        System.out.println("O quociente de 90 por 30 é igual a:"+quociente);
        System.out.println("O quadrado de 9 é:"+quadrado); 
    }
}
