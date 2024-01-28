// Versión mejorada del proyecto anterior en el cual introducimos un número variable de números a comparar.

import java.util.Scanner;

public class ejercicio1b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, numA, numM;

        System.out.print("Introduce el número de números a comparar: ");
        num = sc.nextInt();

        int[] numeros = new int[num]; // Inicializar un array con el tamaño proporcionado

        for (int i = 0; i < num; i++) {
            System.out.print("Introduce el número que quieres comparar: ");
            numA = sc.nextInt();
            numeros[i] = numA; // Asignar el número al elemento correspondiente del array
        }

        System.out.print("Estos son los números que se han introducido: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        numM = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numM) {
                numM = numeros[i];
            }
        }

        System.out.println("El número mayor de los introducidos es: " + numM);
    }
}
