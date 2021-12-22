package variables;

public class Casting {

    public static void main(String[] args){

        //automatic casting or widening casting
        int myInteger = 10;
        double myDouble = myInteger; 

        System.out.println(myInteger); //10
        System.out.println(myDouble);  //10.0

        //manual casting or narrowing casting
        double doubleValue = 9.38d;
        int intValue = (int)doubleValue;

        System.out.println(intValue);
        System.out.println(doubleValue);



    }
    
}
