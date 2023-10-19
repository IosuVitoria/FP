
// Calculadora Simple: Crea una calculadora que tome dos números y una operación (suma, resta, multiplicación o división) como entrada y muestre el resultado.
import java.util.Scanner;

public class ejercicio1 {
    
    public static void main(String[] args){

        double num1, num2, total;
        String op;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el valor del primer número: ");
        num1 = sc.nextDouble();
        System.out.print("Introduce el valor del segundo número: ");
        num2 = sc.nextDouble();
        System.out.print("Introduce la operación que quieres realizar (suma, resta, multiplicación o división): ");
        op = sc.next();

        // Muestra los números y la operación ingresados por el usuario
        // System.out.println("El primer número es: " + num1 + ". El segundo número es: " + num2 + ". La operación pedida ha sido: " + op);

        if(op.equals("suma")){
            total = num1 + num2;
        }
        else if(op.equals("resta")){
            total = num1 - num2;
        }
        else if(op.equals("multiplicación")){
            total = num1 * num2;
        }
        else if(op.equals("division")){
            if(num2 == 0){
                System.out.println("No se puede dividir entre 0.");
                return; // Sale del programa si hay una división por cero.
            }
            else{
                total = num1 / num2;
            }
        }
        else {
            System.out.println("Operación no válida. Por favor, elija suma, resta, multiplicación o división.");
            return; // Sale del programa si la operación no es válida.
        }
        
        // Muestra el resultado de la operación.
        System.out.println("El resultado total de la operación es: " + total);
    }
}
