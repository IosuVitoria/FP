
// Tabla de Multiplicar: Escribe un programa que imprima la tabla de multiplicar de un número específico (por ejemplo, la tabla del 5).

import java.util.Scanner;

public class ejercicio2 {
    
    public static void main(String[] args){
        int table, calc;
        Scanner sc = new Scanner(System.in);

        System.out.print("Elige la tabla de multiplicar que deseas ver: ");
        table = sc.nextInt();

        for(int i = 0; i <= 10; i++){
            calc = table*i;
            System.out.println(table + " x " + i + " = " + calc);
        }
    }
}
