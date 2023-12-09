// 1. Verificación de contraseña
// Escribe un programa que solicite al usuario ingresar una contraseña. Si la contraseña ingresada es "java123", imprime "Contraseña correcta", de lo contrario, imprime "Contraseña incorrecta"

import java.util.Scanner;

public class ejercicio1 {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String password;
        System.out.print("Introduce tu contraseña: ");
        
        password = scanner.nextLine();
        System.out.println(password);
        if(password.equals("java123")){ //En java a la hora de realizar comparaciones con strings utilizamos el método equals.
            System.out.println("Contraseña correcta.");
        }else{
            System.out.println("Contraseña incorrecta");
        }
    }
}
