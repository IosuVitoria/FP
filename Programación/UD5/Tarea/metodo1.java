import java.util.*;

public class metodo1 {

    public static void main(String[] args) {

        int[] conteo = new int[4];

        String DNA1 = "AAAATTAACCCCGGGTTTCCGGGAAAA";
        String DNA2 = "AAAACCAACCCCGGGTTTCCGGGAAAA";

        conteoDNA(DNA1, conteo);
        mostrarResultados(conteo);

        // Reiniciar el conteo para DNA2
        Arrays.fill(conteo, 0);
        conteoDNA(DNA2, conteo);
        mostrarResultados(conteo);
    }

    public static void conteoDNA(String dna, int[] conteo) {
        for (char nucleotido : dna.toCharArray()) {
            switch (nucleotido) {
                case 'A':
                    conteo[0]++;
                    break;
                case 'C':
                    conteo[1]++;
                    break;
                case 'G':
                    conteo[2]++;
                    break;
                case 'T':
                    conteo[3]++;
                    break;
            }
        }
    }

    public static void mostrarResultados(int[] conteo) {
        System.out.println("Conteo de nucleótidos:");
        System.out.println("A: " + conteo[0]);
        System.out.println("C: " + conteo[1]);
        System.out.println("G: " + conteo[2]);
        System.out.println("T: " + conteo[3]);
        System.out.println("----------------------");
    }
}
