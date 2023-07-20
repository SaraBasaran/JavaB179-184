package day13_stringbuilder_stringbuffer_accmod;

public class C01StringBuilder {

    public static void main(String[] args) {
        /*
        There are 3 classes to store strings.
         String, StringBuilder, StringBuffer

         Why did Java create 3 classes to create Strings?
         1) String Class is "immutable", StringBuilder is "mutable".
         When you update a String class object, Java creates a new container for it and puts the updated value in it.
         When you update a String, Java does not update the original value.
         When we do any update in String Class objects, Java does not change original value(unless you reassign the updated to the same container).
         This is called "immutability".
         When we do any update in StringBuilder Class objects, Java updates original value.This is called "mutability".

         2) StringBuilder and StringBuffer are both "mutable" so what is the difference between StringBuilder and StringBuffer?
         a) StringBuilder is faster than StringBuffer
         b)  StringBuffer is "threadsafe" and "synchronized", but StringBuilder is not.
             Being "threadsafe" means to be able to do multiple tasks(threads) at a time.
             Being "synchronized" means to be able to put the threads in a proper order to save time.



         */

        String s= "Java";
        String t= "Java";

        String u= "Apex";

        s= s.concat("!");
        //concat() method is used in String class to add some characters to the String

        System.out.println(s);//Java!
        System.out.println(t);//Java

        String y= new String("Apex"); //by this way I am telling to Java to create a "new" container for the "y" container value.
                                            // If I do not want Java to check String Pool, I want Java to create new container every time.

        //StringBuilder Methods

        StringBuilder v= new StringBuilder("Python");
        System.out.println(v);//Python

        v.append("!");//is like concat() --> append() adds characters to the end of the StringBuilder object
        System.out.println(v);//Python!

        StringBuilder x= new StringBuilder("Ruby");
        System.out.println(x);

        StringBuilder sb= new StringBuilder();
        System.out.println(sb);

       sb.append("Hi! ").append("Java!...");

        System.out.println(sb);
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//12

        StringBuilder stateAbbr= new StringBuilder(2);//If we define some more characters to be added that is having a greater number
                                                             // New Capacity --> Existing/Idenified Cap Num * 2 + 2;

         stateAbbr.append("FL").append("How").append("Jack");
        System.out.println(stateAbbr);
        System.out.println(stateAbbr.capacity());//14
        System.out.println(stateAbbr.length());//9

        sb.reverse();
        System.out.println(sb);//...!avaJ !iH

        sb.replace(0, 4, "*");
        System.out.println(sb);//*avaJ !iH

        sb.insert(5, "123");
        System.out.println(sb);//*avaJ123 !iH

        sb.delete(5, 8);
        System.out.println(sb);//*avaJ !iH

        sb.deleteCharAt(6);
        System.out.println(sb);//*avaJ iH

        StringBuilder a= new StringBuilder("Nava");
        StringBuilder b= new StringBuilder("Lava");

       int r= a.compareTo(b);//compareTo() compares the first characters of the given container values.
                             // If the compared container's first char is before the second given container's first characters in alphabetical order you will receive
                             //negative values.This method compares the SB objects lexicographically.(acc to the order of alphabetical order)
        System.out.println(r);//2

        a.setCharAt(2, 'n');
        System.out.println(a);//Nana

        //Methods in StringBuffer

        StringBuffer sbf= new StringBuffer("Python");

        System.out.println(sbf.subSequence(2, 4));//th

        System.out.println(sbf);//Python


    }
}
