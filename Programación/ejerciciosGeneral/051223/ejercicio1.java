// ################################################################################
// Escribir un programa que pregunte al usuario su nombre, y luego lo salude.
// ################################################################################
// Análisis
// Tenemos que pedir un nombre por teclado y luego escribir un mensaje de saludo
// Datos de entrada: nombre (Cadena)
// Variables: nombre (Cadena)
// ################################################################################
// Diseño
// 1. Leer nombre
// 2. Escribir mensaje de saludo
// ################################################################################

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre;

        System.out.println("Bienvenido a programa de saludo!");
        System.out.print("Introduce tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("Bienvenido/a " + nombre);
    }
}
