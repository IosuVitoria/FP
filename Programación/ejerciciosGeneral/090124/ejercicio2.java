import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args){
        // Operadores aritméticos en java. 
 
        double num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        num1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextDouble();

        double resultado;

        // operador +  
        resultado = num1 + num2;
        System.out.println("El resultado de usar el operador '+' es :"+resultado);
        // operador -
        resultado = num1 - num2;
        System.out.println("El resultado de usar el operador '-' es :"+resultado);
        // operador *
        resultado = num1 * num2;
        System.out.println("El resultado de usar el operador '*' es :"+resultado);
        // operador /
        resultado = num1 / num2;
        System.out.println("El resultado de usar el operador '/' es :"+resultado);
        // operador %
        resultado = num1 % num2;
        System.out.println("El resultado de usar el operador '%' es :"+resultado);

    }
}
