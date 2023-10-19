// Escribir un programa que tome como entrada un número entero y nos indique qué cantidad hay que sumarle para que el resultado sea múltiplo de 7.

import java.util.Scanner;

public class ejercicio2 {

    public static void main (String[] args){
        //Declaración de variables.
        int entrada, numeroSuma;

        //Puesta en marcha del escáner

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número con el que quieras trabajar: ");
        entrada = sc.nextInt();

        //Cálculo del número en cuestion

        for(int i = 0; i < 100; i++){
            numeroSuma = entrada + i;
            if(numeroSuma%7==0){
                System.out.println("Al número "+entrada+" hay que sumarle el número "+i+" para obtener un múltiplo de 7.");
                break;
            }
        }
    }
}
