import java.util.ArrayList;

public class Program3and4and5 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("S");
        name.add("R");
        name.add("I");
        name.add("BOSS");
        name.add("K");
        name.add("A");
        name.add("R");
        name.add(4,"BABY"); 
        name.remove(3);


        for (String string : name) {
            System.out.println(string);
        }
        System.out.println(name.get(3));
    }
}
    
