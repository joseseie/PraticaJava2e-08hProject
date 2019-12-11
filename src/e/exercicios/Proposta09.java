
package e.exercicios;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author joseseie
 * @author Alfredo Francisco
 * @author Jessica Mavie
 * @author Abdul Rasac
 * @author Iben Enky
 * @author Nicolas Muchate
 * @author Micaela Freitas
 * @author Hassan Mutola
 * 
 */
public class Proposta09 {
    
    /*
    9. Criar um array A com 10 elementos inteiros. Desenvolver um programa que 
    defina o percentual de elementos pares e ímpares, respectivamente, armazenados 
    neste array.
    */
    
    public static void main(String[] args) {
        
        // #algoritmo
        //1. Criar um array A com 10 elementos inteiros.
        //2. Encontrar elementos pares
        //3. Encontrar elementos impares
        //4. Calcular a percentagem
        
        // Passo 1 -  Criar o array
        int[] elementos = {1, 2, 9, 10, 22, 4, 34, 30, 90, 7};
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        
        // Pares
        for (int i = 0; i < elementos.length; i++) {
            
            int el = elementos[i];
            
            if (el % 2 == 0) {
                pares.add(el);
            } else if (el % 2 == 1) {
                impares.add(el);
            }
            
        }
        
      
        double percentPar = pares.size() * 10;
        double percentImpares = impares.size() * 10;
        
        System.out.println("ArrayOriginal: " + Arrays.toString(elementos));
        System.out.println("Apenas pares: " + pares.toString());
        System.out.println("Apenas Impares: " + impares.toString());
        
        System.out.println("Percent de pares: " + percentPar + "%");
        System.out.println("Percent de Impares: " + percentImpares + "%");
        
        
    }
    
}
