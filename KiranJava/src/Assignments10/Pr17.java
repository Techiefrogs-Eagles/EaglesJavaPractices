package Assignments10;

public class Pr17 {
    public static void main(String[] args) {
        try{
            InstantiationException IE=new InstantiationException("Hello");
            throw IE;

        }catch(InstantiationException IE)
        {
            System.out.println("InstantiationException solved");
        }
    }
}
