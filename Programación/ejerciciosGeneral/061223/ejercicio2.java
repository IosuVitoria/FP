// ################################################################################
// Escribir un programa que convierta un valor dado en grados Fahrenheit a grados
// Celsius.
// ################################################################################
// Análisis
// Tenemos que leer una temperatura en grados Fahrenheit y devolverla en grados
// celsius.
// Datos de entrada: grados Fahrenheit (real)
// Información de salida: grado Celsius (real)
// Variables: fahrenheit, celsius (Real).
// ################################################################################
// Diseño
// 1. Leer la temperatura en grados Fahrenheit
// 2. Calcular los grados celsius (C = (F-32)*5/9)
// 3. Mostrar grados celsius
// ################################################################################

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double F, C;

        System.out.print("Introduce la temperatura en fahrenheit: ");
        F = sc.nextDouble();
        C = (F-32)*5/9;

        System.out.println("La temperatura en grados celsius es: "+C+"ºC.");
    }
}
