import java.util.Arrays;

public class ejercicio10 {
    public static void main(String[] args) {
        int x = 1;
        int[] a = new int[2];

        metodo(x, a);
        System.out.println(x + " " + Arrays.toString(a));

        x--;
        a[1] = a.length;
        metodo(x, a);
        System.out.println(x + " " + Arrays.toString(a));
    }

    public static void metodo(int x, int[] lista) {
        lista[x]++;
        x++;
        System.out.println(x + " " + Arrays.toString(lista));
    }
}
// Escribe lo que mostraría en consola.