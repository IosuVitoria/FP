// Escribe un programa en Java que realice la transcripción de una cadena de ADN a ARN. 
// Dada una cadena de ADN, el programa debe generar la cadena de ARN correspondiente. 
// Utiliza las reglas de apareamiento de bases nitrogenadas (A con U, T con A, C con G, G con C).

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        String secuenciaADN, secuenciaARN = ""; // Inicializa secuenciaARN

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la secuencia de ADN que será transcrita a ARN: ");
        secuenciaADN = sc.nextLine();

        for (int i = 0; i < secuenciaADN.length(); i++) {
            if (secuenciaADN.charAt(i) == 'A' || secuenciaADN.charAt(i) == 'a') {
                secuenciaARN += "U";
            } else if (secuenciaADN.charAt(i) == 'T' || secuenciaADN.charAt(i) == 't') {
                secuenciaARN += "A";
            } else if (secuenciaADN.charAt(i) == 'C' || secuenciaADN.charAt(i) == 'c') {
                secuenciaARN += "G";
            } else if (secuenciaADN.charAt(i) == 'G' || secuenciaADN.charAt(i) == 'g') {
                secuenciaARN += "C";
            } else {
                secuenciaARN += "X";
            }
        }

        System.out.println("En el caso de no ser reconocida la base nitrogenada se introduce una X. Esto indica que es una base aberrante.");
        System.out.println("La secuencia de ARN final es: " + secuenciaARN);
    }
}
