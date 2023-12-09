import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
  
        int mins;
        int resMin=0;
        int resHoras=0;

        System.err.print("Introduce el número de minutos que quieras transformar a horas: ");

        mins = sc.nextInt();

        if (mins % 60 == 0) {
            resHoras = mins / 60;
        } else {
            resHoras = mins / 60;
            resMin =   mins % 60;
        }
    
        System.out.println("El resultado es: " + resHoras + " horas y " + resMin + " minutos.");

    }

}
