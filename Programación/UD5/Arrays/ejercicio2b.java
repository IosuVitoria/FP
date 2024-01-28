// Escribe el código para el método sumaMayor. Recibirá como parámetro un array y comprobará que sus elementos son mayores que la suma de los anteriores. Devolverá true si se cumple y false en caso contrario:

// int[] array = {4, 2, 7, 12, 25};
// sumaMayor(array);

// Devolverá true (7 > 4 + 2; 12 > 7 + 2; 25 > 12 + 7)

// int[] array = {4, 3, 7, 25, 7};
// sumaMayor(array);

// Devolverá false (7 = 4 + 3, no mayor)

public class ejercicio2b {

    public static void main(String[] args) {
        int[] array1 = { 4, 2, 7, 12, 25 };
        System.out.println(sumaMayor(array1));

        int[] array2 = { 4, 3, 7, 25, 7 };
        System.out.println(sumaMayor(array2));
    }

    public static boolean sumaMayor(int[] array) {
        if (array.length < 3) {
            // Si el array tiene menos de 3 elementos, no se pueden comparar sumas
            return false;
        }

        for (int i = 2; i < array.length; i++) {
            if (array[i] <= array[i - 1] + array[i - 2]) {
                // Si algún elemento no es mayor que la suma de los anteriores, devolver false
                return false;
            }
        }

        // Si todos los elementos cumplen la condición, devolver true
        return true;
    }
}
