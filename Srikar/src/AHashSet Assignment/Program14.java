import java.util.HashSet;

public class Program14 {
    public static void main(String[] args) {
        HashSet<String> editors=new HashSet<>();
      editors.add("Praveen Pudi");
      editors.add("Naveen Nooli");
      editors.add("Kotagiri");
      editors.add("Sreekar Prasad");
      editors.add("Marthanda K Venkatesh");
    

        HashSet<String> directors=new HashSet<>();
        directors.add("Shekar");
        directors.add("Rajamouli");
        directors.add("Anil Ravipudi");

         editors.addAll(directors);
         System.out.println(editors);
    }
}