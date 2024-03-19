public class ejercicio13 {

    public static void main(String[] args) {

        parteSuperior();
        parteMedia();
        bandera();
        parteMedia();
        parteSuperior();
    }

    public static void parteSuperior() {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }

    public static void parteMedia() {
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }

    public static void bandera() {
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }
}
