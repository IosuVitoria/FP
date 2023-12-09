//Video youtube: https://youtu.be/XQh6WwHAAis. ALUMNO: Iosu Gómez Valdecantos.

import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {

    // Declaración de variables con scope para todo el programa.
    private static int partidasGanadas = 0;
    private static int mejorPartida = Integer.MAX_VALUE;
    private static int intentosTotales = 0;

    // Método main. Controla: Introducción, objetos math y scanner, y métodos para
    // que funcione el programa.
    public static void main(String[] args) {
        // Se inicia una vez nada más el objeto scanner para cumplir con el
        // requerimiento
        // de enunciado. Se pasará a los métodos a modo de parámetro.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("El programa genera un número aleatorio del 1 al 100");
        System.out.println("El usuario o usuaria debe adivinarlo en máximo 10 intentos");
        System.out.println("El programa le dará pistas cada vez que falle");

        do {
            jugarPartida(random, scanner);
            System.out.println("¿Quieres jugar otra vez (S/N): ");
            // Métodos que nos permiten recoger la entrada, (trim) eliminar espacios al
            // principio y al final y por último equalsIgnoreCase que verifica que haya una
            // S ya sea mayúscula o minúscula.
        } while (scanner.next().trim().equalsIgnoreCase("S"));

        mostrarEstadisticas();
        System.out.println("¡Gracias por jugar!");
        scanner.close();
        return;
    }

    // Méotodo jugarPartida. Recibe dos parámetros que son dos objetos para su
    // funcionamiento.
    private static void jugarPartida(Random random, Scanner scanner) {
        int numeroAdivinar = random.nextInt(100) + 1;
        int intentoUsuario;
        int intentos = 0;

        System.out.println("He pensado en un número del 1 al 100. ¡Adivina!");

        // Bucle de adivinación del número. Se le agrega un control de máximo 10
        // intentos para evitar que el juego se extienda demasiado.
        do {

            do {
                System.out.print("Adivina el número: ");
                intentoUsuario = scanner.nextInt();
                if (intentoUsuario < 1 || intentoUsuario > 100) {
                    // Controlar que el número esté dentro de las valores del programa.
                    System.out.print("Adivina el número (Recuerda introducir del 1 al 100): ");
                    intentoUsuario = scanner.nextInt();
                }

                // Controlar si el número es menor que uno o mayor que 100.
            } while (intentoUsuario < 1 || intentoUsuario > 100);

            // Limpieza adicional del buffer para evitar problemas con la entrada.
            scanner.nextLine();

            // Suma de intentos de la partida. Se suma uno en cada bucle.
            intentos++;

            // Comprobación de si se ha acertado el número. Dentro con la variable
            // intentosTotales vamos sumando todo para poder después hacer el cálculo.
            if (intentoUsuario == numeroAdivinar) {
                intentosTotales++;
                System.out.printf("¡Correcto! Has adivinado en %d intentos.%n", intentos);
                partidasGanadas++;

                // Actualizar la mejor partida si la actual es mejor. Si tenemos menos intentos
                // esa partida sobreescribe el valor anterior.
                if (intentos < mejorPartida) {
                    mejorPartida = intentos;
                }
                // Controles para indicar si el número es mayor o menor.
            } else if (intentoUsuario < numeroAdivinar) {
                intentosTotales++;
                System.out.println("El número es mayor.");
            } else {
                intentosTotales++;
                System.out.println("El número es menor.");
            }

        } while (intentoUsuario != numeroAdivinar && intentos < 10);

        if (intentoUsuario != numeroAdivinar) {
            System.out.printf("Lo siento, no has adivinado. El número era: %d%n", numeroAdivinar);
        }
    }

    // Mostrar las estadísticas tal cual aparece en el ejemplo. Al tener iniciadas
    // variables a nivel global puedo usarlas en los métodos de esta clase.
    private static void mostrarEstadisticas() {
        System.out.println("Resultados del juego:");
        System.out.printf("Partidas jugadas: %d%n", partidasGanadas);
        System.out.printf("Intentos realizados: %d%n", intentosTotales);
        System.out.printf("Partidas ganadas: %d%n", partidasGanadas);

        // Número medio de intentos por partida. Se recogen los intentos totales y se
        // miran las partidas ganadas.
        double promedio = (partidasGanadas == 0 ? 0 : (double) intentosTotales / partidasGanadas);
        System.out.printf("Intentos promedio por partida: %.1f%n", promedio);

        // Mejor partida (menos intentos). Se controla el caso de que no haya una
        // partida ganada para poner N/A.
        System.out.printf("Mejor partida: %s%n",
                (mejorPartida == Integer.MAX_VALUE) ? "N/A" : String.valueOf(mejorPartida));
    }
}
