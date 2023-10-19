// Crear un programa que pida la base y la altura de un triángulo y muestre su área.

import java.util.Scanner;

public class ejercicio4 {
    
    public static void main(String[] args){
        //Declaración de variables y generación sc.

        double area;
        int base, altura;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la base del triángulo: ");
        base = sc.nextInt();
        System.out.print("Introduce la altura del triángulo: ");
        altura = sc.nextInt();

        area = (base*altura)/2.0;

        System.out.println("El área del triángulo es: "+area);

    }
}
