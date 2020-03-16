/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Recursão;

import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author ana.csantos119
 */
public class Ex_05_Potencia {
    public static void main(String[] args) {
        int a=leInteiroPositivo();
        int n=leInteiroPositivo();
        System.out.println(potencia(a,n));
    }

    public static int potencia(int a, int n) {
       if (n==1){
           return a;
       }
       return a*potencia(a,n-1);
    }
}
