package mathematical;

public class Operations {

    public static void main(String[] args){

        double x = 10;
        float y = 17.7f;
        System.out.println(Math.max(x, y));
        System.out.println(Math.min(x, y));
        System.out.println(Math.sqrt(x));
        System.out.println(Math.abs(-10.22));

        //random number between 0.0 (inclusive) and 1.0(exclusive)
        System.out.println(Math.random());

        int randomNumber = (int)(Math.random() * 101);
        System.out.println(randomNumber);


        int number1 = 10;
        int number2 = 3;


        System.out.println("Integer using % operator: " + number1%number2);
        System.out.println("Floating point numbers using % operator: " + (y%x));
      
    }
    
}
