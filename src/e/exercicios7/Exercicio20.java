
package e.exercicios7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author joseseie
 * @author Horcha Chambule
 * @author Abdul Rasac
 * @author Micaela Freitas
 * @author Nicolas Muchate
 * @author Hassan Mutola
 * @author Iben Enky
 */
public class Exercicio20 {
    
    /*
    Faça um programa de consulta pela posição numérica da pessoa: leia nomes de 
    pessoas, sendo a quantidade determinada pelo usuário. Logo após a entrada 
    pergunte ao usuário o número do nome que ele gostaria de consultar. Após 
    sua resposta, exiba o nome que fica na posição informada.
        Chame atenção do usuário em caso de uma consulta inválida, ou seja, com 
        números menores ou iguais a zero, ou maiores do que a quantidade 
        cadastrada.
    */
    
    public static void main(String[] args) {
        
        //# Algoritmo.
        //1. Ler vários nomes em várias posições do array
        //2. Ler a qtd de nomes a serem inseridos
        //3. Ler os vários desejados
        //4. Perguntar o usuário o nome que deseja consultar
        //5. Mostrar o nome na posição informada
        //6. Validar a posicao informada pelo usuario.
        
        // declarações
        Scanner s = new Scanner(System.in);
        String nomes[];
        
        // leituras e inicialização
        System.out.print("Quantidade de nomes a serem lidos: ");
        int qtdNomes = s.nextInt();
        nomes = new String[qtdNomes];
        
        // leitura
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome[" + i + "] : " );
            nomes[i] = s.next();
        }
        
        // lendo a posicao a ser consultada.
        System.out.print("Em que posição deseja consultar o nome? : ");
        int posicao = s.nextInt();
        
        // chamar atencao (validação)
        
        if (posicao >= 0 && posicao < qtdNomes) {
            
            System.out.println("O nome na posição: '" + posicao + "', é: '" + nomes[posicao] + "'");
            
        } else {
            System.err.println("A posição: '" + posicao + "' não existe");
        }
        
        System.out.println(Arrays.toString(nomes));
        
    }
    
}
