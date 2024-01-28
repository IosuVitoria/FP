import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;
import java.io.FileNotFoundException;

public class CuentosLocos3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        presentacion();
        char opcion;
        do {
            mostrarMenu();
            opcion = teclado.next().charAt(0);
            ejecutarOpcion(opcion, teclado);
        } while (opcion != 'S' && opcion != 's');
        teclado.close();
        System.out.println("Agur!");
    }

    public static void presentacion() {
        System.out.println("Bienvenidos y bienvenidas al juego de los cuentos locos.\n"
                + "El programa te pedirá que introduzcas una serie de palabras\n"
                + "que se utilizarán para completar una historia.\n" + "El resultado se guardará en un fichero.\n"
                + "Puedes leer esas historias siempre que quieras.\n");
    }

    public static void mostrarMenu() {
        System.out.println("******* MENU *******:\n"
                + "(C) rear un nuevo 'Mad Lib'\n"
                + "(V) er un 'Mad Lib'\n"
                + "(S) alir\n"
                + "Elige una opción: ");
    }

    public static void ejecutarOpcion(char opcion, Scanner teclado) {
        switch (opcion) {
            case 'C':
            case 'c':
                crearCuento(teclado);
                break;
            case 'V':
            case 'v':
                verCuento(teclado);
                break;
            case 'S':
            case 's':
                // No es necesario hacer nada aquí, se saldrá del bucle
                break;
            default:
                System.out.println("Opción incorrecta. Por favor, elige una opción válida.");
        }
    }

    public static void crearCuento(Scanner teclado) {
        System.out.println("Has elegido crear un nuevo Mad Lib.");
        String nombreFicheroEntrada, nombreFicheroSalida;
        do {
            System.out.print("Introduce el nombre del fichero de entrada: ");
            nombreFicheroEntrada = teclado.nextLine();
        } while (!validarFichero(nombreFicheroEntrada));

        do {
            System.out.print("Introduce el nombre del fichero de salida: ");
            nombreFicheroSalida = teclado.nextLine();
        } while (!validarFichero(nombreFicheroSalida));

        try (Scanner lector = new Scanner(new File(nombreFicheroEntrada));
                PrintStream escritor = new PrintStream(new File(nombreFicheroSalida))) {

            // Aquí continuaría el código para leer el fichero, identificar huecos,
            // solicitar palabras, y escribir la historia
            // Recuerda implementar la lógica de reemplazar los huecos y escribir la
            // historia en el fichero de salida

            System.out.println("¡Cuento creado exitosamente!");

        } catch (FileNotFoundException e) {
            System.out.println("Error: No se pudo encontrar el fichero.");
        }
    }

    public static void verCuento(Scanner teclado) {
        System.out.println("Has elegido ver un Mad Lib existente.");
        String nombreFichero;
        do {
            System.out.print("Introduce el nombre del fichero: ");
            nombreFichero = teclado.nextLine();
        } while (!validarFichero(nombreFichero));

        try (Scanner lector = new Scanner(new File(nombreFichero))) {
            // Aquí continuaría el código para leer el fichero y mostrar la historia
            // Recuerda implementar la lógica para mostrar correctamente el contenido del
            // fichero

        } catch (FileNotFoundException e) {
            System.out.println("Error: No se pudo encontrar el fichero.");
        }
    }

    public static boolean validarFichero(String nombreFichero) {
        // Aquí puedes implementar la lógica para validar si el fichero existe y puede
        // ser leído
        // Devuelve true si el fichero es válido, false en caso contrario
        return true; // Cambiar según la lógica real de validación
    }
}
