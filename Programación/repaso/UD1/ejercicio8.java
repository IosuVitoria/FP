// Nora San Saturnino
// DAW_DAM_PROG
// Curso 2018/19
// 
// Muestra por consola 2 rombos y una X
// 
// El estilo de este programa es mejor 
// El m�todo main est� bien estrucutrado pero todav�a existe redundancia

public class ejercicio8 {
    public static void main(String[] args) {

        // El programa bien estructurado debe tener métodos separados para cada figura.

        dibujaRombo();

        System.out.println("");

        dibujaRombo();

        System.out.println("");

        dibujaEquis();
    }

    //En la declaración de los métodos se incluye el void cuando no hay un return.

    public static void dibujaRombo(){
        System.out.println("  /\\");
        System.out.println(" /  \\");
        System.out.println("/    \\");
        System.out.println("\\    /");
        System.out.println(" \\  /");
        System.out.println("  \\/");
    }

    //En la declaración de los métodos se incluye el void cuando no hay un return.

    public static void dibujaEquis(){
        System.out.println("\\    /");
        System.out.println(" \\  /");
        System.out.println("  \\/");
        System.out.println("  /\\");
        System.out.println(" /  \\");
        System.out.println("/    \\");
    }
}
