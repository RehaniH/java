public class StringCreation {
    public static void main(String[] args) {
        String name1 = new String("me");
        String name2 = "me";
        String name3 = new String("me");
        String name4 = "me";

        //false cause new keyword generates a new object everytime
        System.out.println("name1 == name2: " + (name1 == name2));
        System.out.println("name1 == name3: " + (name1 == name3));
        System.out.println("name2 == name3: " + (name2 == name3));

        //true cause the reference variables refers to the same memory point in string pool
        System.out.println("name4 == name2: " + (name4 == name2));
    }
}
