package variables;

public class Casting {

    public static void main(String[] args){

        //automatic casting or widening casting
        int myInteger = 10;
        double myDouble = myInteger; //two types are compatible

        System.out.println(myInteger); //10
        System.out.println(myDouble);  //10.0

        //causes java.lang.NumberFormatException
        // int stringConversion = Integer.parseInt("hello");
        // System.out.println("String to float conversion: " + stringConversion);

        //manual casting or narrowing casting
        double doubleValue = 9.38d;
        int intValue = (int)doubleValue;

        System.out.println(intValue);
        System.out.println(doubleValue);

        int one = 49;
        int simpleA = 97;

        char oneChar = (char)one;
        char aChar = (char)simpleA;
        System.out.println(one + " = " + oneChar);
        System.out.println(simpleA + " = " + aChar);



    }
    
}
