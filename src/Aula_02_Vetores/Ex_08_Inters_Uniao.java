/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Vetores;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.exibeVetorTam;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;
import static Aula_02_Vetores.Ex_07_BuscaLinear.buscaLinear;

/**
 *
 * @author ana.csantos119
 */
public class Ex_08_Inters_Uniao {
    public static void main(String[] args) {
       int n1=leInteiroPositivo();
       int v1[];
       v1=leVetorAleatorio(n1);
       exibeVetor(v1);
       int n2=leInteiroPositivo();
       int v2[];
       v2=leVetorAleatorio(n2);
       exibeVetor(v2);
       System.out.println("Intersecção dos 2 Vetores");
       int inter[]=new int[v1.length];
       int tamInter=inter2Vetores(v1,v2,inter);
       exibeVetor(inter);
       exibeVetorTam(inter,tamInter);
       System.out.println("Uniao dos 2 Vetores");
       int uniao[]=new int[v1.length+v2.length];
       int tamUniao=uniao2Vetores(v1,v2,uniao);
       exibeVetor(uniao);
       exibeVetorTam(uniao,tamUniao);
    }

    public static int inter2Vetores(int[] v1, int[] v2, int[] inter) {
        int k=0;
        //Percorrer v1 e buscar em v2
        for(int i=0;i<v1.length;i++){
            if(buscaLinear(v2,v1[i])!=-1){
               inter[k] =v1[i];
               k++;
            }
        }
        return k;
    }

    public static int uniao2Vetores(int[] v1, int[] v2, int[] uniao) {
        int k=0;
        //Copiando todos elementos de v1 para uniao
        for(int i=0; i<v1.length;i++){
            uniao[k]=v1[i];
            k++;
        }
        //Percorrer v2 e verifica se um elemento de v2 não está em v1
        for(int i=0;i<v2.length;i++){
            if(buscaLinear(v1,v2[i])==-1){
               uniao[k]=v2[i];
               k++;
            }
        }
        return k;
    }
}
