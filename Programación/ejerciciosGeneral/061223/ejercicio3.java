// ################################################################################
// Calcular la media de tres números pedidos por teclado
// ################################################################################
// Análisis
// Tenemos que leer tres números y calcular la media. 
// Datos de entrada: los tres números (real)
// Información de salida: ldia (real)    
// Variables: num1,num2,num3, media (Real).
// ################################################################################
// Diseño
// 1. Leer los tres nÃºmeros    
// 2. Calcular la media: (num1+num2+num3)/3
// 3. Mostrar la media
// ################################################################################
    
import java.util.Scanner;   

public class ejercicio3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double num1, num2, num3, media;

        System.out.print("Introduce el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextInt();
        System.out.print("Introduce el tercer número: ");
        num3 = sc.nextInt();
        
        media = (num1 + num2 + num3 )/3;

        System.out.println("La media es igual a: "+media);
    }

}
