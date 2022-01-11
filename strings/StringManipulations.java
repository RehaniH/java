package strings;

public class StringManipulations {

    public static void main(String[] args){

        String firstName = "Rehani";
        String secondName = "Himasha";
        String lastName = "Perera";

        String fullName = firstName + " " + lastName;

        System.out.println(firstName + lastName);
        System.out.println(firstName.concat(secondName));
        System.out.println(fullName);
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.indexOf("hani"));


    }
    
}
