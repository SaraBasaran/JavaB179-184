package day12daytime_classes_enums;

import java.time.LocalDate;
import java.util.Scanner;

public class C02DateTime {

    public static void main(String[] args) {

        //Ask user to enter his date of birth then tell user the day name

        Scanner input= new Scanner(System.in);

        System.out.println("Enter the year, month and day number for your date of birth");

        int year= input.nextInt();
        int month= input.nextInt();
        int day= input.nextInt();

        LocalDate dob= LocalDate.of(year, month, day);

        System.out.println("You were born "+ dob.getDayOfWeek());


    }
}
