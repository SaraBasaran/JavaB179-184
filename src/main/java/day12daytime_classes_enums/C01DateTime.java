package day12daytime_classes_enums;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class C01DateTime {

    public static void main(String[] args) {

        //How to get local date from Java

        LocalDate myDate=  LocalDate.now();//Obtains the current date from the system clock in the default time zone

        System.out.println(myDate);//2023-07-18

        //How to get to a future date
       LocalDate yourDate= myDate.plusMonths(3).plusDays(11);
        System.out.println("yourDate = " + yourDate);//yourDate = 2023-10-29

        //How to get to a past date
       LocalDate ourDate= myDate.minusYears(2).minusMonths(10).minusDays(45);
        //when we use multiple methods in the same line, it is called "method chain".

        System.out.println("ourDate = " + ourDate);//ourDate = 2020-08-04


        //How to format date
        //Example 1:
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("MM/dd/yyyy");
        
        String formattedMyDate= dtf.format(myDate);
        System.out.println("formattedMyDate = " + formattedMyDate);

        //Example 2:
       DateTimeFormatter dt= DateTimeFormatter.ofPattern("MMM-dd-yyyy");
       String myDateFormatted= dt.format(myDate);

        System.out.println("myDateFormatted = " + myDateFormatted);
        
        //Example 3: 
        DateTimeFormatter d= DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String myDateFormat= d.format(myDate.plusMonths(1));
        System.out.println("myDateFormat = " + myDateFormat);
        
       //How to see a different time zone 

        LocalDate dateInJapan= LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("dateInJapan = " + dateInJapan);//2023-07-18

        LocalDate dateInIstanbul= LocalDate.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("dateInIstanbul = " + dateInIstanbul);//dateInIstanbul = 2023-07-18
        
        //How to get LocalTime from Java
       LocalTime myTime= LocalTime.now(); //Obtains the current time value from the system clock in the default time zone
        System.out.println("myTime = " + myTime);//myTime = 17:44:14.146895600
        
        //How to get to a future time
        
        LocalTime yourTime=myTime.plusHours(1).plusMinutes(25).plusSeconds(13);
        System.out.println("yourTime = " + yourTime);//yourTime = 19:15:33.186072300
        
        //How to get to past date
       LocalTime ourTime= myTime.minusNanos(2000);
        System.out.println("ourTime = " + ourTime);//ourTime = 17:50:20.186070300

        //How to format time
       DateTimeFormatter f1= DateTimeFormatter.ofPattern("hh:mm a");//"HH" --> returns the hour value with 24 hour system
                                                                  //"hh" --> returns the hour value with 12 hour system//05:58
                                                                  //"a" stands for AM or PM for time value
       String t1= f1.format(myTime);
        System.out.println("t1 = " + t1);//05:59 PM

     //How to get time in another time zone
       LocalTime timeInJapan=  LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("timeInJapan = " + timeInJapan);//00:02:43.508212600

       LocalDateTime myDateTime= LocalDateTime.now();
        System.out.println("myDateTime = " + myDateTime);

        System.out.println(myDateTime.getMonth());//JULY
        System.out.println(myDateTime.getDayOfWeek());//TUESDAY
        System.out.println(myDateTime.getMonthValue());//7

        //Example 4: If the given date is before the current date give message to user like "Invalid date"
        //           If the given date equals the current date give message to user like "Give the time"
        //           If the time is before current time tell to user "No ticket" otherwise tell to user "There is just 1 ticket"
        //           If the given date is after the current date give message to user like "Buy the ticket"

        Scanner input= new Scanner(System.in);
        System.out.println("Enter year, month, day values");

        int year= input.nextInt();
        int month= input.nextInt();
        int day= input.nextInt();

        LocalDate givenDate= LocalDate.of(year, month, day);
        LocalDate currentDate= LocalDate.now();
        System.out.println("Enter the hour you want to reserve");
        int hour=  input.nextInt();
        int minute= input.nextInt();
        LocalTime givenTime= LocalTime.of(hour, minute);
        LocalTime currentTime= LocalTime.now();

        if (givenDate.isBefore(currentDate)){
            System.out.println("Invalid date");
        }else if (givenDate.isEqual(currentDate)){

            if (givenTime.isBefore(currentTime)){
                System.out.println("No ticket");
            }else {
                System.out.println("There is just 1 ticket");
            }


        }else if (givenDate.isAfter(currentDate)){
            System.out.println("Buy the ticket");
        }


    }
}
