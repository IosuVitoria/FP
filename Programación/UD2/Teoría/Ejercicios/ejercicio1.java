// Un economista nos ha encargado un programa para realizar cálculos con el IVA. La aplicación debe solicitar la base imponible y el IVA. Debemos mostrar en pantalla el importe 
// correspondiente al iba y al total.

import java.util.Scanner;

public class ejercicio1 {
    
    public static void main(String[] args){
        //Inicializar las variables. Base imponible. Tipo de IVA. Importe IVA y Importe final del producto.
        double base, importeIva, importeFinal, iva;


        //Declarar el escáner y pedir los datos.

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base imponible: ");
        base = sc.nextDouble();
        System.out.print("Introduce el IVA a aplicar: ");
        iva = (sc.nextDouble())/100;
        System.out.println("");


        importeIva = base * iva;
        importeFinal = base + importeIva;

        //Mostrando la información final.
        System.out.println("La base imponible del artículo es: "+base+ ". Y el % de IVA aplicado es: " + (iva*100)+"%.");
        System.out.print("El importe debido al IVA asciende a: " + importeIva + " y el total del producto es: "+importeFinal);
    }
}
