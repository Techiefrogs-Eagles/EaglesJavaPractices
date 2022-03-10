import java.util.HashSet;

public class Program15 {
    public static void main(String[] args) {
        HashSet<String> fruits=new HashSet<>();
        fruits.add("Mango");
        fruits.add("Bananna");
        fruits.add("PineApple");
        fruits.add("Jackfruit");
        fruits.add("Watermelon");

        HashSet<String> vegetables=new HashSet<>();
        vegetables.add("Carrot");
        vegetables.add("Beetroot");
        vegetables.add("Jackfruit");
        vegetables.add("Bitterguard");
        vegetables.add("Bananna");
        vegetables.add("Apple");

        fruits.retainAll(vegetables);
         System.out.println(fruits);
    }
}