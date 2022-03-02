package Assignment10;

public class Program12 {
    public static void main(String[] args) {
        int a[]={'A','B','C','D','E','F','G','H'};
        try{
            System.out.println(a['J']);
        }catch(ClassNotFoundException e)
        {
            System.out.println(a['J']);
        }
    }

    
}
