public class Torre {
   
    public static void main(String[] args) {
        dibujaPunta();
        dibujaParteSuperior();
        dibujarDivisionCabeza();
        dibujaParteInferior(4);
        dibujaCuerpo();
        dibujaParteSuperior();
        dibujarDivisionCabeza();
      
     }

// Primero se dibuja la punta de la figura.

    public static void dibujaPunta(){
        for(int i = 1; i<=4; i++){
            for(int j = 1; j < 13; j++){
                System.out.print(" ");
            }
            System.out.print("||");
            for(int k = 1; k < 13; k++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    //Parte superior de la cabeza de la torre. Igual que base de la torre. 

    public static void dibujaParteSuperior() {
        //Para cambiar metodología para esta parte utilizo un bucle for-each y un array que contiene el contenido de lo que quiero dibujar. 

        String[] lines = {
                "         __/||\\__",
                "      __/:::||:::\\__",
                "   __/::::::||::::::\\__",
                "__/:::::::::||:::::::::\\__"
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }

    //Parte media de la torre. Línea divisora entre par superior y inferior de la cabeza de la torre.
    public static void dibujarDivisionCabeza (){
        System.out.print("|");
        for(int i = 0; i<24; i++){
             System.out.print('"');
        }
        System.out.println("|");
    }

    //Parte inferior de la cabeza de la torre.

    //En la parte inferior de la cabeza 

    public static void dibujaParteInferior(int longitud) {
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < i*2; j++) {
                System.out.print(" ");
            }
            System.out.print("\\_/");

            for (int j = 0; j < (longitud - i) * 2 + 2; j++) {
                System.out.print("\\/");
            }
            System.out.print("\\_/");
            System.out.println();
        }
    }

    //Cuerpo de la torre. Parte que va desde la cabeza hasta la base de la torre.

    public static void dibujaCuerpo(){
        for(int i = 0; i<12; i++){
            for(int j = 1; j < 13; j++){
                System.out.print(" ");
            }
            System.out.print("||");
            for(int k = 1; k < 13; k++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    //Base de la torre. Es igual a la parte superior de la cabeza de la torre y la línea divisoria. Repetir métodos.
}