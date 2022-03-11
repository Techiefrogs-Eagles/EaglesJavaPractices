import java.util.HashSet;

public class Program16and17 {
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
      editors.removeAll(directors);
      System.out.println("The Film Editors are :--");  
      System.out.println(editors);
      System.out.println(editors.containsAll(directors));
    }
}