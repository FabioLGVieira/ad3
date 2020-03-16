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
public class Ex_09_QuocDiv {
    public static void main(String[] args) {
        int x=leInteiroPositivo();
        int y=leInteiroPositivo();
        System.out.println(quocDiv(x,y));
    }

    public static int quocDiv(int x, int y) {
       if(x < y){
           return 0;
       }
       return 1+quocDiv(x-y,y);
    }
}
