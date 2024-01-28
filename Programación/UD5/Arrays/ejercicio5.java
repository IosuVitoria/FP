// Programa que cuenta las veces que se repite cada vocal en un String.
//  Se utiliza un array para llevar la cuenta.

import java.util.*;

public class ejercicio5 {

    public static void main(String[] args) {

        // Declarar y iniciar un array para las 5 vocales. Arrancar escáner también.
        int[] conteo = new int[5];
        Scanner sc = new Scanner(System.in);

        // Introducir la cadena a analizar
        System.out.print("Introduce el texto que deseas analizar: ");
        String analizar = sc.nextLine();

        // Pasar el texto a minúsculas para simplificar la tarea
        analizar = analizar.toLowerCase();

        for (int i = 0; i < analizar.length(); i++) {
            char letra = analizar.charAt(i);
            if (letra == 'a') {
                conteo[0]++;
            } else if (letra == 'e') {
                conteo[1]++;
            } else if (letra == 'i') {
                conteo[2]++;
            } else if (letra == 'o') {
                conteo[3]++;
            } else if (letra == 'u') {
                conteo[4]++;
            }
        }

        System.out.println("El resultado del conteo de vocales (a, e, i, o, u) ha sido: " + Arrays.toString(conteo));
    }
}
