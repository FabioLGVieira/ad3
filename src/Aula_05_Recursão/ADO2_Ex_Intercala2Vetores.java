/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05_Recursão;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_02_Vetores.Ex_09_Intercalacao.bubbleSort;
import static Aula_02_Vetores.Ex_09_Intercalacao.intercalar2Vetores;

/**
 *
 * @author ana.csantos119
 */
public class ADO2_Ex_Intercala2Vetores {
    public static void main(String[] args) {
       int n1=leInteiroPositivo();
       int v1[]=leVetorAleatorio(n1);
       exibeVetor(v1);bubbleSort(v1);exibeVetor(v1);
       
       int n2=leInteiroPositivo();
       int v2[]=leVetorAleatorio(n2);
       exibeVetor(v2);bubbleSort(v2);exibeVetor(v2);
       
       int intercala[]=intercalar2Vetores(v1,v2);
       exibeVetor(intercala);
    }
    public static int[] intercalar2Vetores(int[] v1, int[] v2) {
        int v3[]=new int[v1.length+v2.length];
        int i=0,j=0,k=0;
        
       while (k<v3.length){
           if(i==v1.length){
               v3[k]=v2[j];
               j++; k++;
           } else {
               if(j==v2.length){
                    v3[k]=v1[i];
                    i++; k++;
                } else {
                   if(v1[i]<v2[j]){
                        v3[k]=v1[i];
                        i++; k++;
                   } else {
                        v3[k]=v2[j];
                        j++; k++;     
                    }
               }
           }
        }
        return v3;
    }
}
