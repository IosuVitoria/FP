import java.util.Scanner;

public class ejercicio4 {

    public static void ma

        double peso, altura, imc; 
 
        Scanner sc = new Scanner(System.in);

        System.out.println("PROGRAMA DE CÁLCULO DE IMC");

        System.out.print("Introduce tu peso para cálculo de IMC: ");
        peso = sc.nextDouble();
        System.out.print("Introduce tu altura en m (ejemplo: 1,81 para 181 cm) para cálculo de IMC: ");
        altura = sc.nextDouble();

        // Calculate IMC
        imc = peso /   (altura   * altura);

        if (imc < 18.5) {  
            System.out.println("Andas bajo de peso. COME MÁS.");
        } else if (18.5 <= imc && imc < 25) {
            System.out.println("Peso normal, ¡sigue así!");
        } else if (25 <= imc && imc < 30) {
            System.out.println("Tienes sobrepeso, ¡vigila esa boca!");
        } else {
            System.out.println("Ojo, hay obesidad, consulta a un médico para establecer un programa de dieta adecuado.");
        }
    }
}
