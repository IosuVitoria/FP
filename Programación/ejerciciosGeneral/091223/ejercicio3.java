// ################################################################################
// Introducir una cadena de caracteres e indicar si es un palíndromo. Una palabra
// palíndroma es aquella que se lee igual adelante que atrás.
// ################################################################################
// Análisis
// Leo una cadena. La paso a mayúsculas, le quito espacios y vocales con tilde,
// después creo una nueva cdena invirtiend o la cadena anterior. Si ambas cadenas
// son iguales-> Es un palíndromo.
// Datos de entrada: Cadena de caracteres
// Información de salida: Mensaje indicando si es palíndromo o no.
// Variables: cadena, cadena1, cade na2, i (posición)
// ################################################################################

import java.util.Scanner;
         

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cadena, cadena2 = "";
        
        System.out.print("Introduce una palabra para ver si es palíndromo: ");
        cadena = sc.nextLine();
            
        cadena = cadena.replaceAll("\\s", "").toUpperCase();
        
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadena2 += cadena.charAt(i);
        }
        
        if (cadena.equals(cadena2)) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
    }
}
