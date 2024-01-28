//Dadas dos cadenas de texto, devolver una tercera que sea la suma de la primera+segunda+segunda+primera.

public class ejercicio1 {

public static void main(String[] args){
 
        String word1 = "Esto es una prueba.";
        String word2 = " Y esto es otra prueba.";

        System.out.println(makeAbba(word1, word2));
    }

    public static String makeAbba(String a, String b) {
        String result = a + b + b + a;

        return result;
  

    }
}
 