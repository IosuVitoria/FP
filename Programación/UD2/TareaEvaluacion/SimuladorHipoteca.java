// import java.text.DecimalFormat;
// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class SimuladorHipoteca {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         DecimalFormat decimalFormat = new DecimalFormat("0.00");

//         System.out.println("Este es un simulador de hipoteca");

//         // PRIMERO: Simulación de diferentes opciones de interés y plazo. Condiciones de 20 a 25 años y un interés inicial al 3% con incrementos del 0.5%.
//         System.out.println("\nPRIMERO");
//         System.out.println("Solicita el monto del préstamo (euros) e imprime una tabla con diferentes opciones según el interés y plazo");
//         double prestamo = obtenerEntradaDouble(scanner);

//         double interes = 3.0; // Tasa de interés inicial.
//         int plazoMin = 20; // Variable inicial de año.
//         int plazoMax = 25; // Variable final de año;
//         double incrementoInteres = 0.5;

//         System.out.println("\nEstas son las cuotas a pagar para diferentes intereses y plazos");

//         for (int plazo = plazoMin; plazo <= plazoMax; plazo++) {
//             System.out.print(plazo + " Años\t");
//             while (interes <= 5.0) {
//                 double cuotaAnual = calcularCuotaAnual(prestamo, interes, plazo);
//                 System.out.print(decimalFormat.format(cuotaAnual) + "(" + decimalFormat.format(interes) + "%)\t");
//                 interes += incrementoInteres;
//             }
//             System.out.println();
//             interes = 3.0;
//         }

//         // SEGUNDO: Cálculos detallados del préstamo. SIMULACIÓN DE DATOS COMO EN UNA FEIN BANCARIA USANDO FÓRMULA APUNTES.
//         System.out.println("\nSEGUNDO");
//         System.out.println("Solicita el monto del préstamo (euros), la tasa de interés anual a pagar (%) y el plazo (años)");
//         double montoPrestamo = obtenerEntradaDouble(scanner);
//         double tasaInteresAnual = obtenerEntradaDouble(scanner);
//         int plazoPrestamo = obtenerEntradaInt(scanner);

//         System.out.println("Introduce el interés anual que se aplicará al préstamo en %:");
//         double interesAnual = tasaInteresAnual;
//         System.out.println("Introduce el número de años que va a durar el préstamo:");

//         System.out.println("Año:\tCapital Pendiente:\tCuota Anual:\tIntereses a pagar:\tAmortización:");
//         for (int año = 1; año <= plazoPrestamo; año++) {
//             double cuotaAnual = calcularCuotaAnual(montoPrestamo, interesAnual, plazoPrestamo);
//             double interesesAnuales = calcularInteresesAnuales(montoPrestamo, interesAnual);
//             double amortizacionAnual = cuotaAnual - interesesAnuales;
//             System.out.println("Año: " + año + "\tCapital Pendiente: " + decimalFormat.format(montoPrestamo) + "\tCuota Anual: " + decimalFormat.format(cuotaAnual) + "\tIntereses a pagar: " + decimalFormat.format(interesesAnuales) + "\tAmortización: " + decimalFormat.format(amortizacionAnual));
//             montoPrestamo -= amortizacionAnual;
//         }
//     }

//     // Función para obtener un valor double desde la entrada del usuario, manejando errores.
//     private static double obtenerEntradaDouble(Scanner scanner) {
//         while (true) {
//             try {
//                 return scanner.nextDouble();
//             } catch (InputMismatchException e) {
//                 System.out.println("Error: Introduce un valor válido.");
//                 scanner.next(); // Limpiar el búfer de entrada.
//             }
//         }
//     }

//     // Función para obtener un valor int desde la entrada del usuario, manejando errores.
//     private static int obtenerEntradaInt(Scanner scanner) {
//         while (true) {
//             try {
//                 return scanner.nextInt();
//             } catch (InputMismatchException e) {
//                 System.out.println("Error: Introduce un valor válido.");
//                 scanner.next(); // Limpiar el búfer de entrada.
//             }
//         }
//     }


//     public static double calcularCuotaAnual(double prestamo, double interes, int duracion) {
//         double i = interes / 100;
//         return (prestamo * i) / (1 - Math.pow(1 + i, -duracion));
//     }

