

import java.util.Calendar;
import java.util.Scanner;

public class Calander_Date_Challenge {

    public static String findDay(int month, int day, int year) {
        // Step 1: Create a magical calendar set to today's date
        Calendar cal = Calendar.getInstance();

        // Step 2: Adjust the calendar to the specific date (subtract 1 from month)
        cal.set(year, month - 1, day);

        // Step 3: Ask the calendar for the day of the week (it gives us a number)
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        // Step 4: Map the number to the actual day name
        String[] days = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY" };

        // Step 5: Return the correct day name based on the number
        return days[dayOfWeek - 1];
    }

    public static void main(String[] args) {
        // Input comes in the format: month, day, year
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();

        // Call the findDay function and print the result
        System.out.println(findDay(month, day, year));

        // Close the scanner
        in.close();
    }
}