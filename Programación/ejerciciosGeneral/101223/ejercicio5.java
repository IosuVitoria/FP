// Ejercicio 5: Escritura en un archivo de texto
// Crea un programa que solicite al usuario ingresar algunas líneas de texto y guarde esas líneas en un archivo llamado "salida.txt". Asegúrate de cerrar adecuadamente el archivo después de escribir en él.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args){
       try (BufferedWriter bw = new BufferedWriter(new FileWriter("./ficheros/salida.txt"))) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa líneas de texto (Escribe 'fin' para terminar):");
            String linea;
            while (!(linea = scanner.nextLine()).equalsIgnoreCase("fin")) {
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Datos escritos en 'salida.txt'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
