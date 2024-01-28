import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String input = scanner.nextLine();

        int contadorVocales = contarVocales(input);

        System.out.println("El número de vocales en la cadena es: " + contadorVocales);

        scanner.close();
    }

    // Método para contar el número de vocales en una cadena
    private static int contarVocales(String cadena) {
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = Character.toLowerCase(cadena.charAt(i));

            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }

        return contador;
    }
}
