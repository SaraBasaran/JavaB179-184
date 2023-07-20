package day03scannerclass;

import java.util.Scanner;

public class ScannerClass03 {
    public static void main(String[] args) {

        //Example: Ask user to enter i)Full Name  ii)Age iii) Height  iv)Marital Status
        //         Then print them on the console in different lines with a label

        //create Scanner object
        Scanner input= new Scanner(System.in);

        //give the message to the user
        System.out.println("Please enter your full name");

        //use a proper method to get the data and store it in the memory
        String fullName =  input.nextLine();
        System.out.println("Enter your age");
        byte age = input.nextByte();

        System.out.println("Please enter your height...");
        float height= input.nextFloat();

        System.out.println("Please tell me, are you married?");
        boolean isMarried=  input.nextBoolean();

        System.out.println("Your full name is: " + fullName);
        System.out.println("Your age is: " + age);
        System.out.println("Your height is: " +height);
        System.out.println("Is married? " + isMarried );







    }


}
