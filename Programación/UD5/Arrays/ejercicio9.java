// Ejercicio propuesto: cálculo de la frecuencia de nucleótidos en una secuencia de ADN.

import java.util.Arrays;

public class ejercicio9 {

    public static void main(String[] args) {

        String secuenciaADN = "ATTTTCCGGGAGGATTTACCATTAA";
        int[] nucleotidos = new int[4];
        conteo(secuenciaADN, nucleotidos);

        System.out.println("Estos son los contenos de A, T, C y G: " + Arrays.toString(nucleotidos));

    }

    public static void conteo(String sec, int[] arr) {

        for (int i = 0; i < sec.length(); i++) {
            if (sec.charAt(i) == 'A') {
                arr[0]++;
            } else if (sec.charAt(i) == 'T') {
                arr[1]++;
            } else if (sec.charAt(i) == 'C') {
                arr[2]++;
            } else {
                arr[3]++;
            }
        }
    }
}
