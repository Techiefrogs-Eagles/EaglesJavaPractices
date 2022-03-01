package Assignment10;

public class Program14 {
    public static void main(String[] args) {
        int a[]={'A','B','C','D','E','F','G','H'};
        try{
            System.out.println(a['J']);
        }catch(ArrayIndexOutOfBoundsException Ae)
        {
            System.out.println(a['J']);
        }
    }
    
}
