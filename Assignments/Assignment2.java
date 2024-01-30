import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        
        String userInput = "29/01/2024 01:00";
        Date inputDate = parseDate(userInput);

        if (inputDate != null) {
            Date addedOneDay = addDay(inputDate, 1);
            Date subtractedTenDays = subtractDays(inputDate, 10);
            Date addedOneHour = addHour(inputDate, 1);
            Date subtractFivehoursAndthirtymin = subtractHoursnMinutes(inputDate, 5, 30);

            List<Date> datesToSort = new ArrayList<>();
            datesToSort.add(inputDate);
            datesToSort.add(addedOneDay);
            datesToSort.add(subtractedTenDays);
            datesToSort.add(addedOneHour);
            datesToSort.add(subtractFivehoursAndthirtymin);

            Collections.sort(datesToSort);

            displayResult("Input Date", inputDate);
            displayResult("Added One Day", addedOneDay);
            displayResult("Subtracted Ten Days", subtractedTenDays);
            displayResult("Added One Hour", addedOneHour);
            displayResult("Subtracted 5 hours : 30 Mins", subtractFivehoursAndthirtymin);
            displaySortedDates(datesToSort);
        }
    }

    private static Date parseDate(String input) {
        SimpleDateFormat inFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try {
            return inFormat.parse(input);
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
            return null;
        }
    }

    private static Date addDay(Date date, int days) {
        return new Date(date.getTime() + (days * 24 * 60 * 60 *1000L));
    }

    private static Date subtractDays(Date date, int days) {
        return new Date(date.getTime() - (days * 24 * 60 * 60*1000L ));
    }

    private static Date addHour(Date date, int hours) {
        return new Date(date.getTime() + (hours * 60 * 60 * 1000L));
    }

    private static Date subtractHoursnMinutes(Date date, int hours, int minutes) {
        return new Date(date.getTime() - (hours * 60 * 60 * 1000L) - (minutes * 60 * 1000L));
    }

    private static void displayResult(String label, Date date) {
        System.out.println(label + ": " + formatDate(date));
    }

    private static void displaySortedDates(List<Date> dates) {
        System.out.println("Sorted Dates:");
        for (Date date : dates) {
            System.out.println(formatDate(date));
        }
    }

    private static String formatDate(Date date) {
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return outputFormat.format(date);
    }
}
