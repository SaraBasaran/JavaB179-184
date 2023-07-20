package day03scannerclass;

import java.util.Scanner;

public class ScannerClass04 {

    public static void main(String[] args) {

        //Example: Ask user to enter 5 digits a number like 45678
        //         Print the sum of first two and the last two digits.
        // 45678 --> 45 + 78 = 123

        Scanner input= new Scanner(System.in);

        System.out.println("Please enter a 5 digit number"); //digits are from 0-9

        int num= input.nextInt(); //45678

       int firstTwo= num/1000;

       System.out.println(firstTwo);

       // % --> Modulus operator: returns the remainder of a division operation

      int lastTwo= num % 100;//the remainder will be returned
        System.out.println(lastTwo);

        System.out.println("The sum is: "+ (firstTwo+lastTwo));

    }



}
