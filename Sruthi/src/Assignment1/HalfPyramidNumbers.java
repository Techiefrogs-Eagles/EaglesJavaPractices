package Assignment1;

public class HalfPyramidNumbers {
   public static void main(String[] args) {
       int n = 5;
      for(int i = 1; i <= n; i++) // i as rows and j as columns // outer loop runs from 1 to n                                                       s set to 1 to n
        {
            for(int j = 1; j <= i; j++) //inner loop is set from 1 to i
                                                           
            {
                System.out.print(" " +j); // printing columns
            }
                System.out.println(); // To print in Nxt line
        } 
    }
}

