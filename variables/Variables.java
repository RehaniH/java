package variables;
public class Variables {
    public static void main(String[] args){

        /**
         * variable declaration
         * 
         * dataType variableName = value ;
         */

        int age = 23;
        int x = 11 , y = 10, z = 15;

        System.out.println(age);
        System.out.println(z);
        System.out.println(x + y + z);

        String myCar = "Volvo ";
        String mycar = "Mercedes ";

        System.out.println(myCar + mycar);

        //equals() checks if the content is same
        System.out.println(myCar.equals(mycar));
        System.out.println(myCar.equals("Volvo "));
        
        mycar = "Volvo ";
        System.out.println(myCar.equals(mycar));

        //same string in String pool of java
        System.out.println(myCar == mycar);
    }
    
}
