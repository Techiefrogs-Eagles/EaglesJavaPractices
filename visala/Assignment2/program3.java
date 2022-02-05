package Assignment2;

public class program3 {
    public static void main(String[] args) {
        
     int i, j;
    for(i=1; i<=4; i++)
    {
    
     for(j=1; j<=9; j++) 
     {
      if(i == j || j == 5 || i == 10 - j)
       System.out.print("*");
      else
       System.out.print("0");  
     }
     System.out.println();
    }
}
}