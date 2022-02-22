package BasicPractises.KssSession;

public class StringConcatenation {
    public static void main(String[]args){

        String s = "Hello";
        String str = "World";
        String  str1 = s.concat(str);
        String str2 = "Hello".concat("World"); //Concat method
        System.out.println(str1);
  String str3 = s + str; //+Operator
  System.out.println(str3);



    }
}
