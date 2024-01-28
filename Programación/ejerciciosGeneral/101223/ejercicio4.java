// Ejercicio 4: Lectura de un archivo de texto
// Escribe un programa que lea el contenido de un archivo de texto llamado "entrada.txt" y lo imprima en la consola.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ejercicio4 {

    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new FileReader("./ficheros/entrada.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}      