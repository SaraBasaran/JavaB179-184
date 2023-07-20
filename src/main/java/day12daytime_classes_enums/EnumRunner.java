package day12daytime_classes_enums;

import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {

        System.out.println(UsStates.MASSACHUSETTS.getCapitalCity());

       String abb= UsStates.ALASKA.getAbbreviation();

        System.out.println(abb);

        System.out.println(UsStates.CALIFORNIA.getAbbreviation());

        //Ask user to enter a state name then give to the user capital city of that state
        Scanner input= new Scanner( System.in);
        System.out.println("Enter state name");
        String state= input.nextLine().toUpperCase();

       switch (state){

           case "ALABAMA":
               System.out.println(UsStates.ALABAMA.getCapitalCity());
               break;

           case "ALASKA":
               System.out.println(UsStates.ALASKA.getCapitalCity());
               break;

           case "AMERICAN_SAMOA":
               System.out.println(UsStates.AMERICAN_SAMOA.getCapitalCity());
               break;

           case "ARIZONA":
               System.out.println(UsStates.ARIZONA.getCapitalCity());
               break;
           default:
               System.out.println("Invalid state name");

       }







    }
}
