//Modificar el ejercicio anterior para que indicando dos números n y m, nos diga qué cantidad hay que sumarle a n para que sea múltiplo de m.

import java.util.Scanner;

public class ejercicio3 {

    public static void main (String[] args){
        //Declaración de variables.
        int entrada, numeroSuma, objetivo;

        //Puesta en marcha del escáner

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número al que hay que sumarle para que sea mútiplo de otro: ");
        entrada = sc.nextInt();
        System.out.print("Introduce el número con el que queremos hacer la comparación: ");
        objetivo = sc.nextInt();
        System.out.println("Recuerda: queremos saber cuanto hay que sumarle al primero para que sea múltiplo de este segundo número.");
    

        //Cálculo del número en cuestion

        for(int i = 0; i < 100; i++){
            numeroSuma = entrada + i;
            if(numeroSuma%objetivo==0){
                System.out.println("Al número "+entrada+" hay que sumarle el número "+i+" para obtener un múltiplo de " + objetivo+ ".");
                break;
            }
        }
    }
}
