// ################################################################################
// Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas,
// el vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por
// las tres ventas que realiza en el mes y el total que recibirá en el mes tomando
// en cuenta su sueldo base y comisiones.
// ################################################################################
// Análisis
// El vendedor tiene un sueldo base mas una comisión del 10% por cada venta.
// Hace tres ventas.
// Datos de entrada: sueldo base, las tres ventas (real).
// Información de salida: comisiones y sueldo total (real).
// Variables: sueldo_base, venta1, venta2, venta3, comision(real).
// ################################################################################
// Diseño
// 1. Leer sueldo base
// 2. Leer las tres ventas
// 3. Calcular las comisiones. Suma50enteros del 10 % de cada venta.
// 4. Mostrar comisión
// 5. Mostrar sueldo total: sueldo_base+comisión
// ################################################################################

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double venta1, venta2, venta3, sueldobase, comisiones;

        System.out.print("Introduce el sueldo base de este mes: ");
        sueldobase = sc.nextDouble();
        System.out.print("Introduce el importe de la primera venta de este mes: ");
        venta1 = sc.nextDouble();
        System.out.print("Introduce el importe de la segunda venta de este mes: ");
        venta2 = sc.nextDouble();
        System.out.print("Introduce el importe de la tercera venta de este mes: ");
        venta3 = sc.nextDouble();

        comisiones = (venta1 * 0.1) + (venta2 * 0.1) + (venta3 * 0.1);

        System.out.println("El sueldo base es de " + sueldobase + "euros. Y las comisiones son un total de: " + comisiones + "euros.");

    }
}
