//Modificar el ejercicio anterior para que muestre la parte entera de la media de 3 notas decimales.

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        //Inicialización de variables y scanner.
        int nota1, nota2, nota3;
        int media;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        nota1 = sc.nextInt();
        System.out.print("Nota 2: ");
        nota2 = sc.nextInt();
        System.out.print("Nota 3: ");
        nota3 = sc.nextInt();

        media = (nota1 + nota2 + nota3)/3;

        System.out.print("La nota media es: ");
        System.out.println(media);
    }
}