package practice;

public class StringPrac 
{
    static String s = "s";
    String k = "S";
    public static void main(String[] args) 
    {
        StringPrac obj = new StringPrac();

        String str1 = "Hello All Hello";
        String str2 = "Hello All Hello";
        String str3 = new String("Hello All Hello");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));

        System.out.println(str1 == str2);
        System.out.println(str1  == str3); // checks different memory locations or not(also checks same string or not)
       

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));// same string --0 ; 1<2 -- negative ; 1>2 -- positive

        System.out.println(str2.compareToIgnoreCase(str1));
        System.out.println(str1.compareToIgnoreCase(str3));// same as compareTo but ignores case

        System.out.println(str1+str2);  // add the strings and print's it. but does not save the value
        System.out.println(str2.concat(str3));  // add the strings and print's it. but does not save the value

        System.out.println(str2.substring(3)); // assign index from 0 and prints the String from that(3) index 
        System.out.println(str3.substring(6, 9)); // assign index from 0 and prints the String from 6 to endindex(9-1)

        System.out.println(str1.toLowerCase()); // convert all the characterters to lowercase
        System.out.println(str1.toUpperCase()); // convert all the characterters to uppercase

        System.out.println(str1.trim()); // trims the rare and front most spaces and gives the output

        System.out.println(str1.startsWith("Hel")); // checks the string starting chars matches with the given string( considers white spaces also)
        System.out.println(str3.endsWith("p")); //checks the string ending chars matches with the given string( considers white spaces also)

        System.out.println(str1.charAt(3)); // prints the value at that particular index        

        System.out.println(str1.length()); // prints the length of the string

        //int a = 10;
        String str4 = String.valueOf(10); // assigns the input value as a string 
        //String str4 = "10";
        System.out.println(str4+str1);   

        System.out.println(str1.replace("Hello", "Hai")); // replaces the String
        System.out.println(str1.replaceAll("\\s", "p"));

        System.out.println(str1.contains("o All")); // checks if that particular sequence is present in the string

        String str5 = new String("lakshmans");
        System.out.println(str5.isEmpty()); // checks if the particular string is empty or not 

        System.out.println(str5.intern()); // String str5 = "lakshman"; //  if .intern() is used implicitly this is done

        System.out.println(str5.indexOf('s')); // prints the index value of the given char only considers the first encounter

        String str6 = "lakshman lakshmi";
        System.out.println(str6.indexOf("hm", 6));

        
        System.out.println(obj.k.equalsIgnoreCase(s));
         System.out.println(str6.substring(0, 4));


    }
}
