/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03_Desempenho;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_03_Desempenho.Ex_04_MaiorDifVetor.maiorDifVetor;

/**
 *
 * @author ana.csantos119
 */
public class Ex_05_ComprSegmentoCresc {
    public static void main(String[] args) {
        int n=leInteiroPositivo();
       int v[]=leVetor(n);
       exibeVetor(v);
       System.out.println("O maior segmento tem comprimento = "+maiorSegCrescenteVetor(v));
    }

    public static int maiorSegCrescenteVetor(int[] v) {
       int cont=1;
       int max=1;
       for (int i=0; i<v.length-1;i++){
           if (v[i]<v[i+1]){
               cont++;
           } else{
               if (cont>max){
                   max=cont;
                   cont=1;
               }
           }
       }
       if (cont>max)
          max=cont;
       return max;
    }
     
}
