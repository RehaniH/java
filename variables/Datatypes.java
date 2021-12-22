package variables;

public class Datatypes {

    public static void main(String[] args){

        /**
         * variable declaration
         * 
         * dataType variableName = value ;
         * 
         * primitive data types: byte, short, int, long, boolean, float, double, char
         * object references: String, ArrayLists, etc.
         */
        

        /*** 
         * Integer data types
         */
        int age; //defaults to zero
        age = 23;
        int negativeInteger = -23;

        //min value: -128 and max value of 127 (inclusive)
        byte byteExample =  126 ;
        
        //min value of -32,768 and a max value of 32,767 (inclusive)
        short shortExample = 30000; 

        long longExample = 1234567891011121314l; //preceded by letter 'l'
        long longExample2 = 1234567891011121314L; //preceded by letter 'l'

        /**
         * floating point data types
         */
        float price = 19.99f;
        float debit = -10.23F; //preceded by letter 'f'

        double priceNew = 10.233213d; //could be preceded with letter 'd'
        double debitNew = -9.221212212;
        double doubleExample = 1021212.00021218732;

        /**
         * boolean datatype
         */
        boolean student = true;
        boolean employee = false;

        /** 
         * Charactor data type
         */
        char firstInitial = 'R'; //char should be in single quotes
        //char secondInitial = "H"; //generates error

        //using ASCII code numbers
        char a = 65, b = 66, c = 67;

        /***
         * string data type: is object type since it has methods
         * 
         */
        //String someString; //defaults to null
        String name = "Himasha Perera";

        System.out.println("\nint can store negative numbers as well: " + negativeInteger);
        System.out.println("floating point numbers: " + price + " and " + debit);
        
        System.out.println("\nByte is of 8 bit " + byteExample);
        System.out.println("Short is of 16 bit " + shortExample);
        System.out.println("Int is of 32 bit " + negativeInteger);
        System.out.println("Long is of 64 bit " + longExample + longExample2);
        
        
        System.out.println("\nfloat is of 32 bit " + byteExample);// precision: 6 or 7 decimal points
        System.out.println("double is of 64 bit " + priceNew + debitNew + doubleExample); //precision: 15 decimal points
        
        System.out.println("boolean can either be " + student + " or " + employee);
        System.out.println(a + ", " + b + ", " + c);  


        System.out.println("Name is of string data type: " + firstInitial + name + " where as age is of int: " +  age);
        System.out.println(name.toLowerCase());
        System.out.println(name.concat(" Blog"));
    }
    
}
