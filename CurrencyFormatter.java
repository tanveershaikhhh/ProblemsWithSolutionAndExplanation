package CurrencyFormatter;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
       NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = new DecimalFormat("###,###.00");
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        // Write your code here.
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: Rs." + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
