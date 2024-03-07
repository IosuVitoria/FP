package UD1;

import java.util.Scanner;

//Pedir a un usuario su edad y mostrar la que tendrá el próximo año.

public class ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edad;

        System.out.print("Introduce tu edad usuario: ");

        edad = sc.nextInt();

        int cal;

        cal = edad + 1;

        System.out.println("El próximo año tendrás: " + cal + " años.");

    }
}
