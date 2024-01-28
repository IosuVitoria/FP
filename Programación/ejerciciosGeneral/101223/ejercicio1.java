import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Introduce el primer número a comparar: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo número a comparar: ");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que el número " + num2 + ".");
        } else if (num1 == num2) {
            System.out.println("Los dos números valen los mismo.");
        } else {
            System.out.println("El número " + num2 + " es mayor que el número " + num1 + ".");
        }
    }
}
