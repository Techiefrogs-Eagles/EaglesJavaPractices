package src.ArrayAssignment;

public class Program41 {
    public static void main(String[] args) {
        String Sarr[]={"Hello","good","morning"};
        String Sarr1[]={"Hi","good","night"};
        
        
        String c[]=new String[Sarr.length+Sarr1.length];
       int temp=0;

        
        for (int i = 0; i < Sarr.length; i++) {
            c[temp]=Sarr[i];
              temp++;

        }
      
      
        for (int i = 0; i < Sarr1.length; i++) {
            c[temp]=Sarr1[i];
              temp++;

        }
        for (String s1: c) {
            System.out.print(s1+" ");

        }
        
        
        
    }
}