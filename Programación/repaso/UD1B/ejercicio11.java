public class ejercicio11 {

    public static void main(String[] args){
        
        //Estudio de la figura.
        
        //     1ºParte superior del huevo. Primer método.
        //      _______
        //     /       \
        //    /         \
            
        //    2º Parte media del huevo. Segundo método.
        //    -"-'-"-'-"-
        
        //    3º Parte inferior del huevo. Tercer método.

        //    \         /
        //     \_______/

        huevoSup();
        medioHuevo();
        huevoInf();
    }


    public static void huevoSup(){
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    public static void medioHuevo(){
        System.out.println("-\"-'-\"-'-\"-");
    }


    public static void huevoInf(){
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
}
