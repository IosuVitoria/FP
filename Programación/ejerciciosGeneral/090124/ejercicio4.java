import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args){

        int num1;   
   
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número a analizar: ");
        num1 = sc.nextInt();

        if( num1 < 0 ){
            System.out.println("El número es negativo.");
        }
        else if( num1 > 0 ){
            System.out.println("El número es positivo.");
        }else{    
            System.out.println("El número es 0");
        }  
    }
}
    
                    