// Crea un programa que calcule la suma de todos los elementos de un array de enteros.

import java.util.*;

public class ejercicio2 {
 
    public  static void main(String[] args) {
        
        int[] numeros = {1,2,3,4,5,6,7,8,9};
            System.out.println(Arrays.toString(numeros));
        int suma = 0;

        for(int i =0; i<numeros.length; i++){

            suma+=numeros[i];
        }

        System.out.println("El resultado de la suma de los elementos de mi array ha sido: "+suma);
    }  
}
