package Basicpractises;

public class StringPractise {

    public static void main(String[] args) {
        
    

    String str = "nemo is a fish";
    String str1 = "Nemo1";
    String str2 = new String("nemo");

    System.out.println(str.equals(str1));//checks only with the literals
    System.out.println(str.equals(str2));

    System.out.println(str.equalsIgnoreCase(str1));//checks for same literals bit ignores the lower case and upper cases and converts to the same cases
    System.out.println(str.equalsIgnoreCase(str2));

    System.out.println(str == str1);
    System.out.println(str == str2);//checks for different memory locations or not(and also checks for th same reference or not)

    System.out.println(str.compareTo(str1));
    System.out.println(str.compareTo(str2));//gives the result if (same string--->0);(string < another string ---->negative value);(string > another string ----> Positive value)
    
    System.out.println(str.compareToIgnoreCase(str1));
    System.out.println(str.compareToIgnoreCase(str2));//it converts all the literals into lower case and gives the compare value

    System.out.println(str+str1); // add two strings and prints it but it does not save the value.
    System.out.println(str.concat(str1)); // add two strings and prints it but it does not save the value.

    System.out.println(str1.substring(2)); // the index value starts from 0 and prints the string from the given value
    System.out.println(str2.substring(1 , 3));// It prints the index value from 1 till the end value 3

    System.out.println(str.toLowerCase()); //it converts all the characters to lowercases
    System.out.println(str.toUpperCase()); //it converts all the characters to Uppercases

    System.out.println(str.trim()); //It removes all the unwanted spaces inside the semicolum and prints the correct o/p
    System.out.println(str2.trim());

    System.out.println(str.startsWith("n")); //It prints the literal which we have given in the start and end characters and checks the string correct or not
    System.out.println(str.endsWith("o"));

    System.out.println(str.charAt(2));//it prints the character in the given number place
    System.out.println(str.length());

    int i = 5;
    String str3 = String.valueOf(i); //It assigns the value as a string
    System.out.println(str3);
    System.out.println(str2+str3);

    System.out.println(str.replaceFirst("nemo", "Blue whale")); // This replaces the value of the object which we have given
    System.out.println(str.replaceAll("\\s","")); //This also removes the white space from the characters

    System.out.println(str.contains("mo is")); //this checks for the particular  sequence in present in the string or not[if the sequence matches prints TRUE else FALSE]
    
    String str4 = "";
    System.out.println(str4.isEmpty());
    System.out.println(str.isEmpty());

    String str5 = new String("Darks");
    System.out.println(str5.intern());// It creates an exact copy of the heap string object in the String Constant Pool.

    System.out.println(str5.indexOf("k"));//prints the index value of the given input

    String str6 = "Dark Blue Sea Whale";
    System.out.println(str6.indexOf("Se", 6));


    
    







    }
}
