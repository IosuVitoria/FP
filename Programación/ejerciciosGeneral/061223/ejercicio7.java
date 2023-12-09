// ################################################################################
// MEJORA LA VERSIÓN DEL PROGRAMA DEL EJERCICIO6 Y INCORPORA UN NÚMERO MÁXIMO DE FALLOS.
// ################################################################################

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int intentos = 3;

        String usuarioP = "pepe";
        String passwordP = "asdasd";

        for (int i = intentos; i > 0; i--) {

            String usuario, password;

            System.out.print("Introduce el nombre de usuario: ");
            usuario = sc.nextLine();
            System.out.print("Introduce la contraseña: ");
            password = sc.nextLine();

            if (usuario == usuarioP && password == passwordP) {
                System.out.println("Has entrado en el sistema.");
            } else {
                System.out.println("Datos erróneos");
            }
        }

        System.out.println("Has agotado el número de intentos.");

    }
}
