import java.util.Scanner;

public class Libreria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        sc.nextLine();

        modificarDatos(libro1, sc);
        modificarDatos(libro2, sc);

        System.out.println("El libro introducido tiene el título:  " + libro1.titulo + " fue escrito por: "
                + libro1.autor + " y fue publicado en el año: " + libro1.anio);

        System.out.println("El segundo libro introducido tiene el título:  " + libro2.titulo + " fue escrito por: "
                + libro2.autor + " y fue publicado en el año: " + libro2.anio);

        sc.close();
    }

    public static void modificarDatos(Libro libro, Scanner sc) {

        System.out.print("Introduce el autor del segundo libro: ");
        libro.autor = sc.nextLine();
        System.out.print("Introduce el título del segundo libro: ");
        libro.titulo = sc.nextLine();
        System.out.print("Introduce el año de publicación: ");
        libro.anio = sc.nextInt();
    }
}
