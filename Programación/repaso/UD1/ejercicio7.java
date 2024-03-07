import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c, x, y;

        System.out.println("Programa para solucionar una ecuación de segundo grado: y = ax^2 + bx + c");

        System.out.print("Introduce el valor de a: ");
        a = sc.nextDouble();
        System.out.print("Introduce el valor de b: ");
        b = sc.nextDouble();
        System.out.print("Introduce el valor de c: ");
        c = sc.nextDouble();
        System.out.print("Introduce el valor de x: ");
        x = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Error: 'a' y 'b' no pueden ser ambos cero.");
            } else {
                y = (b * x) + c;
                System.out.println("El valor de y es: " + y);
            }
        } else {
            y = (a * (x * x)) + (b * x) + c;
            System.out.println("El valor de y es: " + y);
        }

    }
}
