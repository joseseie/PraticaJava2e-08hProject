
package mz.e.exercicios7;

/**
 *
 * @author _AlyyRazack
 */
import java.util.Scanner;

/**
 *
 * @author guilherme
 */
public class Proposta01 {
    /*1.O sistema de admissão à UEM da maior parte dos cursos de engenharias é composto
por dois exames, Matemática e Física. Supondo que o primeiro exame tem peso 70%,
e o segundo tem peso 30%. Faça um porgrama para calcular a média final de 10
alunos nestas disciplinas.*/


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //crio a matriz de 2 notas por 10 alunos
        Double[][] notas = new Double[10][2];

        //preencho os valores
        //primeiro um for para cada aluno
        for (int i = 0; i < 10; i++) {
            System.out.println("");
            System.out.println((i + 1) +"."+ " aluno : ");

            //agora para cada nota
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite a " + (j + 1) + " nota :");
                notas[i][j] = input.nextDouble();
            }

        }//T1 * 30% + T2 * 30%

        //calculo da media
        for (int a = 0; a < 10; a++) {
            double soma = 0;
            //soma pega as 2 notas
            soma = notas[a][0] + notas[a][1];

            //calculo a media
            double media = soma / 2;
            //coloco a  coluna de indice 1 o valor da media
            notas[a][1] = media;
        }
        for (int b = 0; b < 10; b++) {

            double mediaAluno = 0;
            mediaAluno = notas[b][1];

            System.out.println("Aluno numero " + (b + 1) + " teve media " + mediaAluno);
        }

    }
}
