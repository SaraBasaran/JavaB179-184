package day05ternarystatement_stringmanipulations;

public class C02TernaryOperator {
    public static void main(String[] args) {

        //Example 5: Type code to check if an integer is odd and if it is even it should be divisible 3.
        //           7 ==> Odd    12 ==> Even ==> divisible by 3    14 ==> Even ==> Not divisible by 3

        int a= 15;

       String result1= a%2!=0 ? "Odd" : (a%3==0 ? "Even and divisible by 3" : "Even but not divisible by 3");

        System.out.println(result1);

        //Example 6(Interview Question):
        //Type java code by using nested ternary.
        //Write a program to check if a year is leap year or not.
        //If the year is divisible by 100 then it must be divisible by 400. (2000+, 1800-)
        //If a year is not divisible by 100 then it must be divisible by 4. (1996+, 2001-)

        int year= 2001;

        // (Condition) ? (true()) : (false());

      String result2= (year%100==0) ? (year%400==0 ? "Leap Year" : "Not Leap Year") : (year%4==0 ? "Leap Year": "Not Leap Year");

        System.out.println(result2);


    }


}
