// Given 2 strings, return their concatenation, except omit the first char of each. 
// The strings will be at least length 1.

public class ejercico4 {

    public static void main(String[] args) {
        String word1 = "Prueba1";
        String word2 = "Prueba1";
        String result = nonStart(word1, word2);
        System.out.println(result);

    }

    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

}
