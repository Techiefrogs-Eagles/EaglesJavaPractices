package src.Practice1.Strings;

public class Stringdemo1 {
  static String ss = "hello";
  static String sss = new String("hello");

  public static void main(String[] args) {

    // System.out.println(ss.equalsIgnoreCase(sss));

    String s = "Hello Good Morning11";
    String s1 = "Hello Good Morning";
    String s2 = new String("Hello Good Morning");
    // String s4=new String("Hello Good Morning");

    // System.out.println(s2==s4);
    System.out.println(s.equals(s1));
    System.out.println(s.equals(s2)); // compare to spesific string

    System.out.println(s.equalsIgnoreCase(s1));
    System.out.println(s.equalsIgnoreCase(s2)); // compare to string and uper case to lower case

    System.out.println(s == s1);
    System.out.println(s == s2); // check the condithion & memory alocation

    System.out.println(s.compareTo(s1)); // check the string if same string print 0
    System.out.println(s.compareTo(s2)); // s>s2 positive vaule
    System.out.println(s2.compareTo(s)); // s<s2 negative vaule

    System.out.println(s.compareToIgnoreCase(s1));
    System.out.println(s.compareToIgnoreCase(s2)); // same as compareto but ignore uper cases & lower cases

    String S = s1 + s2;
    System.out.println(S);
    System.out.println(s.concat(s2)); // combination of multiple strings ex(hi+all=hiall)

    System.out.println(s1.substring(6)); // index count values strating with 0
    System.out.println(s1.substring(6, 10)); // including starting and exclusive ending

    System.out.println(s1.toLowerCase()); // convert uper to lower
    System.out.println(s1.toUpperCase()); // convert lower to upper
    System.out.println(s1); // original

    System.out.println(s1.trim()); // trim the spaces

    System.out.println(s1.startsWith("H")); // Check the starting letter with uper or lower and consider a space also
    System.out.println(s1.endsWith("g")); // check the ending letter with uper or lower and splace also

    System.out.println(s2.charAt(6)); // spesified index
    System.out.println(s2.length()); // length of the string count start with 0

    int a = 60;
    String str = String.valueOf(a); // str="60"
    System.out.println(str + 40); // String values always concat

    System.out.println(s1.replace("hello", "Hai")); // replace that particular string
    System.out.println(s1.replaceAll("\\s", "")); // replace that character and remove the spaces

    System.out.println(s1.contains("hello")); // check that particular seqance and print True or False consider with
                                              // space

    String s3 = "";
    System.out.println(s3.isEmpty()); // Check the string is empty or not

    System.out.println(s1 == s2.intern()); // return string from memory it created by a new keyword.
    // It creates an exact copy of the heap string object in the String Constant
    // Pool.

    String str1 = "Hello Hello";
    System.out.println(str1.indexOf("l")); // return the specify character
    System.out.println(str1.indexOf("ll", 5)); // Starting point is changed to 5

  }

}
