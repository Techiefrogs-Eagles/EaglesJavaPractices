import java.util.ArrayList;

public class Program6and7 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("S");
        name.add("R");
        name.add("I");
        name.add("Baby");
        name.add("BOSS");
        name.add("K");
        name.add("A");
        name.add("R");
        name.remove(3);


        for (String string : name) {
            System.out.println(string);
        }
        System.out.println(name.contains("BABY"));//For Program7 we will print this statement.
    }
}
    
