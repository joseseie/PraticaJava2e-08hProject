
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
public class Exer3 {
   public static void main (String [] args){
       
   // 3.Escreva um pequeno programa que peça o seu nome, sua ocupação e ano de nascimento. 
   // Em seguida, imprima na tela as 2 informações a seguir:
   // Eu chamo me xxxxx de idade xxxxx anos de idade e xxxxx.

   // # Algorítmo:
   //1. Ler o nome do usuário
   //2. Ler a ocupação do usuário
   //3. Ler o ano de nascimento
   //4. Imprimir as informações usando o formato sugerido.
   
   Scanner ler = new Scanner(System.in);
   
    System.out.println("Insira o seu nome:");
    String nome = ler.nextLine();
    
    System.out.println("Insira a sua ocupação:");
    String ocupacao= ler.nextLine();
    
    System.out.println("Insira o seu ano de nascimento:");
    int ano = ler.nextInt();
    int idade = 2019 - ano;
    
    System.out.print("Eu chamo me: " + nome + " de idade: " + idade + " anos de idade e " + ocupacao);              
             
   } 
}
