// Crea un programa que calcula la temperatura media de una serie de días
// introducidos por la persona usuaria.
// Además, indica cuántos día superan la temperatura media.



import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de días que quieres analizar: ");
        int numDias = sc.nextInt();
        double[] diasCalor = new double[numDias]; // Crear el array de temperaturas

        double temperatura = 0;
        double tempDia;

        for (int i = 0; i < numDias; i++) {
            System.out.print("Introduce la temperatura del " + (i + 1) + " día: ");
            tempDia = sc.nextDouble();
            diasCalor[i] = tempDia; // Agregar la temperatura al array
            temperatura += tempDia;
        }

        double tempMedia = temperatura / numDias;

        System.out.println("La temperatura media de los " + numDias + " días introducidos fue de " + tempMedia);

        System.out.println("Días que superaron la temperatura media:");

        for (int i = 0; i < numDias; i++) {
            if (diasCalor[i] > tempMedia) {
                System.out.println("El día número " + (i + 1) + " superó la temperatura media.");
            }
        }
    }
}
