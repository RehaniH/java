import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {
    public static void main(String args[]){
        Date date = new Date();

        String formatOfDate = "dd-MM-yyyy";
        SimpleDateFormat dateFormatter = new SimpleDateFormat(formatOfDate);
        String formated = dateFormatter.format(date);

        System.out.println(formated);
        
        try{
            Date invalidFormat = dateFormatter.parse("45-03-2018"); // 45 - 31 = 14 of next month
            System.out.println(dateFormatter.format(invalidFormat));

            dateFormatter.setLenient(false);
            Date invalidFormat2 = dateFormatter.parse("45-03-2018");
            System.out.println(dateFormatter.format(invalidFormat2));



        }catch(ParseException e){
            System.out.println("java.text.ParseException occured ");
            System.out.println(e.getMessage());
        }


    }
}
