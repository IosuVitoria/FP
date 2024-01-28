import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Adn {

    static double Adenina = 135.128;
    static double Citosina = 111.103;
    static double Guanina = 151.128;
    static double Timina = 125.107;
    static double Basura = 100.000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombres de archivos
        System.out.print("Introduce el nombre del fichero de entrada: ");
        String inputFileName = scanner.nextLine();
        System.out.print("Introduce el nombre del fichero de salida: ");
        String outputFileName = scanner.nextLine();

        try {
            // Leer el archivo de entrada y procesar cada secuencia de ADN
            Scanner inputFileScanner = new Scanner(new File(inputFileName));
            PrintStream outputFileStream = new PrintStream(new File(outputFileName));

            while (inputFileScanner.hasNextLine()) {
                String description = inputFileScanner.nextLine();
                String sequence = inputFileScanner.nextLine();

                processDNASequence(description, sequence, outputFileStream);
            }

            inputFileScanner.close();
            outputFileStream.close();

        } catch (FileNotFoundException e) {
            System.err.println("Error: Archivo no encontrado.");
        }
    }

    // Método para procesar cada secuencia de ADN
    private static void processDNASequence(String description, String sequence, PrintStream outputStream) {
        // Inicializar arrays y variables necesarias

        // Calcular contadores de nucleótidos
        int[] conteo = new Arrays[4];
        int[] nucleotideCount = conteoDNA(sequence, conteo);

        // Calcular masa total y porcentajes de masa
        // double[] massPercentages = calculateMassPercentages(sequence);

        // Obtener lista de codones
        // String[] codons = getCodons(sequence);

        // Comprobar si la secuencia codifica una proteína
        // boolean isProtein = isProtein(sequence, nucleotideCount);

        // Mostrar resultados por consola y escribir en el archivo de salida
        printResults(description, sequence, nucleotideCount, massPercentages, codons, isProtein, outputStream);
    }

    public static conteoDNA(String dna, int[] conteo) {
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

        return conteo;
    }

    // Método para imprimir resultados en consola y escribir en el archivo de salida
    private static void printResults(String description, String sequence, int[] nucleotideCount,
            double[] massPercentages, String[] codons, boolean isProtein, PrintStream outputStream) {
        // Mostrar resultados en consola
        System.out.println("Descripción: " + description);
        System.out.println("Nucleótidos: " + sequence);
        System.out.println("Contadores: " + Arrays.toString(nucleotideCount));
        // System.out.printf("Masa (%%): %.1f, %.1f, %.1f, %.1f de %.1f\n",
        // massPercentages[0], massPercentages[1], massPercentages[2],
        // massPercentages[3], massPercentages[4]);
        // System.out.println("Lista Codones: " + Arrays.toString(codons));
        // System.out.println("Es proteína: " + (isProtein ? "SI" : "NO"));
        // System.out.println();

        // Escribir resultados en el archivo de salida
        outputStream.println("Descripción: " + description);
        outputStream.println("Nucleótidos: " + sequence);
        outputStream.println("Contadores: " + Arrays.toString(nucleotideCount));
        outputStream.printf("Masa (%%): %.1f, %.1f, %.1f, %.1f de %.1f\n",
                massPercentages[0], massPercentages[1], massPercentages[2], massPercentages[3], massPercentages[4]);
        outputStream.println("Lista Codones: " + Arrays.toString(codons));
        outputStream.println("Es proteína: " + (isProtein ? "SI" : "NO"));
        outputStream.println();
    }

}
