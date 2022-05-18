package strings;

public class StringComparison {

    public static void main(String[] args){

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1=="Hello");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals("Hello"));

        str1 = str3;

        System.out.println(str1 == str3);

        String str4 = "always";
        String str5 = "all";
        String str6 = "cat";
        System.out.println("long string with short string: "  +  str4.compareTo(str5));
        System.out.println("short string with long string: " + str5.compareTo(str4));
        System.out.println("both strings same length: " + str5.compareTo(str6));

    }
    
}
