import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Escribe el número del que deseas saber si es par o impar: ");
        num = sc.nextInt();

        if(num%2 == 0){
            System.out.println("El número "+num+" es par.");
        }else{
            System.out.println("El número "+num+" es impar.");
        }
    }
}
