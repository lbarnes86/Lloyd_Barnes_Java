package com.company;

import java.util.Scanner;
// Run ConverterApplication to see results in the terminal.
public class ConverterApplication {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a month using a number.");
        int monthNumber = scan.nextInt();

        System.out.println("Enter a day of the week using a number.");
        int dayNumber = scan.nextInt();

        Converter converterIf = new ConverterIf();
        Converter converterSwitch = new ConverterSwitch();

        String month = converterIf.convertMonth(monthNumber);
        String day = converterIf.convertDay(dayNumber);
        System.out.println("=== Response using If/Else====");
        System.out.println(month);
        System.out.println(day);

        System.out.println("=== Response using Switch Cases ====");
        String monthSwitch = converterSwitch.convertMonth(monthNumber);
        String daySwitch = converterSwitch.convertDay(dayNumber);
        System.out.println(monthSwitch);
        System.out.println(daySwitch);


    }

}
