package day03scannerclass;

public class Concatenation {

    public static void main(String[] args) {

             /*
        Concatenation means: Joining Strings with each other or with other data types
                             To do concatenation we have 2 options;
                             1)Use "+" sign --> it can be used with all data types
                             2) We use concat() method to join data just for string values.

          Java follows math operation priority rules when we deal with addition, multiplication, division, subtraction
          For Java when we are required to do math operations with a String label, we have to put the addition operation part
          inside parenthesis.

          1)Java first does the operation inside the parenthesis
          2)if there is any multiplication or division operation java will deal with them in the second part
          3) If there is any addition or subtraction operation java will do the operation at the very end

        */

        String name= "Tom";

        String lastName="Hanks";

        int i= 12;
        int k= 5;

        char c='A';

        System.out.println(name + " " +lastName);

       System.out.println(name.concat(" ").concat(lastName));

        System.out.println(name +i+k);//Tom125

        System.out.println(name+ (i+k));//Tom17

        System.out.println(i+k + name);//17Tom

        System.out.println(name + i*k);



























    }



}
