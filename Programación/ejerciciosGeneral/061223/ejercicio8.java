
/**
 * <p>
 * Biblioteca de funciones matemáticas.
 * </p>
 * <ol>
 * <li>esCapicua: Devuelve verdadero si el número que se pasa como parámetro es
 * capicúa y falso en
 * caso contrario.</li>
 * 
 * <li>esPrimo: Devuelve verdadero si el número que se pasa como parámetro es
 * primo y falso en caso
 * contrario.</li>
 * 
 * <li>siguientePrimo: Devuelve el menor primo que es mayor al número que se
 * pasa como parámetro.</li>
 * 
 * <li>potencia: Dada una base y un exponente devuelve la potencia.</li>
 * 
 * <li>digitos: Cuenta el número de dígitos de un número entero.</li>
 * 
 * <li>voltea: Le da la vuelta a un número.</li>
 * 
 * <li>digitoN: Devuelve el dígito que está en la posición n de un número
 * entero. Se empieza contando
 * por el 0 y de izquierda a derecha.</li>
 * 
 * <li>posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
 * dentro de un número
 * entero. Si no se encuentra, devuelve -1.</li>
 * 
 * <li>quitaPorDetras: Le quita a un número n dígitos por detrás (por la
 * derecha).</li>
 * 
 * <li>quitaPorDelante: Le quita a un número n dígitos por delante (por la
 * izquierda).</li>
 * 
 * <li>pegaPorDetras: Añade un dígito a un número por detrás.</li>
 * 
 * <li>pegaPorDelante: Añade un dígito a un número por delante.</li>
 * 
 * <li>trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro
 * de un número y
 * devuelve el trozo correspondiente.</li>
 * 
 * <li>juntaNumeros: Pega dos números para formar uno.</li>
 * </ol>
 * <p>
 * Ejercicios del libro "Aprende Java con Ejercicios. Edición 2019".
 * </p>
 * 
 * Clase 1ºDAW IES Gran Capitán, curso 2019/20.
 *
 */

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matematicas funcionesMatematicas = new Matematicas();

        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Verificar si un número es capicúa");
            System.out.println("2. Verificar si un número es primo");
            System.out.println("3. Encontrar el siguiente número primo");
            System.out.println("4. Calcular la potencia de un número");
            System.out.println("5. Contar el número de dígitos de un número entero");
            System.out.println("6. Dar la vuelta a un número");
            System.out.println("7. Devolver el dígito en una posición específica");
            System.out.println("8. Encontrar la posición de la primera ocurrencia de un dígito");
            System.out.println("9. Quitar dígitos por detrás");
            System.out.println("10. Quitar dígitos por delante");
            System.out.println("11. Añadir un dígito por detrás");
            System.out.println("12. Añadir un dígito por delante");
            System.out.println("13. Obtener un trozo de número");
            System.out.println("14. Unir dos números");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    verificarCapicua(sc, funcionesMatematicas);
                    break;
                case 2:
                    verificarPrimo(sc, funcionesMatematicas);
                    break;
                case 3:
                    encontrarSiguientePrimo(sc, funcionesMatematicas);
                    break;
                case 4:
                    calcularPotencia(sc, funcionesMatematicas);
                    break;
                case 5:
                    contarDigitos(sc, funcionesMatematicas);
                    break;
                case 6:
                    darVueltaNumero(sc, funcionesMatematicas);
                    break;
                case 7:
                    obtenerDigitoEnPosicion(sc, funcionesMatematicas);
                    break;
                case 8:
                    encontrarPosicionDeDigito(sc, funcionesMatematicas);
                    break;
                case 9:
                    quitarDigitosDetras(sc, funcionesMatematicas);
                    break;
                case 10:
                    quitarDigitosDelante(sc, funcionesMatematicas);
                    break;
                case 11:
                    agregarDigitoDetras(sc, funcionesMatematicas);
                    break;
                case 12:
                    agregarDigitoDelante(sc, funcionesMatematicas);
                    break;
                case 13:
                    obtenerTrozoNumero(sc, funcionesMatematicas);
                    break;
                case 14:
                    unirDosNumeros(sc, funcionesMatematicas);
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (opcion != 0);

        sc.close();
    }

    private static void verificarCapicua(Scanner sc, Matematicas funcionesMatematicas) {
        System.out.print("Introduce un número para verificar si es capicúa: ");
        int numeroCapicua = sc.nextInt();
        boolean capicuaResult = funcionesMatematicas.esCapicua(numeroCapicua);
        System.out.println("Es capicúa: " + capicuaResult);
    }

    private static void verificarPrimo(Scanner sc, Matematicas funcionesMatematicas) {
        System.out.print("Introduce un número para verificar si es primo: ");
        int numeroPrimo = sc.nextInt();
        boolean primoResult = funcionesMatematicas.esPrimo(numeroPrimo);
        System.out.println("Es primo: " + primoResult);
    }

    private static void encontrarSiguientePrimo(Scanner sc, Matematicas funcionesMatematicas) {
        System.out.print("Introduce un número para encontrar el siguiente primo: ");
        int numeroSiguientePrimo = sc.nextInt();
        int siguientePrimoResult = funcionesMatematicas.siguientePrimo(numeroSiguientePrimo);
        System.out.println("El siguiente primo es: " + siguientePrimoResult);
    }

    private static void calcularPotencia(Scanner sc, Matematicas funcionesMatematicas) {
        System.out.print("Introduce la base: ");
        double basePotencia = sc.nextDouble();
        System.out.print("Introduce el exponente: ");
        int exponentePotencia = sc.nextInt();
        double potenciaResult = funcionesMatematicas.potencia(basePotencia, exponentePotencia);
        System.out.println("La potencia es: " + potenciaResult);
    }

    private static void contarDigitos(Scanner sc, Matematicas funcionesMatematicas) {
        System.out.print("Introduce un número para contar sus dígitos: ");
        int numeroDigitos = sc.nextInt();
        int digitosResult = funcionesMatematicas.digitos(numeroDigitos);
        System.out.println("El número de dígitos es: " + digitosResult);
    }

    private static void darVueltaNumero(Scanner sc, Matematicas funcionesMatematicas) {
        System.out.print("Introduce un número para darle la vuelta: ");
        int numeroVolteado = sc.nextInt();
        int volteadoResult = funcionesMatematicas.voltea(numeroVolteado);
        System.out.println("El número volteado es: " + volteadoResult);
    }

    private static void obtenerDigitoEnPosicion(Scanner sc, Matematicas funcionesMatematicas) {
        System.out.print("Introduce un número: ");
        int numeroDigito = sc.nextInt();
        System.out.print("Introduce la posición del dígito que quieres obtener: ");
        int posicionDigito = sc.nextInt();
        int digitoResult = funcionesMatematicas.digitoN(numeroDigito, posicionDigito);
        System.out.println("El dígito en la posición " + posicionDigito + " es: " + digitoResult);
    }

    private static void encontrarPosicionDeDigito(Scanner sc, Matematicas funcionesMatematicas) {
        System.out.print("Introduce un número: ");
        int numeroBuscar = sc.nextInt();
        System.out.print("Introduce el dígito que quieres buscar: ");
        int digitoBuscar = sc.nextInt();
        int posicionDigitoResult = funcionesMatematicas.posicionDeDigito(numeroBuscar, digitoBuscar);
        if (posicionDigitoResult != -1) {
            System.out.println("La posición del primer " + digitoBuscar + " es: " + posicionDigitoResult);
        } else {
            System.out.println("El dígito no se encontró en el número.");
        }
    }

    private static void quitarDigitosDetras(Scanner sc, Matematicas funcionesMatematicas) {
        System.out.print("Introduce un número para quitar dígitos por detrás: ");
        int numeroQuitarDetras = sc.nextInt();
        System.out.print("Introduce la cantidad de dígitos a quitar por detrás: ");
        int cantidadQuitarDetras = sc.nextInt();
        int quitarDetrasResult = funcionesMatematicas.quitaPorDetras(numeroQuitarDetras, cantidadQuitarDetras);
        System.out.println("El número después de quitar dígitos por detrás es: " + quitarDetrasResult);
    }

    private static void quitarDigitosDelante(Scanner sc, Matematicas funcionesMatematicas) {
        System.out.print("Introduce un número para quitar dígitos por delante: ");
        int numeroQuitarDelante = sc.nextInt();
        System.out.print("Introduce la cantidad de dígitos a quitar por delante: ");
        int cantidadQuitarDelante = sc.nextInt();
        int quitarDelanteResult = funcionesMatematicas.quitaPorDelante(numeroQuitarDelante, cantidadQuitarDelante);
        System.out.println("El número después de quitar dígitos por delante es: " + quitarDelanteResult);
    }

    private static void agregarDigitoDetras(Scanner sc, Matematicas funcionesMatematicas) {
        System.out.print("Introduce un número para añadir un dígito por detrás: ");
        int numeroAgregarDetras = sc.nextInt();
        System.out.print("Introduce el dígito a añadir por detrás: ");
        int digitoAgregarDetras = sc.nextInt();
        int agregarDetrasResult = funcionesMatematicas.pegaPorDetras(numeroAgregarDetras, digitoAgregarDetras);
        System.out.println("El número después de añadir el dígito por detrás es: " + agregarDetrasResult);
    }

    private static void agregarDigitoDelante(Scanner sc, Matematicas funcionesMatematicas) {
        System.out.print("Introduce un número para añadir un dígito por delante: ");
        int numeroAgregarDelante = sc.nextInt();
        System.out.print("Introduce el dígito a añadir por delante: ");
        int digitoAgregarDelante = sc.nextInt();
        int agregarDelanteResult = funcionesMatematicas.pegaPorDelante(numeroAgregarDelante, digitoAgregarDelante);
        System.out.println("El número después de añadir el dígito por delante es: " + agregarDelanteResult);
    }

    private static void obtenerTrozoNumero(Scanner sc, Matematicas funcionesMatematicas) {
        System.out.print("Introduce un número para obtener un trozo: ");
        int numeroTrozo = sc.nextInt();
        System.out.print("Introduce la posición inicial del trozo: ");
        int posicionInicialTrozo = sc.nextInt();
        System.out.print("Introduce la posición final del trozo: ");
        int posicionFinalTrozo = sc.nextInt();
        int trozoNumeroResult = funcionesMatematicas.trozoDeNumero(numeroTrozo, posicionInicialTrozo,
                posicionFinalTrozo);
        System.out.println("El trozo de número es: " + trozoNumeroResult);
    }

    private static void unirDosNumeros(Scanner sc, Matematicas funcionesMatematicas) {
        System.out.print("Introduce el primer número para unir: ");
        int numeroUnion1 = sc.nextInt();
        System.out.print("Introduce el segundo número para unir: ");
        int numeroUnion2 = sc.nextInt();
        int unionNumerosResult = funcionesMatematicas.juntaNumeros(numeroUnion1, numeroUnion2);
        System.out.println("El resultado de unir los dos números es: " + unionNumerosResult);
    }
}

