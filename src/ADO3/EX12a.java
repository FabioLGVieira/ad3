package ADO3;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author fabio Vieria
 */
public class EX12a {

    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[];
        v = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.println("digite um valor a ser procurado: ");
        int p = leInteiroPositivo();
        System.out.println("o elemento esta na posicao: " + LinearRecursivo(v, p, 0));
    }

    public static int LinearRecursivo(int[] v, int p, int i) {
        if(v[i] == p)
            return i;
        else if(i == v.length-1)
            return -1;
        return LinearRecursivo(v, p, i+1);
    }
}
