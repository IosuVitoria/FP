import java.util.Arrays;

public class ejercicio11 {
    public static void main(String[] args) {
        int x = 0;
        int[] a = new int[4];

        x = x + 1;
        metodo(x, a);
        System.out.println(x + " " + Arrays.toString(a));

        x = x + 2;
        metodo(x, a);
        System.out.println(x + " " + Arrays.toString(a));
    }

    public static void metodo(int x, int[] a) {
        x = x - 1;
        a[x]++;
        System.out.println(x + " " + Arrays.toString(a));
    }
}

// Escribe lo que diría la consola.
