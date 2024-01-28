import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year;

        System.out.print("Introduce el año del que quieras saber si es bisiesto o no: ");
        year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }

    }
}
