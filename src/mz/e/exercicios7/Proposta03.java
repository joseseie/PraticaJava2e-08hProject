package mz.e.exercicios7;

/**
 *
 * @author _AlyyRazack
 */
public class Proposta03 {
    
/*1. Crie um array capaz de armazenar 50 números inteiros. Em seguida faça o seu
preenchimento automático com os números de 101 a 150, ou seja, na posição
número 0 ponha 101, na posição 1 ponha o número 102, e assim sucessivamente. Em
seguida exiba os valores deste vector.*/
    public static void main(String[] args) {
        int armazena[], valorI = 101;
        String aux; //Padroniza a descrição do valor em 2 dígitos
        armazena = new int [50];
        System.out.println("Criado...");
        System.out.println("Inicio ...");
        for (int i = 0; i <armazena.length; i++){
            armazena[i] = valorI;
            valorI++;
        }
        System.out.println("concluído!!!");
        System.out.println("Valores...");
        for (int x = 0; x < 50; x++){
            aux = "";
            if (x < 10)
                aux = "0";
            System.out.println("Valor " + aux + x + ": " + armazena[x]);
        }
 
    }
 
}
