package ADO3;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author fabio Vieria
 */
public class EX12b {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[];
        v = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.println("o menor elemento é: " + menorElementoRecursivo(v,0,v[v.length-1]));
    }

    public static int menorElementoRecursivo(int[] v, int i, int m) {
        if(i == v.length-1)
            return m;
        else if(v[i] < m)
            m = v[i];
        return menorElementoRecursivo(v, i+1, m);
    }
}
