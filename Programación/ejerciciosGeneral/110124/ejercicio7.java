// Crea un programa que realice el alineamiento de dos secuencias de ADN. 
// Puedes implementar un algoritmo simple de alineamiento global o local para encontrar similitudes y
//  diferencias entre las dos secuencias.

import java.util.Scanner;

public class ejercicio7{

    public static void main(String[] args) {
        String secuenciaUno, secuenciaDos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la secuencia de ADN de la primera secuencia a comparar: ");
        secuenciaUno = sc.nextLine();
        System.out.println("Introduce la secuencia de ADN de la segunda secuencia a comparar: ");
        secuenciaDos = sc.nextLine();

        int longitudSecuenciaUno = secuenciaUno.length();
        int longitudSecuenciaDos = secuenciaDos.length();

        int[][] matrizAlineamiento = new int[longitudSecuenciaUno + 1][longitudSecuenciaDos + 1];

        // Inicializar la primera fila y columna de la matriz
        for (int i = 0; i <= longitudSecuenciaUno; i++) {
            matrizAlineamiento[i][0] = i;
        }
        for (int j = 0; j <= longitudSecuenciaDos; j++) {
            matrizAlineamiento[0][j] = j;
        }

        // Llenar la matriz de alineamiento
        for (int i = 1; i <= longitudSecuenciaUno; i++) {
            for (int j = 1; j <= longitudSecuenciaDos; j++) {
                int costo = (secuenciaUno.charAt(i - 1) == secuenciaDos.charAt(j - 1)) ? 0 : 1;
                matrizAlineamiento[i][j] = Math.min(matrizAlineamiento[i - 1][j] + 1,
                        Math.min(matrizAlineamiento[i][j - 1] + 1, matrizAlineamiento[i - 1][j - 1] + costo));
            }
        }

        // Imprimir la matriz de alineamiento
        System.out.println("Matriz de Alineamiento:");
        for (int i = 0; i <= longitudSecuenciaUno; i++) {
            for (int j = 0; j <= longitudSecuenciaDos; j++) {
                System.out.print(matrizAlineamiento[i][j] + " ");
            }
            System.out.println();
        }

        // Imprimir el resultado del alineamiento
        System.out.println("Resultado del Alineamiento:");
        int i = longitudSecuenciaUno;
        int j = longitudSecuenciaDos;
        while (i > 0 || j > 0) {
            if (i > 0 && matrizAlineamiento[i][j] == matrizAlineamiento[i - 1][j] + 1) {
                System.out.println("Eliminación en la posición: " + (i - 1));
                i--;
            } else if (j > 0 && matrizAlineamiento[i][j] == matrizAlineamiento[i][j - 1] + 1) {
                System.out.println("Inserción en la posición: " + (j - 1));
                j--;
            } else {
                if (i > 0 && j > 0 && matrizAlineamiento[i][j] == matrizAlineamiento[i - 1][j - 1]) {
                    System.out.println("Coincidencia en la posición: " + (i - 1));
                } else {
                    System.out.println("Reemplazo en la posición: " + (i - 1));
                }
                i--;
                j--;
            }
        }
    }
}

