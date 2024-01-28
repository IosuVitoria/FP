import java.util.Arrays;

public class ejercicio3 {
    
    public static void main(String[] args) {
        int[] numeros = {2, 15, 26, 31, 47};
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] + numeros[i] / numeros[0];
        } 

        System.out.println(Arrays.toString(numeros));
    }
}