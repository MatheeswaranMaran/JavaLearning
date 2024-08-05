import java.util.*;

public class TimeConversion1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String time = s.next();
        String convertedTime = convertTo24HourFormat(time);
        System.out.println("12-hour format: " + time);
        System.out.println("24-hour format: " + convertedTime);
    }

    public static String convertTo24HourFormat(String time12Hour) {
        // Extract hour, minute, second, and AM/PM
        int hour = Integer.parseInt(time12Hour.substring(0, 2));
        int minute = Integer.parseInt(time12Hour.substring(3, 5));
        int second = Integer.parseInt(time12Hour.substring(6, 8));
        String period = time12Hour.substring(8);

        // Convert hour to 24-hour format
        if (period.equalsIgnoreCase("PM") && hour != 12) {
            hour += 12;
        } else if (period.equalsIgnoreCase("AM") && hour == 12) {
            hour = 0;
        }

        // Format hour, minute, and second into 24-hour format string
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
