import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        int num1, num2;     

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce   el valor del primer número a comparar: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el valor del segundo número a comparar: ");
        num2 = sc.nextInt();
              
        // Operador de igualdad ==     
        System.out.println("Igualdad: "+(num1 == num2));
        // Operador de desiugaldad !=
        System.out.println("Desigualdad: "+(num1 != num2));
        // Operador de mayor que >
        System.out.println("Mayor que: "+(num1 > num2));
        // Operador de menor que <
        System.out.println("Menor que: "+(num1 < num2));
        // Operador de mayor o igual que >=
        System.out.println("Mayor o igual que: "+(num1 >= num2));
        // Operador de menor o igual que <=
        System.out.println("Menor o igual que: "+(num1 <= num2));

    }
}
  