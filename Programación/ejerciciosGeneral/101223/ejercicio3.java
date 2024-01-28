
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scnner(System.in) ;
        System.out.println("Dime una palabra: ");
        String nombre = sc.nextLine();

        for( int i = 0; i <nombre.l ength(); i++){
            System.out.print(nombre.charAt(i)+ " ");
        }

        System.out.print ln();
        sc.close(); 
   
   
    }

}
