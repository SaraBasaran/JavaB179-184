package day08_whileloop_dowhileloop;

public class C02WhileLoops {
    public static void main(String[] args) {
        //Example 3: Type code to find the sum of the digits of a given integer
        //            587 --> 5+8+7 --> 20

        int i= -5873;
        i= Math.abs(i);
        int sum=0;

        while(i>0){
            sum= sum+ i%10;

            i/=10;

        }
        System.out.println(sum);

        //Example 4: Type code to create multiplication table for the given integer
        //           3 ==> 3x1=3, 3x2=6, 3x3=9......3x10= 30

        int k= 1;

        int number=3;

        while (k<11){

            System.out.println(number+ "x"+ k + "=" + (k*number));

            k++;
        }
    }





}
