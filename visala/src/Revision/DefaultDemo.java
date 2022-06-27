package src.Revision;

interface classes {
    String Telugu();

    String Maths();

    default String English() {
        return "English class ";
    }

    default String Hindi() {
        return "Hindi class";
    }

    static String Social() {
        return "Social class";
    }
}

class shedule implements classes {

    @Override
    public String Telugu() {

        return "Telugu class";
    }

    @Override
    public String Maths() {

        return "Math class";
    }

}

public class DefaultDemo {
    public static void main(String[] args) {
        shedule obj = new shedule();
        System.out.println(obj.English());
        System.out.println(obj.Hindi());
        System.out.println(obj.Maths());
        System.out.println(obj.Telugu());
        System.out.println(classes.Social());

    }
}
