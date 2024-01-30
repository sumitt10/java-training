import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Assignment1 {
    public static void main(String[] args) {
        String userInput = "29/01/2024 01:00";
        String inputFormat = "dd/MM/yyyy HH:mm";


        SimpleDateFormat inFormat = new SimpleDateFormat(inputFormat);
        Date date = null;
        
        // Attempt to parse the user input(string) into Date object, If successful --> the date variable is updated otherwise an error message will be printed there
        try {
            date = inFormat.parse(userInput);
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
            return;
        }

        long unix = date.getTime()/ 1000;
        System.out.println("Local timestamp (IST) to Unix Timestamp: " + unix);


        SimpleDateFormat outFormat = new SimpleDateFormat(inputFormat);
        outFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String utc = outFormat.format(date);
        System.out.println("Local timestamp (IST) to UTC: " + utc);

        SimpleDateFormat outFormatIST = new SimpleDateFormat(inputFormat);
        outFormatIST.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        String localtime = outFormatIST.format(date);
        System.out.println("UTC to Local timestamp (IST): " + localtime);
    }
}
