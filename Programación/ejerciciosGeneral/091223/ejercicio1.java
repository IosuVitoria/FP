// ################################################################################
// Diseñar un algoritmo que nos diga el dinero que tenemos (en euros y céntimos)
// después de pedirnos cuantas monedas tenemos de 2e, 1e, 50 céntimos, 20 céntimos
// o 10 céntimos).
// ################################################################################
// Análisis 
// Se pide n la cantidad de monedas que tenemos (de 2e, 1e, 50 céntimos,
// 20 céntimos o 10 céntimos) y calculamos el dinero que tenemos (euros y céntimos)
// Datos de entrada: monedas de 2e, 1e, 50 céntimos, 20 céntimos o 10 céntimos) (entero).
// Información de salida: total de dinero: euros y céntimos (enteros)
// Variables: euro2,euro1,cent50,cent20,cent10, total_euros, total_centimos (entero)
// ################################################################################
// Diseño
// 1. Leer el monedas de 2e, 1e, 50 céntimos, 20 céntimos o 10 céntimos.
// 2. Calcular Euros (sumar monedas de 2 euros * 2 + monedas de 1 euro
// 3. Calcular céntimos
// monedas de 50c * 50 + moneda s  de 30c * 30 + moneda de 20c * 20 + moneda de 10c * 10
// 4. Convertir céntimos a euros (división entera entre 100)
// 5. Mostrar euros y céntimos totales
// ################################################################################

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mon2, mon1;
        double mon0_5, mon0_2, mon0_1, total;

        System.out.print("Introduce las monedas de dos euros que tienes: ");
        mon2 = sc.nextInt();
        System.out.print("Introduce las monedas de un euro que tienes: ");
        mon1 = sc.nextInt();
        System.out.print("Introduce las monedas de medio euro que tienes: ");
        mon0_5 = sc.nextDouble();
        System.out.print("Introduce las monedas de veinte céntimos que tienes: ");
        mon0_2 = sc.nextDouble();
        System.out.print("Introduce las monedas de diez céntimos que tienes: ");
        mon0_1 = sc.nextDouble();

        total = (mon2 * 2) + (mon1) + (mon0_5 * 0.5) + (mon0_2 * 0.2) + (mon0_1 * 0.1);

        System.out.println("Has ahorrado un total de: " + total + " euros.");

    }
}
