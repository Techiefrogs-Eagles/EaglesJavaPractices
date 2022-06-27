package src.Practice1.Functionalinterface;

interface School {
    void Seccion();
}

public class Lambda {
    public static void main(String[] args) {
        School S = () -> System.out.println("This is seccion1");
        S.Seccion();

    }

}