//     public static double calcularInteresesAnuales(double prestamo, double interes) {
//         return prestamo * (interes / 100);
//     }
// }

import java.text.DecimalFormat;
import java.util.Scanner;

public class SimuladorHipoteca {
    //Bloque inicial de declaración e inicialización de variables.
    private static final double INITIAL_INTEREST_RATE = 3.0;
    private static final int MIN_YEARS = 20;
    private static final int MAX_YEARS = 25;
    private static final double INTEREST_INCREMENT = 0.5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Este es un simulador de hipoteca\n");

        //Se plantea el funcionamiento de la aplicación. ¿Qué vamos a conseguir con ella)
        System.out.println("PRIMERO");
        System.out.println("Solicita el monto del préstamo (euros) e imprime una tabla con diferentes opciones según el interés y plazo");
        System.out.println("SEGUNDO");
        System.out.println("Solicita el monto del préstamo (euros), la tasa de interés anual a pagar (%) y el plazo (años)");
        System.out.println("Calcula para cada año, el capital pendiente y la cuota a pagar, intereses y amortización");
        

         // PRIMERO: Simulación de diferentes opciones de interés y plazo. Versión final que pone los años en la primera columna y los tipos de interés en la parte superior.
        System.out.println(" ");
        System.out.print("Introduce la cantidad solicitada para el préstamo: ");
        double prestamo = obtenerEntradaDouble(scanner);
        System.out.println(" ");
      

        System.out.print("Año:\t");
        for (double interes = INITIAL_INTEREST_RATE; interes <= 5.0; interes += INTEREST_INCREMENT) {
            System.out.print(decimalFormat.format(interes) + "%\t\t");
        }
        System.out.println();

        for (int plazo = MIN_YEARS; plazo <= MAX_YEARS; plazo++) {
            System.out.print(plazo + " Años\t");
            for (double interes = INITIAL_INTEREST_RATE; interes <= 5.0; interes += INTEREST_INCREMENT) {
                double cuotaAnual = calcularCuotaAnual(prestamo, interes, plazo);
                System.out.print(decimalFormat.format(cuotaAnual) + "\t\t");
            }
            System.out.println();
        }

        // SEGUNDO: Cálculos detallados del préstamo. Similar a una FEIN bancaria. Usar en fórmula accesoria la fórmula de cálculo de los apuntes.
        System.out.println(" ");
        System.out.print("Introduce el interés anual que se aplicará al préstamo en %: ");
        double tasaInteresAnual = obtenerEntradaDouble(scanner);
        System.out.print("Introduce el número de años que va a durar el préstamo: ");
        int duracionPrestamo = obtenerEntradaInt(scanner);
        double montoPrestamo = prestamo;
        System.out.println(" ");
       

        System.out.println();

        for (int año = 1; año <= duracionPrestamo; año++) {
            System.out.println("Año: " + año);
            System.out.println("\tCapital Pendiente: " + decimalFormat.format(montoPrestamo));
            double cuotaAnual = calcularCuotaAnual(montoPrestamo, tasaInteresAnual, duracionPrestamo);
            System.out.println("\tCuota Anual: " + decimalFormat.format(cuotaAnual));
            double interesesAnuales = calcularInteresesAnuales(montoPrestamo, tasaInteresAnual);
            System.out.println("\tIntereses a pagar: " + decimalFormat.format(interesesAnuales));
            double amortizacionAnual = cuotaAnual - interesesAnuales;
            System.out.println("\tAmortización: " + decimalFormat.format(amortizacionAnual));
            montoPrestamo -= amortizacionAnual;
        }
    }

    // Función para obtener un valor double desde la entrada del usuario.
    private static double obtenerEntradaDouble(Scanner scanner) {
        return scanner.nextDouble();
    }

    // Función para obtener un valor int desde la entrada del usuario.
    private static int obtenerEntradaInt(Scanner scanner) {
        return scanner.nextInt();
    }

    // Funciones de cálculo para la ejecución del programa.
    public static double calcularCuotaAnual(double prestamo, double interes, int duracion) {
        double i = interes / 100;
        return (prestamo * i) / (1 - Math.pow(1 + i, -duracion));
    }

    public static double calcularInteresesAnuales(double prestamo, double interes) {
        return prestamo * (interes / 100);
    }
}

