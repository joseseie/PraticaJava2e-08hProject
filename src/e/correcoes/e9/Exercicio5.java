
package e.correcoes.e9;

import java.util.Scanner;

/**
 *
 * @author joseseie
 * @author Horcha Chambule
 * @author Fenias Manhenge
 * @author Jessica Mavie
 * @author Alfredo Francisco
 * @author Iben Enky
 * @author Nicolas Muchate
 * @author Micaela Freitas
 * @author Hassan Mutola
 * 
 * 5.	Faça um programa (utilizando recursividade) que peça para o usuário 
 *      digitar um número, em seguida, faça a soma de todos os algarismos do número.
 */
public class Exercicio5 {
    
    // 10 = 1 + 0
    // 127 = 1 + 2 + 7;
    // 1
   
    static int somaAlgarismos (int num) {
        
        if (num == 0) {
            return 0;
        }
        String numStr = String.valueOf(num);
        int n0 = Integer.parseInt(numStr.charAt(0) + "");
        
        if (numStr.length() == 1) {
            return n0 + somaAlgarismos(0);
        }
        String restStr = numStr.substring(1, numStr.length());
        
        return n0 + somaAlgarismos(Integer.parseInt(restStr));
        
        
    }
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = s.nextInt();
        
        int somaAlg = somaAlgarismos(numero);
        
        System.out.println("A soma dos algarismos é: " + somaAlg);
        
        
    }
    
}
