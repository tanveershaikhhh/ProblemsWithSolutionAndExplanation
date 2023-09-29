package dateAndTime;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {


    public static String findDay(int month, int day, int year) {
     
     String day_of_week[] = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
     
     Calendar calendar = Calendar.getInstance();
     calendar.set(year, month-1, day);
     
     int DAY = calendar.get(Calendar.DAY_OF_WEEK);
    
 
     return day_of_week[DAY-1];
     
     
      
     

    }

}
//Here is a line-by-line explanation of the code:

//BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

//This line creates a new BufferedReader object called bufferedReader that reads input from the console.
//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//This line creates a new BufferedWriter object called bufferedWriter that writes output to the console.
//String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

//This line reads a line of input from the console using the bufferedReader object and stores it in a string array called firstMultipleInput. The replaceAll method is used to remove any trailing whitespace, and the split method is used to split the input string into separate values based on spaces.
//int month = Integer.parseInt(firstMultipleInput[0]);

//This line converts the first element of the firstMultipleInput array (which represents the month) from a string to an integer and assigns it to the month variable.
//int day = Integer.parseInt(firstMultipleInput[1]);

//This line converts the second element of the firstMultipleInput array (which represents the day) from a string to an integer and assigns it to the day variable.
//int year = Integer.parseInt(firstMultipleInput[2]);

//This line converts the third element of the firstMultipleInput array (which represents the year) from a string to an integer and assigns it to the year variable.
//String res = Result.findDay(month, day, year);

//This line calls the findDay method from the Result class (which is not shown in the provided code) and passes the month, day, and year variables as arguments. The returned day of the week is assigned to the res variable.
//bufferedWriter.write(res);

//This line writes the value of the res variable (which represents the day of the week) to the console using the bufferedWriter object.
//bufferedWriter.newLine();

//This line writes a new line character to the console using the bufferedWriter object.
//bufferedReader.close();

//This line closes the bufferedReader object, releasing any system resources associated with it.
//bufferedWriter.close();

//This line closes the bufferedWriter object, releasing any system resources associated with it.

public class dateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
