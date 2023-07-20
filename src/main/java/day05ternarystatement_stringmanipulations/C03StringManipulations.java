package day05ternarystatement_stringmanipulations;

public class C03StringManipulations {

    public static void main(String[] args) {

        //Example 1: Count the alphabetical characters in a given String
        //Tom Hanks!...

        //If we want to work with a group of data we use "Regular Expressions"(Regex)

        /*
          i) Upper case letters: [A-Z]
          ii) Lower case letters: [a-z]
          iii) All letters: [A-Za-z]
          iv) All digits: [0-9 ]
          v) Letters from m to v : [m-v]
          vi) Regex for a, b, e, d, g, z: [abedgz]

          a)All characters different from uppercase letters : [^A-Z]
          b)All character different from lowercase letters: [^a-z]
          c)All characters different from all letters: [^A-Za-z]
          d) All characters different from digits: [^0-9]
          e) All symbols (different from letters and digits): [^A-Za-z0-9]
          f) All punctuations: \\p{Punct}

          */

        //1.Step:Remove the non-alphabetical characters
        String s1="Tom Hanks!...";

        //Count the number of letters--> length()
      int numOfChar=  s1.replaceAll("[^A-Za-z]", "").length();

        System.out.println(numOfChar);

        //replaceAll() -->it removes a group of data(regex) puts the required characters in place of them
        //length() --> Counts the number of characters in String

        //Example 2: Type code to change all digits to "*" in a given password

        String pwd= "a12b32c";
        System.out.println("pwd = " + pwd);

        String hiddenPwd= pwd.replaceAll("[0-9]", "*");
        System.out.println("hiddenPwd = " + hiddenPwd);
        
        //Example 3: Get initials from a full name (Middle Name is out of scope)
        //            Tom Hanks --> TH  tom hanks --> TH tOm HaNKs--> TH
        
        String name= "   tOm hAnks   ";
        
        //trim() --> removes the extra spaces from the beginning and from the end of a String value.

        System.out.println("name = " + name);
        
        String firstInitial= name.trim().substring(0, 1).toUpperCase();             //tOm HAnks
        System.out.println("firstInitial= " + firstInitial);//T


        String lastInitial= name.trim().split(" ")[1].substring(0, 1).toUpperCase();      //tOm HAnks

        System.out.println("lastInitial = " + lastInitial);

        //substring(starting index, ending index) --> It gets a part of String
        //  starting index is inclusive
        // ending index is exclusive

        //toUpperCase() --> changex all alphabetical characters to upper case
        //split() --> splits a String from the given character and indexes every string as a separate part.
        
        
        
        
        








    }


}
