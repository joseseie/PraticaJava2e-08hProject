/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.correcoes.e5;

/**
 *
 * @author Iben Enky
 * @author José Seie
 * @author Nicolas Muchate
 * @author Hassan Mutola
 * 
 */
public class Exer2 {
    public static void main (String[] args ){
        
      /*   2.	Faça um programa que imprima a frase: "Seja bem-vindo ao meu programa!", Em seguida, imprima uma linha em branco e na sequência, imprima as frases e o resultado da expressões matemáticas.
               “O produto de 8 por 90 é igual a:”
               “O quociente de 90 por 30 é igual a:”
               “O quadrado de 9 é: “

       */
      // # Algoritmo:
      // 1. Imprimir a frase "Seja bem vindo ao meu programa!"
      // 2. Imprimir uma linha em branco.
      // 3. Imprimir as frase (em ordem) e o resultado das expressões matemáticas.
     
        System.out.println("Seja bem-vindo ao meu programa!");
        System.out.println(""); //impressão da linha em branco
        System.out.println("O produto de 8 por 90 é igual a:"+(8*90));
        System.out.println("O quociente de 90 por 30 é igual a:"+(90/30));
        System.out.println("O quadrado de 9 é:"+(9*9)); 
        
        // TPC:
        //1. Colocar espaços entre a palavra 'igual a:' e o resultado, mostrar assim: 'igual a: 10'.
        //2. Usar a class Math de Java para achar o quadrado de (9)
        
    }
}
