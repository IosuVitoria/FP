import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double lado1, lado2, lado3;

        System.out.print("Introduce la longitud del primer lado: ");
        lado1 = sc.nextDouble();
        System.out.print("Introduce la longitud del segundo lado: ");
        lado2 = sc.nextDouble();
        System.out.print("Introduce la longitud del tercer lado: ");
        lado3 = sc.nextDouble();

        if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
            System.out.println("El triángulo es equilátero");
        } else if (lado1 == lado2 && lado3 != lado1) {
            System.out.println("El triángulo es isósceles.");
        } else if (lado2 == lado1 && lado3 != lado2) {
            System.out.println("El triángulo es isósceles.");
        } else if (lado3 == lado1 && lado3 != lado2) {
            System.out.println("El triángulo es isósceles.");
        } else if (lado3 == lado2 && lado3 != lado1) {
            System.out.println("El triángulo es isósceles.");
        } else {
            System.out.println("El triángulo es escaleno.");
        }
    }
}
