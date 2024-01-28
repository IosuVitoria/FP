import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double num1, num2, resultado;

        System.out.print("Introduce el primer número: ");
        num1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextDouble();

        if(num2==0){
            System.out.println("No se puede dividir entre 0.");

        }else{
            resultado = num1/num2;
            System.out.println("El resultado de la división es: "+resultado);
        }

    }

}
