// Escribe el código para el método intercambiar. Recibirá como parámetros 2 arrays. Si los arrays tienen el mismo número de elementos y no están vacíos, intercambiará todos sus valores y devolverá true. En caso contrario devolverá false.

// Por ejemplo:

// int[] a1 = {1, 2, 3, 4};
// int[] a2 = {10, 20, 30, 40};
// System.out.println(intercambiar(a1, a2));

// Devolverá true y los valores de los arrays serán:
// int[] a1 = {10, 20, 30, 40};
// int[] a2 = {1, 2, 3, 4}; 

// int[] a1 = {1, 2, 3, 4};
// int[] a2 = {10, 20};
// System.out.println(intercambiar(a1, a2));

// Devolverá false y no hará el intercambio

import java.util.Arrays;

public class ejercicio12 {

    public static void main(String[] args) {
        int[] a1 = { 10, 20, 30, 40 };
        int[] a2 = { 1, 2, 3, 4 };

        System.out.println(intercambio(a1, a2));

        int[] a3 = { 1, 2, 3, 4 };
        int[] a4 = { 10, 20 };

        System.out.println(intercambio(a3, a4));
    }

    public static boolean intercambio(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length || arr1.length == 0 || arr2.length == 0) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }

        System.out.println("Esta es la impresión del primer Array: " + Arrays.toString(arr1));
        System.out.println("Esta es la impresión del segundo Array: " + Arrays.toString(arr2));

        return true;
    }
}
