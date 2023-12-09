import java.util.Scanner;

public class ejercicio4 {

    public static void ma

        Scanner scanner = new Scanner(Syst   em.in);
   
        System.out.println(
                "Este es un programa que mostrará los resultados de 15 ejercicios que se han resuelto cómo métodos independientes.");

        int opcion;

        System.out.print("Introduce la opción que desees (1 a 15) y descubre las funcionalidades aquí diseñadas: ");
        opcion = scanner.nextInt();

        if (opcion == 1) {
            mayorOmenor();
        } else if (o     p cio n   = =   2) {
            positivoOnegativo();
        } else if (opcion == 3) {      
            parOimpar();
        } else if (opcion == 4) {
            diasMeses();
        } else if (opcion == 5) {
            bisiesto();
        } else if (opcion == 6) {
            calculadora();
        } else if (opcion == 7) {
            clasificador();
        } else if (opcion == 8) {
            weekDay();
        } else {
            System.out.println("Programa en construcción. Elige del 1 al 15.");
        }

        System.out.println("Fin de la ejecución principal");
    }

    public static void mayorOmenor() {
        int num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("La primera funcionalidad permite decir el mayor de dos números.");
        System.out.print("Introduce el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número : ");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("El primer número es mayor que el segundo número.");
        } else if (num1 == num2) {
            System.out.println("Ambos números son iguales");
        } else {
            System.out.println("El segundo número es mayor que el primero.");
        }
        System.out.println("----------------------------------------------------------------------");
    }

    public static void positivoOnegativo() {
        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("La segunda funcionalidad permite decir si un número es positivo o negativo");
        System.out.print("Introduce el número: ");
        num = scanner.nextInt();

        if (num > 0) {
            System.out.println("El número es positivo");
        } else if (num == 0) {
            System.out.println("El número es 0 y por lo tanto el valor es nulo.");
        } else {
            System.out.println("El número es negativo.");
        }
        System.out.println("----------------------------------------------------------------------");
    }

    public static void parOimpar() {
        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("La segunda tercera permite decir si un número es par o impar.");
        System.out.print("Introduce el número: ");
        num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar.");
        }
        System.out.println("----------------------------------------------------------------------");
    }

    public static void diasMeses() {
        String month;

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("La cuarta funcionalidad permite ver el número de días que tiene un mes.");
        System.out.print("Introduce el mes: ");
        month = scanner.nextLine();

        if (month.equals("Enero") || month.equals("Marzo") || month.equals("Mayo") || month.equals("Julio")
                || month.equals("Agosto") || month.equals("Octubre") || month.equals("Diciembre")) {
            System.out.println("El mes introducido, " + month + " tiene 31 días.");
        } else if (month.equals("Febrero")) {
            System.out.println("Febrero es pecualiar puede terner 28 o 29 días en función de si es año bisiesto o no.");
        } else {
            System.out.println("El mes introducido, " + month + " tiene 30 días.");
        }
        System.out.println("----------------------------------------------------------------------");
    }

    public static void bisiesto() {
        int year;

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("La quinta funcionalidad te permite saber si un año en concreto será bisiesto o no.");
        System.out.print("Introduce el año: ");
        year = scanner.nextInt();

        if (year % 4 == 0) {
            System.out.println("El año será bisiesto.");
        } else {
            System.out.println("El año no será bisiesto.");
        }
        System.out.println("----------------------------------------------------------------------");
    }

    public static void calculadora() {
        int num1, num2;
        double result;
        String symbol;

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("La sexta funcionalidad es una calculadora sencilla. "
                + "Por medio de un +, -, * o / introducidos por teclado tras los números podremos ejecutar una suma, resta, multiplicación o división.");
        System.out.println("Primero introduce los números");
        System.out.print("Introduce el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número : ");
        num2 = scanner.nextInt();

        // Consumir la nueva línea pendiente
        scanner.nextLine();

        System.out.println(
                "Ahora introduce el símbolo de la operación que deseas realizar. +: suma, -: resta, *: multiplicación y / división: ");
        symbol = scanner.nextLine();

        if (symbol.equals("+")) {
            result = num1 + num2;
            System.out.println("El resultado de la operación es: " + result);
        } else if (symbol.equals("-")) {
            result = num1 - num2;
            System.out.println("El resultado de la operación es: " + result);
        } else if (symbol.equals("*")) {
            result = num1 * num2;
            System.out.println("El resultado de la operación es: " + result);
        } else if (symbol.equals("/")) {
            result = (double) num1 / num2;
            System.out.println("El resultado de la operación es: " + result);
        } else {
            System.out.println("Operación no reconocida.");
        }

        System.out.println("----------------------------------------------------------------------");
    }

    public static void clasificador() {
        int edad;

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("La séptima opción es un clasificador por edad.");
        System.out.print("Introduce tu edad: ");
        edad = scanner.nextInt();

        if (edad <= 12) {
            System.out.println("Eres un niño/niña.");
        } else if (edad > 12 && edad <= 19) {
            System.out.println("Eres un adolescente o teenager.");
        } else if (edad >= 20 && edad <= 65) {
            System.out.println("Eres una persona adulta.");
        } else {
            System.out.println("Eres un adulto mayor.");
        }
        System.out.println("----------------------------------------------------------------------");
    }

}