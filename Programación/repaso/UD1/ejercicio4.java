package UD1;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nombre;

        int edad;

        System.out.print("Introduce tu nombre: ");
        nombre = sc.nextLine();
        System.out.print("Introduce tu edad: ");
        edad = sc.nextInt();

        System.out.println("Hola " + nombre + " ya sé que tienes " + edad + " años");

    }
}
