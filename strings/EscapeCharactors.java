package strings;

public class EscapeCharactors {

    public static void main(String [] args){

        String text = "Here is the way to add \"double quotes\" to a string";
        String text_with_quotes = "Here is the way to add \'single quotes\' to a string";
        String escapeCharactor = "Back slash \\ is the escape charactor used prior to special charracters";

        System.out.println(text);
        System.out.println(text_with_quotes);
        System.out.println(escapeCharactor);

        System.out.println("\n is New line escape sequence.");
        System.out.println("\t is tab escape sequence.");

    }
    
}
