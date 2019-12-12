/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.e.exercicios7;



import java.util.Scanner;

/**
 *
 * @author _AlyyRazack
 */
public class Proposta02 {
    /*2. Escreva um programa que leia 10 valores reais do teclado e armazene-os num array d
    e permita que sejam impressos quanto solicitados.*/
    public static void main(String[] args) {
       
 
        menu();
       
    
    }
 public static void adicionar(){
     Scanner sc = new Scanner(System.in);
     int [] array = new int[10];
     for (int i = 0; i <array.length; i++) {
     System.out.println("digite os elementos: ");
     array[i] = sc.nextInt();
   
         
     }
       menu();
 }
 public static void menu(){
      Scanner sc = new Scanner(System.in);
        System.out.println("1-para adicionar elementos");
        System.out.println("2-para mostrar elementos adicionados");
        int opcao = sc.nextInt();
        switch(opcao){
            case 1:
                Proposta02.adicionar();
                break;
            case 2:
                break;
        }
      
 }
    
}
