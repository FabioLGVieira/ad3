/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05_Recursão;

import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;

/**
 *
 * @author ana.csantos119
 */
public class Ex_07_Primos {
    public static void main(String[] args) {
        int n=leInteiroPositivo();
        System.out.println("Versão iterativa");
        System.out.println(ePrimoIt(n));
        System.out.println("Versão recursiva");
        System.out.println(ePrimoR(n));
    }

    public static boolean ePrimoIt(int n) {
       for (int i=2;i<n;i++)
           if(n%i==0)
               return false;
       return true;   
    } 
    
    public static boolean ePrimoR(int n) {
       return ePrimoR(n,n-1);
    }
    
   public static boolean ePrimoR(int n, int i) {
       if(i==1)
           return true;
       if(n%i==0)
           return false;

       return ePrimoR(n,i-1);
       
    }
}
