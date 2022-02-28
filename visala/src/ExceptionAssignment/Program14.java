package src.ExceptionAssignment;

public class Program14 {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        try{
            System.out.println(a[7]);
        }catch(ArrayIndexOutOfBoundsException Ae)
        {
            System.out.println(a[4]);
        }
    }
    
}
