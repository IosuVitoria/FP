import java.util.Scanner;

public class ejercicio2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de números que deseas valorar: ");
        int numNums = scanner.nextInt();

        int[] numeros = recopilacionNumeros(scanner, numNums);

        // Verificar el número más grande
        if (numeros.length > 0) {
            int maximo = numeros[0];
            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] > maximo) {
                    maximo = numeros[i];
                }
            }
            System.out.println("El número más grande es: " + maximo);
        } else {
            System.out.println("No se ingresaron números para evaluar.");
        }
    }

    public static int[] recopilacionNumeros(Scanner scanner, int numNums) {
        int[] numeros = new int[numNums];

        for (int i = 0; i < numNums; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        return numeros;
    }
}
