import java.util.Arrays;

public class metodo3 {

    public static void main(String[] args) {
        String secuencia = "AAAATTAATATATATACCCGGXXXAAA";
        String[] codones = dividirEnCodones(secuencia);
        System.out.println("Lista de codones: " + Arrays.toString(codones));
    }

    public static String[] dividirEnCodones(String secuencia) {
        int longitudCodon = 3;
        int longitudSecuencia = secuencia.length();

        // Calculamos la cantidad de codones
        int cantidadCodones = longitudSecuencia / longitudCodon;

        // Creamos un array para almacenar los codones
        String[] codones = new String[cantidadCodones];

        // Dividimos la secuencia en codones de 3 en 3
        for (int i = 0; i < cantidadCodones; i++) {
            int inicio = i * longitudCodon;
            int fin = inicio + longitudCodon;
            codones[i] = secuencia.substring(inicio, fin);
        }

        return codones;
    }
}