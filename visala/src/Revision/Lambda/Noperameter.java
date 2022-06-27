package src.Revision.Lambda;

interface School {
    void classmethod();
}

/*
 * public class Noperameter {
 * public static void main(String[] args) {
 * Seccion(() -> System.out.println("Seccion 1"));
 * Seccion(() -> System.out.println("Seccion 2"));
 * Seccion(() -> System.out.println("Seccion 3"));
 * Seccion(() -> System.out.println("Seccion 4"));
 * 
 * }
 * 
 * private static void Seccion(School object) {
 * object.classmethod();
 * 
 * }
 * 
 * }
 */
public class Noperameter {
    public static void main(String[] args) {
        School seccion1 = () -> System.out.println("This is secction1");
        seccion1.classmethod();
        School seccion2 = () -> System.out.println("This is secction2");
        seccion2.classmethod();
    }
}
