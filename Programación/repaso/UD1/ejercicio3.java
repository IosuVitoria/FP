package UD1;

public class ejercicio3 {

    public static void main(String[] args) {

        triangulo();

        cuadrado();
    }

    public static void triangulo() {
        int altura = 5;

        // Bucle para iterar a través de las filas del triángulo
        for (int i = 1; i <= altura; i++) {
            // Bucle para imprimir los espacios en blanco en cada fila
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            // Bucle para imprimir los asteriscos en cada fila
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Cambio de línea después de imprimir cada fila
            System.out.println();
        }
    }

    public static void cuadrado() {
        int lado = 8;
        for (int i = 1; i <= lado; i++) {
            if (i == 1 || i == lado) {
                for (int j = 1; j <= lado; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.print("*");
                for (int j = 1; j <= lado - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
