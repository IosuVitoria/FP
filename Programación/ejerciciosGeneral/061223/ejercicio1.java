
// ################################################################################
// Dados dos números, mostrar la suma, resta, división y multiplicación de ambos.
// ################################################################################
// Análisis
// Tenemos que leer dos números, calcular    la suma, resta, multiplicación y división
// Datos d   e entrada: Los dos números (real)
// Información de salida: suma, resta, multiplicación, división(real)
// Variables: num1, n
        // ################################################################################
// Diseño
// 1. Leer los números
// 2. Mostrar suma,resta, multiplicación y división
// ################################################################################
  
import java.util.Scanner;    

public class ejercicio1{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String signo;

        double num1, num2, total;

        System.out.print("Introduce el signo que se debe poner: ");
        signo = sc.nextLine();

        if(signo.equals("+")){
            System.out.print("Introduce el primer número: ");
            num1 = sc.nextInt();
            System.out.print("Introduce el segundo número: ");
            num2 = sc.nextInt();
            total = num1 + num2;
        }
        else if(signo.equals("-")){
            System.out.print("Introduce el primer número: ");
            num1 = sc.nextInt();
            System.out.print("Introduce el segundo número: ");
            num2 = sc.nextInt();
            total = num1 - num2;
        }
        else if(signo.equals("*")){
            System.out.print("Introduce el primer número: ");
            num1 = sc.nextInt();
            System.out.print("Introduce el segundo número: ");
            num2 = sc.nextInt();
            total = num1 * num2;
        }else{
            System.out.print("Introduce el primer número: ");
            num1 = sc.nextInt();
            System.out.print("Introduce el segundo número: ");
            num2 = sc.nextInt();
            total = num1 / num2;
        }

        System.out.println("El resultado de la operación ha sido: "+total);

        sc.close();
    }

}



