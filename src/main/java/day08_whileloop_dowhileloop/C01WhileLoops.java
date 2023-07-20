package day08_whileloop_dowhileloop;

public class C01WhileLoops {

    public static void main(String[] args) {

        //Type code to print even integers from 13 to 8 on the console

        int i=13;

        while(i>7){

            if(i%2==0){
                System.out.print(i + " ");
            }

                  i--;

        }

        /*
        "Infinite Loop" is a risk in using loops.
        If you forget to type "increment or decrement part" in loops, you will have "infinite loops" and Java will get stuck over there.
        It means your application will freeze.

        If you type "increment or decrement part" in a wrong way in loops, you will have "infinite loops" and Java will get stuck over there.
        It means your application will freeze.
         */

        //Example 2: Type code to check if a given integer is palindrome or not
        //           Palindrome: 121  ==> 121   123321 ==> 123321

        System.out.println();

        int k= -123321;
        k= Math.abs(k);

        String m= String.valueOf(k);

        int n= m.length()-1;

        String reversed="";

        while(n>=0){

          reversed= reversed+ m.charAt(n);

          n--;

        }
        System.out.println(reversed);

        if (m.equals(reversed)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

















    }



}
