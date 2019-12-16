package mz.e.exercicios7;
   
import java.util.*;


/**
 *
 * @author _AlyyRazack
 */
public class Proposta18 {
     /*18. Faça um programa de consulta pela posição numérica da pessoa: leia nomes de
pessoas, sendo a quantidade determinada pelo usuário. Logo após a entrada pergunte
ao usuário o número do nome que ele gostaria de consultar. Após sua resposta, exiba
o nome que fica na posição informada.
Chame atenção do usuário em caso de uma consulta inválida, ou seja, com números
menores ou iguais a zero, ou maiores do que a quantidade cadastrada.*/
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtde = 0, continua = 1;
        String nomes[], numero[];
        String nome = "", fone = "";
        System.out.println("Digite a quantidade de nomes: ");
        qtde = sc.nextInt();
        nomes = new String[qtde];
        numero = new String[qtde];
        for (int i = 0; i < qtde; i++){
            System.out.println("Digite o nome: " + i);
            System.out.println("Digite o numero: " + i);
            nomes[i] =sc.next();
            numero[i] = sc.next();
        }
        System.out.println("Modo consulta...");
 
        while (continua == 1){
            fone = "não encontrado";
            System.out.println("Entre com o nome da pessoa a ser consultada: ");
            nome = sc.next(); 
            for (int x = 0; x < qtde; x++){
                if (nomes[x].equalsIgnoreCase(nome)){
                    fone = numero[x];
                }
            }
            System.out.println("Resultado da Consulta: '" + fone + "'");
            continua = 0;
            System.out.println("Para fazer uma nova consulta, entre com o valor 1:");
            continua =sc.nextInt();
        }
        System.out.println("FIM");
    }
 
}
