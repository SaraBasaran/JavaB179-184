package day03scannerclass;

import java.util.Scanner;

public class ScannerClass02 {

    public static void main(String[] args) {

        //Example: Ask user to enter the width and the length of a rectangle then calculate the perimeter and the area

        //1.Step: Create a Scanner class object

        Scanner input = new Scanner(System.in);

        //2.Step: Give the message to the user
        System.out.println("Enter the width and length of a rectangle...");

        //3.Step: Create proper containers for the user input

        double width= input.nextDouble();

        double length= input.nextDouble();

        System.out.println("The perimeter is: "+ (2*width+2*length));

        System.out.println("The area is : " + width*length );



    }

}
