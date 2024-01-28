
// The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
// In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
//  Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".


public class ejercicio2 {

    public static void main(String[] args){

        String tag = "p";
        String word = "Lorem ipsum";

        System.out.println(MakeTags(tag, word));

    }

    public static String MakeTags(String tag, String word){

        return "<"+tag+">"+word+"</"+tag+">";
    }

}