class Matematicas {

    // Verificar si un número es capicúa
    boolean esCapicua(int numero) {
        String numeroStr = String.valueOf(numero);
        String numeroReverso = new StringBuilder(numeroStr).reverse().toString();
        return numeroStr.equals(numeroReverso);
    }

    // Verificar si un número es primo
    boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Encontrar el siguiente número primo
    int siguientePrimo(int numero) {
        int siguiente = numero + 1;
        while (!esPrimo(siguiente)) {
            siguiente++;
        }
        return siguiente;
    }

    // Calcular la potencia de un número
    double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    // Contar el número de dígitos de un número entero
    int digitos(int numero) {
        return String.valueOf(numero).length();
    }

    // Dar la vuelta a un número
    int voltea(int numero) {
        return Integer.parseInt(new StringBuilder(String.valueOf(numero)).reverse().toString());
    }

    // Devolver el dígito en una posición específica
    int digitoN(int numero, int posicion) {
        String numeroStr = String.valueOf(numero);
        char digito = numeroStr.charAt(posicion);
        return Integer.parseInt(String.valueOf(digito));
    }

    // Encontrar la posición de la primera ocurrencia de un dígito
    int posicionDeDigito(int numero, int digito) {
        String numeroStr = String.valueOf(numero);
        int posicion = numeroStr.indexOf(String.valueOf(digito));
        return posicion == -1 ? -1 : posicion;
    }

