package day08_whileloop_dowhileloop;

import java.util.Scanner;

public class C05DoWhileLoop {

    public static void main(String[] args) {

         /*
            Username is "admin", Password is "p12"
            Ask user to enter username and password
            User should see "Enter your username and password" message
            If user enters correct credentials, he should get "You are in your account!" message
            Otherwise, he should see "Enter your username and password" message 3 times
            After 3 times he should get "Your account is blocked" message
         */

        Scanner input=new Scanner(System.in);

        int counter=0;

        do {
            if (counter==3){
                System.out.println("Your account is blocked");
                break;
            }
            System.out.println("Enter your username");
            String u = input.next();

            System.out.println("Enter your password");
            String p = input.next();

            counter++;

            if (u.equals("admin") && p.equals("p12")){
                System.out.println("You are in your account!");
                break;
            }


        }while(true);

    }


}
