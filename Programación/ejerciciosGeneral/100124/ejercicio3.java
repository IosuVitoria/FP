import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args){

        int num;     

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce    el número a evaluar: ");

        num = sc.nextInt();

        if (num % 3 == 0    || num % 2 == 0 || num % 5 == 0 || num % 7 == 0 || num % 11 == 0) {
            System.out.println("El número no es p   rimo.");
        } else {
            System.out.println("El número es primo.");
        }
        
        // for(int i = 0; i<=100 000 000; i++){
        //      if (i % 3 == 0 || i % 2 == 0 || i % 5 == 0 || i % 7 == 0 || i % 11 == 0) {
        //     System.out.println("El número "+i+" no es primo.");
        // } else {
        //     System.out.println("El número "+i+" es primo.");
        // }
        
        
    }
}
    