// Necesitamos una aplicación que pida dos notas enteras y calcule la media aritmética. Hay que tener en cuenta que la media puede contener decimales.

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        //Inicialización de variables y scanner.
        int nota1, nota2;
        double media;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        nota1 = sc.nextInt();
        System.out.print("Nota 2: ");
        nota2 = sc.nextInt();

        media = (nota1 + nota2)/2.0;

        System.out.println("La nota media es: ");
        System.out.println(media);
    }
}
