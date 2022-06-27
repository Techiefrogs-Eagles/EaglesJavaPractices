package src.Revision.Lambda;

interface Addition {
    String add(String a, String b);
}

public class Perameter {
    public static void main(String[] args) {
        Addition addition = (a, b) -> (a + b);
        System.out.println(addition.add("Good", " Morning"));
    }

}
