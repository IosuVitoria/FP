// Escribe un programa que declare un array de enteros, pase ese array a un método y 
// modifique algunos elementos dentro del método. Luego, imprime el array original y 
// observa si los cambios realizados en el método afectan al array original.

//Para este ejemplo he elegido sumar los números del array pero en orden invertido.

import java.util.Arrays;

public class ejercicio8 {

    public static void main(String[] args) {

        int[] ejemplo = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println("Este es el array sin modificar: " + Arrays.toString(ejemplo));

        modificarArray(ejemplo);

        System.out.println("Este es el array modificado: " + Arrays.toString(ejemplo));

    }

     public static void modificarArray(int[] arr) {
        int[] tempArray = new int[arr.length];

        //Primero voltear el array.
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[arr.length - 1 - i];
        }

        //Sumar los valores.

        for (int i = 0; i < arr.length; i++) {
            arr[i] += tempArray[i];
        }
    }
}
