public class StringBuilderOperations {
    public static void main(String args[]) {

        StringBuilder builder = new StringBuilder("Shampoo");
        builder.delete(1, 3);

        System.out.println(builder);

        builder.append("new string added");
        System.out.println(builder);

        builder.replace(0, 5, "Shampoo");
        System.out.println(builder);


    }
}
