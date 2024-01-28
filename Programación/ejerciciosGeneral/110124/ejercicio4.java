// Ejercicio 4: Tabla de Multiplicar
// Escribe un programa que solicite al usuario ingresar un número y luego imprima la tabla de multiplicar
//  de ese número del 1 al 10 utilizando un bucle for.

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        int numero, resultado;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número del que quieres la tabla de multiplicar: ");

        numero = sc.nextInt();

        
        for(int i = 0; i <= 10; i++){
            resultado = i * numero;
            System.out.println(numero+" x "+i+" = "+resultado);
        }
    }
}
