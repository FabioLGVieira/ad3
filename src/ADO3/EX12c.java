package ADO3;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author fabio Vieria
 */
public class EX12c {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[];
        v = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.println("soma dos elementos é: " + somaElementosRecursivo(v,0,0));
    }

    public static int somaElementosRecursivo(int[] v, int i, int s) {
        if(i == v.length)
            return s;
        else
            s+=v[i];
        return somaElementosRecursivo(v, i+1,s);
    }
}
