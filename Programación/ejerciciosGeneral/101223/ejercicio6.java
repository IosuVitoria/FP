//   Ejercicio 6: Contar palabras en un archivo
// Desarrolla un programa que lea un archivo de texto y cuente la cantidad de palabras presentes en él. Puedes considerar que las palabras están separadas por espacios en blanco.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ejercicio6 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("./ficheros/entrada.txt"))) {
            String linea;
            int totalPalabras = 0;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\\s+"); // Dividir por espacios en blanco
                totalPalabras += palabras.length;
            }
            System.out.println("Total de palabras en el archivo: " + totalPalabras);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}