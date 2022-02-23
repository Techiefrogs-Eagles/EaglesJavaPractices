package src.ArrayAssignment;

public class Program34 {
    public static void main(String[] args) {
        int[] a=new int[]{10,20,30,40,50};
      int  total=0;
      for (int i = 0; i < a.length; i++) {
          total=total+a[i];
      }
      double avg=total/a.length;

      System.out.println("Average = "+avg);


    }
    
}