    // Quitar dígitos por detrás
    int quitaPorDetras(int numero, int digitos) {
        String numeroStr = String.valueOf(numero);
        String resultadoStr = numeroStr.substring(0, numeroStr.length() - digitos);
        return Integer.parseInt(resultadoStr);
    }

    // Quitar dígitos por delante
    int quitaPorDelante(int numero, int digitos) {
        String numeroStr = String.valueOf(numero);
        String resultadoStr = numeroStr.substring(digitos);
        return Integer.parseInt(resultadoStr);
    }

    // Añadir un dígito por detrás
    int pegaPorDetras(int numero, int digito) {
        String resultadoStr = String.valueOf(numero) + digito;
        return Integer.parseInt(resultadoStr);
    }

    // Añadir un dígito por delante
    int pegaPorDelante(int numero, int digito) {
        String resultadoStr = digito + String.valueOf(numero);
        return Integer.parseInt(resultadoStr);
    }

    // Obtener un trozo de número
    int trozoDeNumero(int numero, int posicionInicial, int posicionFinal) {
        String numeroStr = String.valueOf(numero);
        String trozoStr = numeroStr.substring(posicionInicial, posicionFinal + 1);
        return Integer.parseInt(trozoStr);
    }

    // Unir dos números
    int juntaNumeros(int numero1, int numero2) {
        String resultadoStr = String.valueOf(numero1) + String.valueOf(numero2);
        return Integer.parseInt(resultadoStr);
    }
}
