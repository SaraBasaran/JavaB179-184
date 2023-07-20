package day03scannerclass;

import java.util.Scanner;

public class ScannerClass01 {

    public static void main(String[] args) {

        //Example 1: Ask user to enter two numbers then do addition and multiplication operations with the numbers

        //1.Step: Create a Scanner Class object
        Scanner input= new Scanner(System.in);

        //2.Step: Give message to the user
        System.out.println("Enter first number...");

        //3.Step: Select proper method and get the data from the user
        double num1= input.nextDouble();


        System.out.println("Enter the second number...");
         double num2 = input.nextDouble();


        System.out.println("The sum is: "+ (num1+num2));




        System.out.println("The multiplication is: "+num1*num2);


    }


}
