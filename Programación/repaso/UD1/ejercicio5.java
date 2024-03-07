package UD1;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        int tabla;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la tabla de multiplicar que quieres ver: ");
        tabla = sc.nextInt();

        int resultado = 0;

        for (int i = 0; i <= 10; i++) {
            resultado = i * tabla;
            System.out.println(tabla + " x " + i + " = " + resultado);
        }
    }
}
