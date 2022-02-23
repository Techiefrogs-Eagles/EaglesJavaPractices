package src.ArrayAssignment;

public class Program28 {
    public static void main(String[] args) {
        int a[][]={{1,1,1},{2,4,6},{3,3,3}};
        int temp=0;
        int temp1=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]%2==0)
                
                {
                    temp++;
                    
                }
                else
                {
                   temp1++;
                }
              
            }
        }
        System.out.println("Freqency of even no= "+temp);
        System.out.println("Freqency of odd no= "+temp1);
    }
    
}
