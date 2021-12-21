public class Variables {
    public static void main(String[] args){

        /**
         * variable declaration
         * 
         * dataType variableName = value ;
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

        /**
         * floating point data types
         */
        float price = 19.99f;
        float debit = -10.23f; //preceded by letter 'f'
        double priceNew = 10.233213;
        double debitNew = -9.221212212;

        /***
         * string data types
         */
        //String someString; //defaults to null
        String name = "Himasha Perera";
        char firstInitial = 'R'; //char should be in single quotes
        //char secondInitial = "H"; //generates error

        /**
         * boolean datatypes
         */
        boolean student = true;
        boolean employee = false;


        System.out.println("int can store negative numbers as well: " + negativeInteger);
        System.out.println("floating point numbers: " + price + " and " + debit);
        System.out.println("boolean can either be " + student + " or " + employee);
        
        System.out.println("Byte is of 8 bit " + byteExample);
        System.out.println("Short is of 16 bit " + shortExample);
        System.out.println("Int is of 32 bit " + negativeInteger);
        System.out.println("Long is of 64 bit" + longExample);
        
        
        System.out.println("float is of 32 bit" + byteExample);
        System.out.println("double is of 64 bit" + priceNew + debitNew);
        
        System.out.println("Name is of string data type: " + firstInitial + name + " where as age is of int: " +  age);



        
    }
    
}
