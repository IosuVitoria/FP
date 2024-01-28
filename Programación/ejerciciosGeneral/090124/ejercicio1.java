// Crear un programa que pida la base y la altura de un triángulo y muestre su área./**
//  * ejercicio1
//  */

import java.util.Scanner;
     
     
public class ejercicio1 {

    public static void main(String[] args){

        double base, altura, area;


        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la base del triángulo: ");
        base = sc.nextDouble();        
        System.out.print("Introduce la altura del triángulo: ");
        altura = sc.nextDouble();

        area = base*altura;

        System.out.print("El área del triángulo es: "+area);
        
    }

}   

              



