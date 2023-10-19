//Iosu Gómez Valdecantos. Fecha: 25-09-3. Módulo: Programación (DAM/DAW). Unidad 1. PROG01 Tarea Evaluación 01. Realiza un programa en Java (30%)


public class RinconSombra {

    public static void main(String[] args) {
        // Llamamos a los métodos que representan cada estrofa
        estrofa1();
        comun();
        estrofa2();
        comun2();
        estrofa3();
        comun3();
        estrofa4();
        comun4();
        estrofa5();
        comun5();
    }

    // Métodos para escribir las partes comunes dentro de las estrofas.

    // Estrofa 1. 
    public static void comun(){
        System.out.println("Sombreó el roble al sauce,");
        System.out.println("El sauce a la sombra se quedó.");
        System.out.println();
    }

    // Estrofa 2. 
    public static void comun2(){
        System.out.println("Sombreo el abedul al roble,");
        comun();
    }

    // Estrofa 3. 
    public static void comun3(){
        System.out.println("Sombreo el pino al abedul,");
        comun2();
    }

    // Estrofa 4. 
    public static void comun4(){
        System.out.println("Sombreo el cedro al pino,");
        comun3();
    }

    // Estrofa 5. 
    public static void comun5(){
        System.out.println("Sombreo el haya al cedro,");
        comun4();
    }


    // Métodos para escribir las partes únicas de cada estrofa.

    // Estrofa 1.
    public static void estrofa1() {
        System.out.println("Se encontraba el sauce en su rincón,");
        System.out.println("Vino el roble y le hizo sombra,");
    }

    // Estrofa 2.
    public static void estrofa2() {
        System.out.println("Se encontraba el roble en su rincón,");
        System.out.println("Vino el abedul y le hizo sombra,");
    }

    // Estrofa 3.
    public static void estrofa3() {
        System.out.println("Se encontraba el abedul en su rincón,");
        System.out.println("Vino el pino y le hizo sombra,");
    }

    // Estrofa 4.
    public static void estrofa4() {
        System.out.println("Se encontraba el pino en su rincón,");
        System.out.println("Vino el cedro y le hizo sombra,");
    }

    // Estrofa 5.
    public static void estrofa5() {
        System.out.println("Se encontraba el cedro en su rincón,");
        System.out.println("Vino el haya y le hizo sombra,");
    }
}
