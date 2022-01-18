package Basicpractice;

//using local variable,instance variable and static variable
public class Sampleprogram {
     int var; //instance variable//when instance variable is not assigned it takes a default value which is 0
     static String str = "object variable and local variable";
    public static void main(String[] args) {
       
        int var =300;
        int var1=500;
        String s1= "sruthi";
        String s2= "vinoth";
        System.out.println(s1+s2);

        int var3= var1+var; 
        System.out.println(var);
        System.out.println(var1);
        System.out.println(var3);
     Sampleprogram object = new Sampleprogram();
     Sampleprogram object1= new Sampleprogram();

     object.display(); //method calling
     System.out.println(object);
     System.out.println(object1);// in output it executes an object identifier which created internally

     System.out.println(str+" "+object.var+ "  " +var);

    }
    void display() {
        int var = 900;
        System.out.println(var);
       // System.out.println(str+" "+var); // just tried to call static variable in this display method too
        
     
    }

}
