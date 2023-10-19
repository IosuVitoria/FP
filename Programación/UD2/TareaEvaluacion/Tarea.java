import java.util.Scanner;

public class Tarea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        introduccion();

        double montoPrestamo = pedirMontoPrestamo(scanner);
        calcularCuotas(montoPrestamo);

        double tasaInteres = pedirTasaInteres(scanner);
        int duracionPrestamo = pedirDuracionPrestamo(scanner);
        calcularAmortizacion(montoPrestamo, tasaInteres, duracionPrestamo);

        scanner.close();
    }

    public static void introduccion() {
        System.out.println("Bienvenido al Simulador de Hipoteca a Plazo Fijo");
        System.out.println("Este programa calculará cuotas y amortización para su préstamo hipotecario.");
        System.out.println("Primero, proporcionaremos cuotas para diferentes tasas de interés y plazos.");
        System.out.println("Luego, calcularemos la amortización para un préstamo específico.");
    }

    public static double pedirMontoPrestamo(Scanner scanner) {
        System.out.print("Por favor, introduzca el monto del préstamo: ");
        return scanner.nextDouble();
    }

    public static void calcularCuotas(double montoPrestamo) {
        System.out.println("\nCuotas para diferentes tasas de interés y plazos:\n");
        System.out.println("Tasa de Interés\tPlazo (años)\tCuota Anual");
        
        for (double interes = 3.0; interes <= 5.0; interes += 0.5) {
            for (int plazo = 20; plazo <= 25; plazo++) {
                double cuotaAnual = calcularCuotaAnual(montoPrestamo, interes, plazo);
                System.out.printf("%.2f%%\t\t%d\t\t%.2f\n", interes, plazo, cuotaAnual);
            }
        }
    }

    public static double calcularCuotaAnual(double monto, double interes, int duracion) {
        double i = interes / 100;
        return (monto * i) / (1 - Math.pow(1 + i, -duracion));
    }

    public static double pedirTasaInteres(Scanner scanner) {
        System.out.print("\nPor favor, introduzca la tasa de interés (%): ");
        return scanner.nextDouble();
    }

    public static int pedirDuracionPrestamo(Scanner scanner) {
        System.out.print("Por favor, introduzca la duración del préstamo (años): ");
        return scanner.nextInt();
    }

    public static void calcularAmortizacion(double monto, double interes, int duracion) {
        System.out.println("\nAmortización del préstamo:\n");
        System.out.println("Año\tCapital Pendiente\tCuota Anual\tIntereses\tCapital Amortizado");

        double capitalPendiente = monto;
        double cuotaAnual = calcularCuotaAnual(monto, interes, duracion);
        for (int año = 1; año <= duracion; año++) {
            double intereses = capitalPendiente * (interes / 100);
            double amortizacion = cuotaAnual - intereses;
            capitalPendiente -= amortizacion;
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n", año, capitalPendiente, cuotaAnual, intereses, amortizacion);
        }
    }
}
