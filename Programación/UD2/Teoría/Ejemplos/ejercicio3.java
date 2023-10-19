// Sería interesante dispner d eun programa que pida como entrada un número decimal y lo muestre redondeado al entero más próximo.

import java.util.Locale;
import java.util.Scanner;

public class ejercicio3 {
    public static void main (String[] args){
        double n;
        int redondeo;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //Esto hace que se emplee el punto en vez de la coma para los decimales.

        System.out.print("Escriba un número decimal (con punto): ");
        n = sc.nextDouble();
        redondeo = (int)(n + 0.5);
        System.out.println(n + " redondeado es: "+ redondeo);
    }
}
