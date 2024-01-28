// Escribe un programa en Java que solicite al usuario ingresar un número. 
// Luego, utiliza un bucle for para imprimir todos los números pares desde 1 hasta el número ingresado, 
// y otro bucle para imprimir todos los números impares en el mismo rango.

import java.util.Scanner;
    
    
public class ejercicio1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Introduce el número hasta el cual quieres imprimir los pares: ");
        numero = sc.nextInt();

        for(int i = 1; i<=numero; i++){
            if(i%2 == 0){
                System.out.println("El número "+i+" es par");
            }
        }

    }
}
