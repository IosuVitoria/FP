// ################################################################################
// Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
// ################################################################################
// Análisis
// Tenemos que leer la longitud de los dos catetos y calcular la hipotenusa.
// (Teorema de Pitágoras)
// Variables de entrada: cato1(real), cat  eto2(real)
// Variables de salida: hipotenusa(real)
// ################################################################################
// Diseño
// 1. Leer la longitud de los catet  os
// 2. Calcular hipotenusa (En un triángulo rectángulo el cuadrado de la hipotenusa
// es igual a la suma de los cuadrados de los catetos. )
// Por lo tanto la hipotenusa es igual a la raí­z cuadrada de la suma de los
// cuadrados de los cate  tos.
// 3. Mostrar la hipotenusa  
// ################################################################################

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double cateto1, cateto2, hipotenusa;

        System.out.println("Introduce el valor del primer cateto: ");
        cateto1 = sc.nextDouble();
        System.out.println("Introduce el valor del segundo cateto: ");
        cateto2 = sc.nextDouble();

        hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

        System.out.println("El valor de la hipotenusa es: " + hipotenusa);

        perimetro(cateto1, cateto2, hipotenusa);
    }

    public static void perimetro(double cateto1, double cateto2, double hipotenusa) {
        double perimetro;

        perimetro = cateto1 + cateto2 + hipotenusa;

        System.out.println("El perímetro del triángulo es: " + perimetro);
    }
}
