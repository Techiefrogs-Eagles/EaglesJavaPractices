//Test a hash setis empty or not 
//here it prints in boolean form of true or false 

        import java.util.HashSet;

public class Program5 {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        //hashSet.add("chair");
        //hashSet.add("table");
        //hashSet.add("Laptop");
        //hashSet.add("Charger");

        //hashSet.add("Pen");


        if(hashSet.isEmpty())
        {
            System.out.println("Empty");
        }
        else{
            System.out.println("Not Empty");
        }
    }
}