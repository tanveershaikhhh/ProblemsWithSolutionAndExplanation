import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayOfWeekIdentifier {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter date (DD): ");
        int day = scanner.nextInt();

        System.out.print("Enter month (MM): ");
        int month = scanner.nextInt();

        System.out.print("Enter year (YYYY): ");
        int year = scanner.nextInt();

        // Validate the input
        if (isValidDate(day, month, year)) {
            // Create a LocalDate object from the input values
            LocalDate date = LocalDate.of(year, month, day);

            // Define a formatter for the day of the week
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");

            // Print the day of the week
            String dayOfWeek = date.format(formatter);
            System.out.println("The day of the week is: " + dayOfWeek);
        } else {
            System.out.println("Invalid date. Please enter a valid date.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to validate the input date
    private static boolean isValidDate(int day, int month, int year) {
        try {
            LocalDate.of(year, month, day);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
