import java.util.Scanner;

public class Persona {
    int edad;
    String nombre;
    String telefono;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        // Llamamos al método modificarDatos para actualizar los datos de persona1
        modificarDatos(persona1, sc);
        modificarDatos(persona2, sc);

        // Cerramos el Scanner al finalizar su uso
        sc.close();
    }

    // Método para modificar los datos de una persona
    public static void modificarDatos(Persona persona, Scanner sc) {
        System.out.print("Introduce el nombre: ");
        persona.nombre = sc.nextLine();

        System.out.print("Introduce la edad: ");
        persona.edad = sc.nextInt();
        sc.nextLine(); // Limpiamos el buffer

        System.out.print("Introduce el teléfono: ");
        persona.telefono = sc.nextLine();

        // Mostramos los datos actualizados
        System.out.println("Datos actualizados:");
        System.out.println("Nombre: " + persona.nombre);
        System.out.println("Edad: " + persona.edad);
        System.out.println("Teléfono: " + persona.telefono);
    }
}
