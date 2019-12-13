/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.exercicios;

/**
 *
 * @author _AlyyRazack
 */
public class CalculoTemperatura {
    static double Celsius(int c ){
        return  ((9 * c/5) + 32);
       
    }
    static double FahrenheitC(int f){
        return (f - 32) *  (5/9) ;
    }
    static double CelsiusK(double c){
        return c + 273.15;
    }
    static double KelvinC(double k){
        return k - 273.15;
    }
    static double CelsiusR(double c){
        return c * 4/5 ;
    }
    static double RéaumurC(double Re){
        return Re * 5/4 ;
    }
    static double RéaumurR(float k){
        return k * 1.8 ;
    }
    static double RankineK(float r){
        return  r/1.8;
    }
    
    
    public static void main(String[] args) {
        System.out.println("A temperatura convertida de graus celsius para graus Fahrenheit e: "+Celsius(4));
        System.out.println("A temperatura convertida de fahrenheit para graus celsius e:" +FahrenheitC(4));
        System.out.println("A temperatura convertida de celsius para graus Kelvin e:"+CelsiusK(4));
        System.out.println("A temperatura convertida de kelvin para graus celsius e:"+KelvinC(4));
        System.out.println("A temperatura convertida de clesius para graus Réaumur e:"+CelsiusR(4));
        System.out.println("A temperatura convertida de Réaumur para graus celsius e:"+RéaumurC(4));
        System.out.println("A temperatura convertida de Réaumur para graus rankine e:"+RéaumurR(4));
        System.out.println("A temperatura convertida de rankine para graus celsius e:"+RankineK(4));
    }
    
}
