package ADO3;

import static Aula_02_Vetores.Ex_04_Inverter.exibeVetor;
import static Aula_02_Vetores.Ex_04_Inverter.leInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.leVetorAleatorio;

/**
 *
 * @author fabio Vieria
 */
public class EX12d {

    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = {42,48,43,39,11};
        //v = leVetorAleatorio(n);
        exibeVetor(v);
        System.out.println("media dos elementos é: " + MediaRecursiva(v, 0, 0));
    }

    public static float MediaRecursiva(int[] v, int i, float s) {
        if(i == v.length)
            return s/i;
        else
            s+=v[i];
        return MediaRecursiva(v, i+1,s);
    }
}
