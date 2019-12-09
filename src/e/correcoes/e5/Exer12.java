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
public class Exer12 {
    public static void main (String [] args){
    
//12.Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.
int a=8;
int b=9;
int c=7;
int d=4;
int e=5;
int f=6;
int media1=(a+b+c/3);
int media2=(d+e+f/3);
int soma=(media1+media2);
int media3=(soma/2);

System.out.println("Media dos numeros 8,9 e 7="+media1);
System.out.println("Media dos numeros 4,5 e 6="+media2);
System.out.println("Soma das medias="+soma);
System.out.println("A media das medias="+media3);
    
    }
}
