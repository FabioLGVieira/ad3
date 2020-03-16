/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05_Recursão;

import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_04_Recursão.Ex_05_Potencia.potencia;

/**
 *
 * @author ana.csantos119
 */
public class Ex_10_11_DecBin_BinDec {
    public static void main(String[] args) {
        int decimal=leInteiroPositivo();
        System.out.println("Versão iterativa");
        System.out.println(dec2BinIt(decimal));
        System.out.println("Versão recursiva");
        System.out.println(dec2BinR(decimal));
        
        int binario=leInteiroPositivo();
        System.out.println("Versão iterativa");
        System.out.println(bin2DecIt(binario));
        System.out.println("Versão recursiva");
        System.out.println(bin2DecR(binario));
        
    }

    public static int dec2BinIt(int decimal) {
        int binario=0;
        int cont=0;
        while (decimal>0){
            int resto=decimal%2;
            binario+= resto*(int)Math.pow(10,cont);
            cont++;
            decimal=decimal/2;  
        }
        return binario;
    }
    public static int dec2BinR(int decimal) {   
        if(decimal<2 )
            return decimal;
        
        return decimal%2 + (10*dec2BinR(decimal/2));
          
    }

    public static int bin2DecIt(int binario) {
        int decimal=0;
        int cont=0;
        while (binario>0){
            int resto=binario%10;
            decimal+= resto*(int)Math.pow(2,cont);
            cont++;
            binario=binario/10;  
        }
        return decimal;
    }
    
    public static int bin2DecR(int binario) {   
        if(binario<10 )
            return binario;
        
        return binario%10 + (2*bin2DecR(binario/10));
          
    }
}
